package nl.rekijan.pathfinderplaytestquickrules.contentloaders;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import nl.rekijan.pathfinderplaytestquickrules.R;
import nl.rekijan.pathfinderplaytestquickrules.models.NavItemModel;
import nl.rekijan.pathfinderplaytestquickrules.models.RulesModel;

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
            encounterMode.add(new NavItemModel(context.getString(R.string.title_start_your_turn), new
                    RulesModel(context.getString(R.string.title_start_your_turn), context.getString(R.string.text_start_your_turn))));
        }
        if (sharedPref.getBoolean("pref_pref_end_your_turn", true)) {
            encounterMode.add(new NavItemModel(context.getString(R.string.title_end_your_turn), new
                    RulesModel(context.getString(R.string.title_end_your_turn), context.getString(R.string.text_end_your_turn))));
        }
        return encounterMode;
    }
}