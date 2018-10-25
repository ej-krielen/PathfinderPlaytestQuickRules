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
public class SpecialActionsContentLoader {


    private static SpecialActionsContentLoader sInstance = null;

    public static synchronized SpecialActionsContentLoader getInstance() {
        if (sInstance == null) {
            sInstance = new SpecialActionsContentLoader();
        }
        return sInstance;
    }

    public List<NavItemModel> getSpecialActionsContent(Context context, SharedPreferences sharedPref) {
        List<NavItemModel> specialActionsRules = new ArrayList<>();
        if (sharedPref.getBoolean("pref_arrest_a_fall", true)) {
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_arrest_a_fall), new
                    RulesModel(context.getString(R.string.title_arrest_a_fall), context.getString(R.string.text_arrest_a_fall))));
        }
        if (sharedPref.getBoolean("pref_breahte_deep", true)) {
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_breahte_deep), new
                    RulesModel(context.getString(R.string.title_breahte_deep), context.getString(R.string.text_breahte_deep))));
        }
        if (sharedPref.getBoolean("pref_burrow", true)) {
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_burrow), new
                    RulesModel(context.getString(R.string.title_burrow), context.getString(R.string.text_burrow))));
        }
        if (sharedPref.getBoolean("pref_fly", true)) {
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_fly), new
                    RulesModel(context.getString(R.string.title_fly), context.getString(R.string.text_fly))));
        }
        if (sharedPref.getBoolean("pref_mount", true)) {
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_mount), new
                    RulesModel(context.getString(R.string.title_mount), context.getString(R.string.text_mount))));
        }
        if (sharedPref.getBoolean("pref_point_out", true)) {
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_point_out), new
                    RulesModel(context.getString(R.string.title_point_out), context.getString(R.string.text_point_out))));
        }
        if (sharedPref.getBoolean("pref_raise_a_shield", true)) {
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_raise_a_shield), new
                    RulesModel(context.getString(R.string.title_raise_a_shield), context.getString(R.string.text_raise_a_shield))));
        }
        if (sharedPref.getBoolean("pref_shield_block", true)) {
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_shield_block), new
                    RulesModel(context.getString(R.string.title_shield_block), context.getString(R.string.text_shield_block))));
        }
        return specialActionsRules;
    }
}