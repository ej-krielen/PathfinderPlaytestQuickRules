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
            RulesModel rules = new RulesModel(context.getString(R.string.title_arrest_a_fall), context.getString(R.string.text_arrest_a_fall));
            rules.setTrigger(context.getString(R.string.trigger_arrest_a_fall));
            rules.setRequirement(context.getString(R.string.requirement_arrest_a_fall));
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_arrest_a_fall), rules));
        }
        if (sharedPref.getBoolean("pref_breathe_deep", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_breathe_deep), context.getString(R.string.text_breathe_deep));
            rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_breathe_deep), rules));
        }
        if (sharedPref.getBoolean("pref_burrow", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_burrow), context.getString(R.string.text_burrow));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
            rules.setRequirement(context.getString(R.string.requirement_burrow));
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_burrow), rules));
        }
        if (sharedPref.getBoolean("pref_fly", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_fly), context.getString(R.string.text_fly));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
            rules.setRequirement(context.getString(R.string.requirement_fly));
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_fly), rules));
        }
        if (sharedPref.getBoolean("pref_mount", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_mount), context.getString(R.string.text_mount));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
            rules.setRequirement(context.getString(R.string.requirement_mount));
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_mount), rules));
            //TODO add handle animal skill action
        }
        if (sharedPref.getBoolean("pref_point_out", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_point_out), context.getString(R.string.text_point_out));
            rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
            rules.addTrait(context.getString(R.string.title_visual), context.getString(R.string.text_visual), context);
            rules.setRequirement(context.getString(R.string.requirement_point_out));
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_point_out), rules));
        }
        if (sharedPref.getBoolean("pref_raise_a_shield", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_raise_a_shield), context.getString(R.string.text_raise_a_shield));
            rules.setRequirement(context.getString(R.string.requirement_raise_a_shield));
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_raise_a_shield), rules));
        }
        if (sharedPref.getBoolean("pref_shield_block", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_shield_block), context.getString(R.string.text_shield_block));
            rules.setTrigger(context.getString(R.string.trigger_shield_block));
            specialActionsRules.add(new NavItemModel(context.getString(R.string.title_shield_block), rules));
        }
        return specialActionsRules;
    }
}