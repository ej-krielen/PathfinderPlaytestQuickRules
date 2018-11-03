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
public class AfflictionRulesContentLoader {


    private static AfflictionRulesContentLoader sInstance = null;

    public static synchronized AfflictionRulesContentLoader getInstance() {
        if (sInstance == null) {
            sInstance = new AfflictionRulesContentLoader();
        }
        return sInstance;
    }

    public List<NavItemModel> getAfflictionRulesContent(Context context, SharedPreferences sharedPref) {
        List<NavItemModel> afflictionRules = new ArrayList<>();
        if (sharedPref.getBoolean("pref_saving_throw", true)) {
            afflictionRules.add(new NavItemModel(context.getString(R.string.title_saving_throw), new
                    RulesModel(context.getString(R.string.title_saving_throw), context.getString(R.string.text_saving_throw))));
        }
        if (sharedPref.getBoolean("pref_onset", true)) {
            afflictionRules.add(new NavItemModel(context.getString(R.string.title_onset), new
                    RulesModel(context.getString(R.string.title_onset), context.getString(R.string.text_onset))));
        }
        if (sharedPref.getBoolean("pref_maximum_duration", true)) {
            afflictionRules.add(new NavItemModel(context.getString(R.string.title_maximum_duration), new
                    RulesModel(context.getString(R.string.title_maximum_duration), context.getString(R.string.text_maximum_duration))));
        }
        if (sharedPref.getBoolean("pref_stages", true)) {
            afflictionRules.add(new NavItemModel(context.getString(R.string.title_stages), new
                    RulesModel(context.getString(R.string.title_stages), context.getString(R.string.text_stages))));
        }
        if (sharedPref.getBoolean("pref_conditions_from_afflictions", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_conditions_from_afflictions), context.getString(R.string.text_conditions_from_afflictions));
            rules.addNote(context.getString(R.string.title_flat_check), context.getString(R.string.text_flat_check), context);
            afflictionRules.add(new NavItemModel(context.getString(R.string.title_conditions_from_afflictions), rules));
        }
        if (sharedPref.getBoolean("pref_multiple_exposures", true)) {
            afflictionRules.add(new NavItemModel(context.getString(R.string.title_multiple_exposures), new
                    RulesModel(context.getString(R.string.title_multiple_exposures), context.getString(R.string.text_multiple_exposures))));
        }
        if (sharedPref.getBoolean("pref_virulent_afflictions", true)) {
            afflictionRules.add(new NavItemModel(context.getString(R.string.title_virulent_afflictions), new
                    RulesModel(context.getString(R.string.title_virulent_afflictions), context.getString(R.string.text_virulent_afflictions))));
        }
        return afflictionRules;
    }
}