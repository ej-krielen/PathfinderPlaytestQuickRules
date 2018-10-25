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
public class ConditionsContentLoader {


    private static ConditionsContentLoader sInstance = null;

    public static synchronized ConditionsContentLoader getInstance() {
        if (sInstance == null) {
            sInstance = new ConditionsContentLoader();
        }
        return sInstance;
    }

    public List<NavItemModel> getConditionsContent(Context context, SharedPreferences sharedPref) {
        List<NavItemModel> conditions = new ArrayList<>();
        if (sharedPref.getBoolean("pref_accelerated", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_accelerated), new
                    RulesModel(context.getString(R.string.title_accelerated), context.getString(R.string.text_accelerated))));
        }
        if (sharedPref.getBoolean("pref_asleep", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_asleep), new
                    RulesModel(context.getString(R.string.title_asleep), context.getString(R.string.text_asleep))));
        }
        if (sharedPref.getBoolean("pref_asleep", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_asleep), new
                    RulesModel(context.getString(R.string.title_asleep), context.getString(R.string.text_asleep))));
        }
        if (sharedPref.getBoolean("pref_blinded", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_blinded), new
                    RulesModel(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded))));
        }
        if (sharedPref.getBoolean("pref_broken", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_broken), new
                    RulesModel(context.getString(R.string.title_broken), context.getString(R.string.text_broken))));
        }
        if (sharedPref.getBoolean("pref_concealed", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_concealed), new
                    RulesModel(context.getString(R.string.title_concealed), context.getString(R.string.text_concealed))));
        }
        if (sharedPref.getBoolean("pref_confused", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_confused), new
                    RulesModel(context.getString(R.string.title_confused), context.getString(R.string.text_confused))));
        }
        if (sharedPref.getBoolean("pref_dazzled", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_dazzled), new
                    RulesModel(context.getString(R.string.title_dazzled), context.getString(R.string.text_dazzled))));
        }
        if (sharedPref.getBoolean("pref_dead", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_dead), new
                    RulesModel(context.getString(R.string.title_dead), context.getString(R.string.text_dead))));
        }
        if (sharedPref.getBoolean("pref_deafened", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_deafened), new
                    RulesModel(context.getString(R.string.title_deafened), context.getString(R.string.text_deafened))));
        }
        if (sharedPref.getBoolean("pref_drained", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_drained), new
                    RulesModel(context.getString(R.string.title_drained), context.getString(R.string.text_drained))));
        }
        if (sharedPref.getBoolean("pref_dying", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_dying), new
                    RulesModel(context.getString(R.string.title_dying), context.getString(R.string.text_dying))));
        }
        if (sharedPref.getBoolean("pref_encumbered", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_encumbered), new
                    RulesModel(context.getString(R.string.title_encumbered), context.getString(R.string.text_encumbered))));
        }
        if (sharedPref.getBoolean("pref_enervated", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_enervated), new
                    RulesModel(context.getString(R.string.title_enervated), context.getString(R.string.text_enervated))));
        }
        if (sharedPref.getBoolean("pref_enfeebled", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_enfeebled), new
                    RulesModel(context.getString(R.string.title_enfeebled), context.getString(R.string.text_enfeebled))));
        }
        if (sharedPref.getBoolean("pref_entangled", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_entangled), new
                    RulesModel(context.getString(R.string.title_entangled), context.getString(R.string.text_entangled))));
        }
        if (sharedPref.getBoolean("pref_fascinated", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_fascinated), new
                    RulesModel(context.getString(R.string.title_fascinated), context.getString(R.string.text_fascinated))));
        }
        if (sharedPref.getBoolean("pref_fatigued", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_fatigued), new
                    RulesModel(context.getString(R.string.title_fatigued), context.getString(R.string.text_fatigued))));
        }
        if (sharedPref.getBoolean("pref_fleeing", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_fleeing), new
                    RulesModel(context.getString(R.string.title_fleeing), context.getString(R.string.text_fleeing))));
        }
        if (sharedPref.getBoolean("pref_frightened", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_frightened), new
                    RulesModel(context.getString(R.string.title_frightened), context.getString(R.string.text_frightened))));
        }
        if (sharedPref.getBoolean("pref_grabbed", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_grabbed), new
                    RulesModel(context.getString(R.string.title_grabbed), context.getString(R.string.text_grabbed))));
        }
        if (sharedPref.getBoolean("pref_hampered", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_hampered), new
                    RulesModel(context.getString(R.string.title_hampered), context.getString(R.string.text_hampered))));
        }
        if (sharedPref.getBoolean("pref_immobile", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_immobile), new
                    RulesModel(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile))));
        }
        if (sharedPref.getBoolean("pref_paralyzed", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_paralyzed), new
                    RulesModel(context.getString(R.string.title_paralyzed), context.getString(R.string.text_paralyzed))));
        }
        if (sharedPref.getBoolean("pref_persistent_damage", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_persistent_damage), new
                    RulesModel(context.getString(R.string.title_persistent_damage), context.getString(R.string.text_persistent_damage))));
        }
        if (sharedPref.getBoolean("pref_petrified", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_petrified), new
                    RulesModel(context.getString(R.string.title_petrified), context.getString(R.string.text_petrified))));
        }
        if (sharedPref.getBoolean("pref_prone", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_prone), new
                    RulesModel(context.getString(R.string.title_prone), context.getString(R.string.text_prone))));
        }
        if (sharedPref.getBoolean("pref_quick", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_quick), new
                    RulesModel(context.getString(R.string.title_quick), context.getString(R.string.text_quick))));
        }
        if (sharedPref.getBoolean("pref_restrained", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_restrained), new
                    RulesModel(context.getString(R.string.title_restrained), context.getString(R.string.text_restrained))));
        }
        if (sharedPref.getBoolean("pref_sensed", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_sensed), new
                    RulesModel(context.getString(R.string.title_sensed), context.getString(R.string.text_sensed))));
        }
        if (sharedPref.getBoolean("pref_sick", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_sick), new
                    RulesModel(context.getString(R.string.title_sick), context.getString(R.string.text_sick))));
        }
        if (sharedPref.getBoolean("pref_slowed", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_slowed), new
                    RulesModel(context.getString(R.string.title_slowed), context.getString(R.string.text_slowed))));
        }
        if (sharedPref.getBoolean("pref_stunned", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_stunned), new
                    RulesModel(context.getString(R.string.title_stunned), context.getString(R.string.text_stunned))));
        }
        if (sharedPref.getBoolean("pref_stupefied", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_stupefied), new
                    RulesModel(context.getString(R.string.title_stupefied), context.getString(R.string.text_stupefied))));
        }
        if (sharedPref.getBoolean("pref_unconscious", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_unconscious), new
                    RulesModel(context.getString(R.string.title_unconscious), context.getString(R.string.text_unconscious))));
        }
        if (sharedPref.getBoolean("pref_wounded", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_wounded), new
                    RulesModel(context.getString(R.string.title_wounded), context.getString(R.string.text_wounded))));
        }
        return conditions;
    }
}