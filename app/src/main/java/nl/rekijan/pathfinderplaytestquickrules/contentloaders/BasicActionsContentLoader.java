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
            basicActions.add(new NavItemModel(context.getString(R.string.title_aid), new
                    RulesModel(context.getString(R.string.title_aid), context.getString(R.string.text_aid))));
        }
        if (sharedPref.getBoolean("pref_assist", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_assist), new
                    RulesModel(context.getString(R.string.title_assist), context.getString(R.string.text_assist))));
        }
        if (sharedPref.getBoolean("pref_crawl", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_crawl), new
                    RulesModel(context.getString(R.string.title_crawl), context.getString(R.string.text_crawl))));
        }
        if (sharedPref.getBoolean("pref_delay", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_delay), new
                    RulesModel(context.getString(R.string.title_delay), context.getString(R.string.text_delay))));
        }
        if (sharedPref.getBoolean("pref_drop", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_drop), new
                    RulesModel(context.getString(R.string.title_drop), context.getString(R.string.text_drop))));
        }
        if (sharedPref.getBoolean("pref_drop_prone", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_drop_prone), new
                    RulesModel(context.getString(R.string.title_drop_prone), context.getString(R.string.text_drop_prone))));
        }
        if (sharedPref.getBoolean("pref_interact", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_interact), new
                    RulesModel(context.getString(R.string.title_interact), context.getString(R.string.text_interact))));
        }
        if (sharedPref.getBoolean("pref_leap", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_leap), new
                    RulesModel(context.getString(R.string.title_leap), context.getString(R.string.text_leap))));
        }
        if (sharedPref.getBoolean("pref_ready", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_ready), new
                    RulesModel(context.getString(R.string.title_ready), context.getString(R.string.text_ready))));
        }
        if (sharedPref.getBoolean("pref_seek", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_seek), new
                    RulesModel(context.getString(R.string.title_seek), context.getString(R.string.text_seek))));
        }
        if (sharedPref.getBoolean("pref_stand", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_stand), new
                    RulesModel(context.getString(R.string.title_stand), context.getString(R.string.text_stand))));
        }
        if (sharedPref.getBoolean("pref_step", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_step), new
                    RulesModel(context.getString(R.string.title_step), context.getString(R.string.text_step))));
        }
        if (sharedPref.getBoolean("pref_stride", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_stride), new
                    RulesModel(context.getString(R.string.title_stride), context.getString(R.string.text_stride))));
        }
        if (sharedPref.getBoolean("pref_strike", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_strike), new
                    RulesModel(context.getString(R.string.title_strike), context.getString(R.string.text_strike))));
        }
        if (sharedPref.getBoolean("pref_take_cover", true)) {
            basicActions.add(new NavItemModel(context.getString(R.string.title_take_cover), new
                    RulesModel(context.getString(R.string.title_take_cover), context.getString(R.string.text_take_cover))));
        }
        return basicActions;
    }
}