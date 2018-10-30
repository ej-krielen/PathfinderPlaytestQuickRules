package nl.rekijan.pathfinderplaytestquickrules.models;


import nl.rekijan.pathfinderplaytestquickrules.ui.dialogs.CustomDialogFragment;

/**
 * Custom class to set fields for Trait
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 27-3-2016
 */
public class TraitModel {
    private String text;
    private CustomDialogFragment dialogFragment;

    public TraitModel(String text) {
        this.text = text;
    }

    public TraitModel(String text, CustomDialogFragment dialogFragment) {
        this.text = text;
        this.dialogFragment = dialogFragment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CustomDialogFragment getDialogFragment() {
        return dialogFragment;
    }

    public void setDialogFragment(CustomDialogFragment dialogFragment) {
        this.dialogFragment = dialogFragment;
    }
}