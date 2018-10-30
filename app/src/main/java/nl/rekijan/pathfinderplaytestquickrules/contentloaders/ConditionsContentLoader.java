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
            RulesModel asleepRules = new RulesModel(context.getString(R.string.title_asleep), context.getString(R.string.text_asleep));
            asleepRules.addNote(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded), context);
            asleepRules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted) , context);
            conditions.add(new NavItemModel(context.getString(R.string.title_asleep), asleepRules));
        }
        if (sharedPref.getBoolean("pref_blinded", true)) {
            RulesModel blindedRules = new RulesModel(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded));
            blindedRules.addTrait(context.getString(R.string.title_visual), context.getString(R.string.text_visual), context);
            blindedRules.addNote(context.getString(R.string.title_seek), context.getString(R.string.text_seek), context);
            blindedRules.addNote(context.getString(R.string.title_dazzled), context.getString(R.string.text_dazzled), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_blinded), blindedRules));
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
            RulesModel dazzledRules = new RulesModel(context.getString(R.string.title_dazzled), context.getString(R.string.text_dazzled));
            dazzledRules.addNote(context.getString(R.string.title_concealed), context.getString(R.string.text_concealed), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_dazzled), dazzledRules));
            //TODO add detecting creatures, precise sense
        }
        if (sharedPref.getBoolean("pref_dead", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_dead), new
                    RulesModel(context.getString(R.string.title_dead), context.getString(R.string.text_dead))));
        }
        if (sharedPref.getBoolean("pref_deafened", true)) {
            RulesModel deafenedRules = new RulesModel(context.getString(R.string.title_deafened), context.getString(R.string.text_deafened));
            deafenedRules.addNote(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_deafened), deafenedRules));
        }
        if (sharedPref.getBoolean("pref_drained", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_drained), new
                    RulesModel(context.getString(R.string.title_drained), context.getString(R.string.text_drained))));
        }
        if (sharedPref.getBoolean("pref_dying", true)) {
            RulesModel dyingRules =  new RulesModel(context.getString(R.string.title_dying), context.getString(R.string.text_dying));
            dyingRules.addNote(context.getString(R.string.title_wounded), context.getString(R.string.text_wounded), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_dying), dyingRules));
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
            RulesModel entangledRules = new RulesModel(context.getString(R.string.title_entangled), context.getString(R.string.text_entangled));
            entangledRules.addNote(context.getString(R.string.title_hampered), context.getString(R.string.text_hampered), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_entangled), entangledRules));
        }
        if (sharedPref.getBoolean("pref_fascinated", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_fascinated), new
                    RulesModel(context.getString(R.string.title_fascinated), context.getString(R.string.text_fascinated))));
            //TODO add note for hostile actions
        }
        if (sharedPref.getBoolean("pref_fatigued", true)) {
            RulesModel fatiguedRules = new RulesModel(context.getString(R.string.title_fatigued), context.getString(R.string.text_fatigued));
            fatiguedRules.addNote(context.getString(R.string.title_hampered), context.getString(R.string.text_hampered), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_fatigued), fatiguedRules));
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
            RulesModel grabbedRules = new RulesModel(context.getString(R.string.title_grabbed), context.getString(R.string.text_grabbed));
            grabbedRules.addNote(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile), context);
            grabbedRules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_grabbed), grabbedRules));
        }
        if (sharedPref.getBoolean("pref_hampered", true)) {
            RulesModel hamperedRules = new RulesModel(context.getString(R.string.title_hampered), context.getString(R.string.text_hampered));
            hamperedRules.addNote(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_hampered), hamperedRules));
        }
        if (sharedPref.getBoolean("pref_immobile", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_immobile), new
                    RulesModel(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile))));
        }
        if (sharedPref.getBoolean("pref_paralyzed", true)) {
            RulesModel paralyzedRules = new RulesModel(context.getString(R.string.title_paralyzed), context.getString(R.string.text_paralyzed));
            paralyzedRules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_paralyzed), paralyzedRules));
            //TODO add recall knowledge note
        }
        if (sharedPref.getBoolean("pref_persistent_damage", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_persistent_damage), new
                    RulesModel(context.getString(R.string.title_persistent_damage), context.getString(R.string.text_persistent_damage))));
            //TODO check for needed notes later
        }
        if (sharedPref.getBoolean("pref_petrified", true)) {
            RulesModel petrifiedRules = new RulesModel(context.getString(R.string.title_petrified), context.getString(R.string.text_petrified));
            petrifiedRules.addNote(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded), context);
            petrifiedRules.addNote(context.getString(R.string.title_deafened), context.getString(R.string.text_deafened), context);
            petrifiedRules.addNote(context.getString(R.string.title_broken), context.getString(R.string.text_broken), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_petrified), petrifiedRules));
        }
        if (sharedPref.getBoolean("pref_prone", true)) {
            RulesModel proneRules = new RulesModel(context.getString(R.string.title_prone), context.getString(R.string.text_prone));
            proneRules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            proneRules.addNote(context.getString(R.string.title_crawl), context.getString(R.string.text_crawl), context);
            proneRules.addNote(context.getString(R.string.title_stand), context.getString(R.string.text_stand), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_prone), proneRules));
            //TODO add falling rules
        }
        if (sharedPref.getBoolean("pref_quick", true)) {
            conditions.add(new NavItemModel(context.getString(R.string.title_quick), new
                    RulesModel(context.getString(R.string.title_quick), context.getString(R.string.text_quick))));
        }
        if (sharedPref.getBoolean("pref_restrained", true)) {
            RulesModel restrainedRules = new RulesModel(context.getString(R.string.title_restrained), context.getString(R.string.text_restrained));
            restrainedRules.addNote(context.getString(R.string.title_immobile), context.getString(R.string.text_immobile), context);
            restrainedRules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_restrained), restrainedRules));
            //TODO add break grapple and escape skill actions
        }
        if (sharedPref.getBoolean("pref_sensed", true)) {
            RulesModel sensedRules = new RulesModel(context.getString(R.string.title_sensed), context.getString(R.string.text_sensed));
            sensedRules.addNote(context.getString(R.string.title_seek), context.getString(R.string.text_seek), context);
            sensedRules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            sensedRules.addNote(context.getString(R.string.title_strike), context.getString(R.string.text_strike), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_sensed), sensedRules));
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
            RulesModel unconsciousRules = new RulesModel(context.getString(R.string.title_unconscious), context.getString(R.string.text_unconscious));
            unconsciousRules.addNote(context.getString(R.string.title_blinded), context.getString(R.string.text_blinded), context);
            unconsciousRules.addNote(context.getString(R.string.title_deafened), context.getString(R.string.text_deafened), context);
            unconsciousRules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
            unconsciousRules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
            unconsciousRules.addNote(context.getString(R.string.title_dying), context.getString(R.string.text_dying), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_unconscious), unconsciousRules));
        }
        if (sharedPref.getBoolean("pref_wounded", true)) {
            RulesModel woundedRules = new RulesModel(context.getString(R.string.title_wounded), context.getString(R.string.text_wounded));
            woundedRules.addNote(context.getString(R.string.title_dying), context.getString(R.string.text_dying), context);
            conditions.add(new NavItemModel(context.getString(R.string.title_wounded), woundedRules));
        }
        return conditions;
    }
}