package nl.rekijan.pathfinderplaytestquickrules.ui.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import nl.rekijan.pathfinderplaytestquickrules.R;

/**
 * Custom class to create custom layout
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 27-3-2016
 */
public class BorderedLinearLayout extends LinearLayout {

    public BorderedLinearLayout(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.bordered_layout, this, true);
    }

    public void setTitle(String title) {
        TextView tv = (TextView) findViewById(R.id.bordered_layout_title);
        tv.setText(title);
    }

    public void setText(String text) {
        TextView tv = (TextView) findViewById(R.id.bordered_layout_text);
        tv.setText(text);
    }
}