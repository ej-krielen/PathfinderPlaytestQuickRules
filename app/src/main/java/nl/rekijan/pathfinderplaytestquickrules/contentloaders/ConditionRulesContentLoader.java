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
public class ConditionRulesContentLoader {


    private static ConditionRulesContentLoader sInstance = null;

    public static synchronized ConditionRulesContentLoader getInstance() {
        if (sInstance == null) {
            sInstance = new ConditionRulesContentLoader();
        }
        return sInstance;
    }

    public List<NavItemModel> getConditionRulesContent(Context context, SharedPreferences sharedPref) {
        List<NavItemModel> conditionRules = new ArrayList<>();
        if (sharedPref.getBoolean("pref_condition_values", true)) {
            conditionRules.add(new NavItemModel(context.getString(R.string.title_condition_values), new
                    RulesModel(context.getString(R.string.title_condition_values), context.getString(R.string.text_condition_values))));
        }
        if (sharedPref.getBoolean("pref_redundant_conditions", true)) {
            conditionRules.add(new NavItemModel(context.getString(R.string.title_redundant_conditions), new
                    RulesModel(context.getString(R.string.title_redundant_conditions), context.getString(R.string.text_redundant_conditions))));
        }
        if (sharedPref.getBoolean("pref_overriding_conditions", true)) {
            conditionRules.add(new NavItemModel(context.getString(R.string.title_overriding_conditions), new
                    RulesModel(context.getString(R.string.title_overriding_conditions), context.getString(R.string.text_overriding_conditions))));
        }
        if (sharedPref.getBoolean("pref_counteracting_conditions", true)) {
            conditionRules.add(new NavItemModel(context.getString(R.string.title_counteracting_conditions), new
                    RulesModel(context.getString(R.string.title_counteracting_conditions), context.getString(R.string.text_counteracting_conditions))));
        }
        if (sharedPref.getBoolean("pref_bolstered", true)) {
            conditionRules.add(new NavItemModel(context.getString(R.string.title_bolstered), new
                    RulesModel(context.getString(R.string.title_bolstered), context.getString(R.string.text_bolstered))));
        }
        if (sharedPref.getBoolean("pref_altering_actions", true)) {
            conditionRules.add(new NavItemModel(context.getString(R.string.title_altering_actions), new
                    RulesModel(context.getString(R.string.title_altering_actions), context.getString(R.string.text_altering_actions))));
        }
        if (sharedPref.getBoolean("pref_speed_reduction", true)) {
            conditionRules.add(new NavItemModel(context.getString(R.string.title_speed_reduction), new
                    RulesModel(context.getString(R.string.title_speed_reduction), context.getString(R.string.text_speed_reduction))));
        }
        return conditionRules;
    }
}