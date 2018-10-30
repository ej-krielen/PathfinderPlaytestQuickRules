package nl.rekijan.pathfinderplaytestquickrules.ui.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import nl.rekijan.pathfinderplaytestquickrules.R;
import nl.rekijan.pathfinderplaytestquickrules.ui.dialogs.CustomDialogFragment;

/**
 * Custom class to create custom layout
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 27-3-2016
 */
public class TraitLinearLayout extends LinearLayout {
    public interface OnTraitPressedListener {
        void onTraitPressed(CustomDialogFragment dialogFragment);
    }

    private OnTraitPressedListener mListener;

    public TraitLinearLayout(Context context) {
        super(context);
        if (context instanceof OnTraitPressedListener) {
            mListener = (OnTraitPressedListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnTraitPressedListener");
        }
        LayoutInflater.from(context).inflate(R.layout.trait_layout, this, true);
    }

    public void setNavigationClickListener(final CustomDialogFragment dialogFragment) {
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onTraitPressed(dialogFragment);
                }
            }
        });
    }

    public void setText(String traitText) {
        TextView tv = (TextView) findViewById(R.id.trait_textView);
        tv.setText(traitText);
    }
}