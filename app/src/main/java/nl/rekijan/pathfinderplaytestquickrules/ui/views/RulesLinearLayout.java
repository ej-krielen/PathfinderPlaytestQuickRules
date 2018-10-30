package nl.rekijan.pathfinderplaytestquickrules.ui.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.List;

import nl.rekijan.pathfinderplaytestquickrules.R;
import nl.rekijan.pathfinderplaytestquickrules.models.NoteModel;
import nl.rekijan.pathfinderplaytestquickrules.models.RulesModel;
import nl.rekijan.pathfinderplaytestquickrules.models.TraitModel;

/**
 * Custom class to create custom layout
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 27-3-2016
 */
public class RulesLinearLayout extends LinearLayout {
    private Context mContext;

    public RulesLinearLayout(Context context) {
        super(context);
    }

    public RulesLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mContext = context;
    }

    public void addRulesToLayout(RulesModel rulesModel) {
        if (!TextUtils.isEmpty(rulesModel.getErrorMessage())) {
            displayError(rulesModel.getErrorMessage());
            return;
        }

        if (!TextUtils.isEmpty(rulesModel.getTitle()))
            addTitle(rulesModel.getTitle());
        if (rulesModel.getTraits() != null && rulesModel.getTraits().size() > 0)
            addTraits(rulesModel.getTraits());
        if (!TextUtils.isEmpty(rulesModel.getTrigger()))
            addTrigger(rulesModel.getTrigger());
        if (!TextUtils.isEmpty(rulesModel.getRequirement()))
            addRequirement(rulesModel.getRequirement());
        if (!TextUtils.isEmpty(rulesModel.getText()))
            addText(rulesModel.getText());
        if (rulesModel.getNotes() != null && rulesModel.getNotes().size() > 0)
            addNotes(rulesModel.getNotes());
    }

    private void displayError(String errorMessage) {
        HeaderLinearLayout header = new HeaderLinearLayout(mContext);
        header.setText(mContext.getString(R.string.error_title));
        this.addView(header);
        ErrorLinearLayout errorLayout = new ErrorLinearLayout(mContext);
        errorLayout.setText(errorMessage);
        this.addView(errorLayout);
    }

    private void addTitle(String title) {
        TitleLinearLayout titleLayout = new TitleLinearLayout(mContext);
        titleLayout.setText(title);
        this.addView(titleLayout);
    }

    private void addRequirement(String requirement) {
        BorderedLinearLayout requirementLayout = new BorderedLinearLayout(mContext);
        requirementLayout.setTitle(mContext.getString(R.string.requirement_title));
        requirementLayout.setText(requirement);
        this.addView(requirementLayout);
    }

    private void addTrigger(String trigger) {
        BorderedLinearLayout triggerLayout = new BorderedLinearLayout(mContext);
        triggerLayout.setTitle(mContext.getString(R.string.trigger_title));
        triggerLayout.setText(trigger);
        this.addView(triggerLayout);
    }

    private void addTraits(List<TraitModel> traits) {
        LinearLayout horizontalParent = new LinearLayout(mContext);
        horizontalParent.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        horizontalParent.setOrientation(LinearLayout.HORIZONTAL);

        for (TraitModel trait : traits) {
            TraitLinearLayout traitLayout = new TraitLinearLayout(mContext);
            traitLayout.setText(trait.getText());
            if (trait.getDialogFragment() != null)
                traitLayout.setNavigationClickListener(trait.getDialogFragment());
            horizontalParent.addView(traitLayout);
        }

        this.addView(horizontalParent);
    }

    private void addText(String text) {
        TextLinearLayout answerLayout = new TextLinearLayout(mContext);
        answerLayout.setText(text);
        this.addView(answerLayout);
    }

    private void addNotes(List<NoteModel> notes) {
        HeaderLinearLayout header = new HeaderLinearLayout(mContext);
        header.setText(mContext.getString(R.string.notes_title));
        this.addView(header);
        for (NoteModel note : notes) {
            NoteLinearLayout noteLayout = new NoteLinearLayout(mContext);
            noteLayout.setText(note.getText());
            if (note.getDialogFragment() != null)
                noteLayout.setNavigationClickListener(note.getDialogFragment());
            this.addView(noteLayout);
        }
    }
}