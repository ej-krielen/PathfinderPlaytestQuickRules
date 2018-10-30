package nl.rekijan.pathfinderplaytestquickrules.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import nl.rekijan.pathfinderplaytestquickrules.utilities.NavigationHandler;

/**
 * Custom class to set fields for Rules
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 24-10-2018
 */
public class RulesModel implements Parcelable {

    private String title;
    private String text;
    private String requirement;
    private String trigger;
    private List<NoteModel> notes;
    private List<TraitModel> traits;
    private String errorMessage;

    public RulesModel (String title, String text){
        this.title = title;
        this.text = text;
        notes = new ArrayList<>();
        traits = new ArrayList<>();
    }

    private RulesModel(Parcel in) {
        title = in.readString();
        text = in.readString();
    }

    //Parcelable region
    public static final Creator<RulesModel> CREATOR = new Creator<RulesModel>() {
        @Override
        public RulesModel createFromParcel(Parcel in) {
            return new RulesModel(in);
        }

        @Override
        public RulesModel[] newArray(int size) {
            return new RulesModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(text);
    }
    //End Parcelable region

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addNote(String title, String text, Context context)
    {
        notes.add(new NoteModel(title, NavigationHandler.getInstance(context).createDialogFragment(title, text)));
    }

    public List<NoteModel> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteModel> notes) {
        this.notes = notes;
    }

    public void addTrait(String title, String text, Context context)
    {
        traits.add(new TraitModel(title, NavigationHandler.getInstance(context).createDialogFragment(title, text)));
    }

    public List<TraitModel> getTraits() { return traits;}

    public void setTraits(List<TraitModel> traits) { this.traits = traits; }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
}