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
public class TextLinearLayout extends LinearLayout {

    public TextLinearLayout(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.text_layout, this, true);
    }

    public void setText(String answerText) {
        TextView tv = (TextView) findViewById(R.id.text_textView);
        tv.setText(answerText);
    }
}