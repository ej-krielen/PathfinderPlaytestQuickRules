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
            RulesModel rules = new RulesModel(context.getString(R.string.title_asleep), context.getString(R.string.text_asleep));
            rules.addNote(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded), context);
            rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted) , context);
            conditions.add(new NavItemModel(context.getString(R.string.title_asleep), rules));
        }
        if (sharedPref.getBoolean("pref_blinded", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded));
            rules.addTrait(context.getString(R.string.title_visual), context.getString(R.string.text_visual), context);
            rules.addNote(context.getString(R.string.title_seek), context.getString(R.string.text_seek), context);
            rules.addNote(context.getString(R.string.title_dazzled), context.getString(R.string.text_dazzled), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_blinded), rules));
            //TODO add link to detecting creatures,  unseen rules, difficult terrain, precise sense
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
            RulesModel rules = new RulesModel(context.getString(R.string.title_dazzled), context.getString(R.string.text_dazzled));
            rules.addNote(context.getString(R.string.title_concealed), context.getString(R.string.text_concealed), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_dazzled), rules));
            //TODO add detecting creatures, precise sense
        }
        if (sharedPref.getBoolean("pref_dead", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_dead), new
                    RulesModel(context.getString(R.string.title_dead), context.getString(R.string.text_dead))));
        }
        if (sharedPref.getBoolean("pref_deafened", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_deafened), context.getString(R.string.text_deafened));
            rules.addNote(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_deafened), rules));
        }
        if (sharedPref.getBoolean("pref_drained", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_drained), new
                    RulesModel(context.getString(R.string.title_drained), context.getString(R.string.text_drained))));
        }
        if (sharedPref.getBoolean("pref_dying", true)) {
            RulesModel rules =  new RulesModel(context.getString(R.string.title_dying), context.getString(R.string.text_dying));
            rules.addNote(context.getString(R.string.title_wounded), context.getString(R.string.text_wounded), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_dying), rules));
            //TODO add note for recovery throw
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
            RulesModel rules = new RulesModel(context.getString(R.string.title_entangled), context.getString(R.string.text_entangled));
            rules.addNote(context.getString(R.string.title_hampered), context.getString(R.string.text_hampered), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_entangled), rules));
        }
        if (sharedPref.getBoolean("pref_fascinated", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_fascinated), new
                    RulesModel(context.getString(R.string.title_fascinated), context.getString(R.string.text_fascinated))));
            //TODO add note for hostile actions
        }
        if (sharedPref.getBoolean("pref_fatigued", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_fatigued), context.getString(R.string.text_fatigued));
            rules.addNote(context.getString(R.string.title_hampered), context.getString(R.string.text_hampered), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_fatigued), rules));
            //TODO add note for exploration mode
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
            RulesModel rules = new RulesModel(context.getString(R.string.title_grabbed), context.getString(R.string.text_grabbed));
            rules.addNote(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile), context);
            rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_grabbed), rules));
        }
        if (sharedPref.getBoolean("pref_hampered", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_hampered), context.getString(R.string.text_hampered));
            rules.addNote(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_hampered), rules));
        }
        if (sharedPref.getBoolean("pref_immobile", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_immobile), new
                    RulesModel(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile))));
        }
        if (sharedPref.getBoolean("pref_paralyzed", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_paralyzed), context.getString(R.string.text_paralyzed));
            rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_paralyzed), rules));
            //TODO add recall knowledge note
        }
        if (sharedPref.getBoolean("pref_persistent_damage", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_persistent_damage), new
                    RulesModel(context.getString(R.string.title_persistent_damage), context.getString(R.string.text_persistent_damage))));
            //TODO check for needed notes later
        }
        if (sharedPref.getBoolean("pref_petrified", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_petrified), context.getString(R.string.text_petrified));
            rules.addNote(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded), context);
            rules.addNote(context.getString(R.string.title_deafened), context.getString(R.string.text_deafened), context);
            rules.addNote(context.getString(R.string.title_broken), context.getString(R.string.text_broken), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_petrified), rules));
        }
        if (sharedPref.getBoolean("pref_prone", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_prone), context.getString(R.string.text_prone));
            rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            rules.addNote(context.getString(R.string.title_crawl), context.getString(R.string.text_crawl), context);
            rules.addNote(context.getString(R.string.title_stand), context.getString(R.string.text_stand), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_prone), rules));
            //TODO add falling rules
        }
        if (sharedPref.getBoolean("pref_quick", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_quick), new
                    RulesModel(context.getString(R.string.title_quick), context.getString(R.string.text_quick))));
        }
        if (sharedPref.getBoolean("pref_restrained", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_restrained), context.getString(R.string.text_restrained));
            rules.addNote(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile), context);
            rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_restrained), rules));
            //TODO add break grapple and escape skill actions
        }
        if (sharedPref.getBoolean("pref_sensed", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_sensed), context.getString(R.string.text_sensed));
            rules.addNote(context.getString(R.string.title_seek), context.getString(R.string.text_seek), context);
            rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            rules.addNote(context.getString(R.string.title_strike), context.getString(R.string.text_strike), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_sensed), rules));
            //TODO add detecting creature, unseen,
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
            RulesModel rules = new RulesModel(context.getString(R.string.title_unconscious), context.getString(R.string.text_unconscious));
            rules.addNote(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded), context);
            rules.addNote(context.getString(R.string.title_deafened), context.getString(R.string.text_deafened), context);
            rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
            rules.addNote(context.getString(R.string.title_dying), context.getString(R.string.text_dying), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_unconscious), rules));
        }
        if (sharedPref.getBoolean("pref_wounded", true)) {
            RulesModel rules = new RulesModel(context.getString(R.string.title_wounded), context.getString(R.string.text_wounded));
            rules.addNote(context.getString(R.string.title_dying), context.getString(R.string.text_dying), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_wounded), rules));
        }
        return conditions;
    }
}