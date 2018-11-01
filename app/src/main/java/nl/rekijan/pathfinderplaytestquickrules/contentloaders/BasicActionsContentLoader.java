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
public class BasicActionsContentLoader {


    private static BasicActionsContentLoader sInstance = null;

    public static synchronized BasicActionsContentLoader getInstance() {
        if (sInstance == null) {
            sInstance = new BasicActionsContentLoader();
        }
        return sInstance;
    }

    public List<NavItemModel> getBasicActionsContent(Context context, SharedPreferences sharedPref) {
        List<NavItemModel> basicActions = new ArrayList<>();
        if (sharedPref.getBoolean("pref_aid", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_aid), context.getString(R.string.text_aid));
            rules.setTrigger(context.getString(R.string.trigger_aid));
            rules.setRequirement(context.getString(R.string.requirement_aid));
            basicActions.add(new NavItemModel(context.getString(R.string.title_aid), rules));
        }
        if (sharedPref.getBoolean("pref_assist", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_assist), context.getString(R.string.text_assist));
            rules.setRequirement(context.getString(R.string.requirement_assist));
            rules.addTrait(context.getString(R.string.title_attack), context.getString(R.string.text_attack), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_assist), rules));
        }
        if (sharedPref.getBoolean("pref_crawl", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_crawl), context.getString(R.string.text_crawl));
            rules.setRequirement(context.getString(R.string.requirement_crawl));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_crawl), rules));
        }
        if (sharedPref.getBoolean("pref_delay", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_delay), context.getString(R.string.text_delay));
            rules.setTrigger(context.getString(R.string.trigger_delay));
            basicActions.add(new NavItemModel(context.getString(R.string.title_delay), rules ));
        }
        if (sharedPref.getBoolean("pref_drop", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_drop), context.getString(R.string.text_drop));
            rules.setTrigger(context.getString(R.string.trigger_drop));
            rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_drop), rules));
        }
        if (sharedPref.getBoolean("pref_drop_prone", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_drop_prone), context.getString(R.string.text_drop_prone));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move),context);
            rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_drop_prone), rules));
        }
        if (sharedPref.getBoolean("pref_interact", true)) {
            RulesModel interactRules = new RulesModel(context.getString(R.string.title_interact), context.getString(R.string.text_interact));
            interactRules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_interact), interactRules));
        }
        if (sharedPref.getBoolean("pref_leap", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_leap), context.getString(R.string.text_leap));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_leap), rules));
        }
        if (sharedPref.getBoolean("pref_ready", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_ready), context.getString(R.string.text_ready));
            rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_ready), rules));
        }
        if (sharedPref.getBoolean("pref_seek", true)) {
            RulesModel seekRules = new RulesModel(context.getString(R.string.title_seek), context.getString(R.string.text_seek));
            seekRules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
            seekRules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_seek), seekRules));
        }
        if (sharedPref.getBoolean("pref_stand", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_stand), context.getString(R.string.text_stand));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_stand), rules));
        }
        if (sharedPref.getBoolean("pref_step", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_step), context.getString(R.string.text_step));
            rules.setRequirement(context.getString(R.string.requirement_step));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move),context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_step), rules));
        }
        if (sharedPref.getBoolean("pref_stride", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_stride), context.getString(R.string.text_stride));
            rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_stride), rules));
        }
        if (sharedPref.getBoolean("pref_strike", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_strike), context.getString(R.string.text_strike));
            rules.addTrait(context.getString(R.string.title_attack), context.getString(R.string.text_attack), context);
            basicActions.add(new NavItemModel(context.getString(R.string.title_strike), rules));
        }
        if (sharedPref.getBoolean("pref_take_cover", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_take_cover), context.getString(R.string.text_take_cover));
            rules.setRequirement(context.getString(R.string.requirement_take_cover));
            basicActions.add(new NavItemModel(context.getString(R.string.title_take_cover), rules));
        }
        return basicActions;
    }
}