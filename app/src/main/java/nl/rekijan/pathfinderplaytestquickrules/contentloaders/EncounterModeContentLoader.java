package nl.rekijan.pathfinderplaytestquickrules.contentloaders;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nl.rekijan.pathfinderplaytestquickrules.R;
import nl.rekijan.pathfinderplaytestquickrules.models.NavItemModel;
import nl.rekijan.pathfinderplaytestquickrules.models.NoteModel;
import nl.rekijan.pathfinderplaytestquickrules.models.RulesModel;
import nl.rekijan.pathfinderplaytestquickrules.utilities.NavigationHandler;

/**
 * Content for the conditions
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 25-10-2018
 */
public class EncounterModeContentLoader {


    private static EncounterModeContentLoader sInstance = null;

    public static synchronized EncounterModeContentLoader getInstance() {
        if (sInstance == null) {
            sInstance = new EncounterModeContentLoader();
        }
        return sInstance;
    }

    public List<NavItemModel> getEncounterModeContent(Context context, SharedPreferences sharedPref) {
        List<NavItemModel> encounterMode = new ArrayList<>();
        if (sharedPref.getBoolean("pref_initiative", true)) {
            encounterMode.add(new NavItemModel(context.getString(R.string.title_initiative), new
                    RulesModel(context.getString(R.string.title_initiative), context.getString(R.string.text_initiative))));
        }
        if (sharedPref.getBoolean("pref_pref_start_your_turn", true)) {
            RulesModel startRules = new RulesModel(context.getString(R.string.title_start_your_turn), context.getString(R.string.text_start_your_turn));
            NoteModel dyingNote = new NoteModel(context.getString(R.string.title_dying),
                    NavigationHandler.getInstance(context).createDialogFragment(context.getString(R.string.title_dying), context.getString(R.string.text_dying)));
            startRules.setNotes(Collections.singletonList(dyingNote));
            encounterMode.add(new NavItemModel(context.getString(R.string.title_start_your_turn), startRules));
        }
        if (sharedPref.getBoolean("pref_pref_end_your_turn", true)) {
            RulesModel endRules = new RulesModel(context.getString(R.string.title_end_your_turn), context.getString(R.string.text_end_your_turn));
            encounterMode.add(new NavItemModel(context.getString(R.string.title_end_your_turn), endRules));
            //TODO add concentrate on spell note
        }
        return encounterMode;
    }
}