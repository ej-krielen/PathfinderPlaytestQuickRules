package nl.rekijan.pathfinderplaytestquickrules.contentloaders;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import nl.rekijan.pathfinderplaytestquickrules.R;
import nl.rekijan.pathfinderplaytestquickrules.models.NavItemModel;
import nl.rekijan.pathfinderplaytestquickrules.models.RulesModel;

/**
 * Content for the skill actions
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 25-10-2018
 */
public class SkillActionsContentLoader {


    private static SkillActionsContentLoader sInstance = null;

    public static synchronized SkillActionsContentLoader getInstance() {
        if (sInstance == null) {
            sInstance = new SkillActionsContentLoader();
        }
        return sInstance;
    }

    public List<NavItemModel> getSkillActionsContent(Context context, SharedPreferences sharedPref) {
        List<NavItemModel> skillActions = new ArrayList<>();
        if(sharedPref.getBoolean("pref_show_acrobatics", true))
        {
            RulesModel rulesAcrobatics = new RulesModel(context.getString(R.string.title_acrobatics), context.getString(R.string.text_acrobatics));
            skillActions.add(new NavItemModel(context.getString(R.string.title_acrobatics), rulesAcrobatics));

            if (sharedPref.getBoolean("pref_balance", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_balance), context.getString(R.string.text_balance));
                rules.addTrait(context.getString(R.string.title_acrobatics), context.getString(R.string.text_acrobatics), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.setSuccess(context.getString(R.string.success_balance));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_balance));
                rules.setFailure(context.getString(R.string.failure_balance));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_balance));
                rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
                rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_balance), rules));
            }
            if (sharedPref.getBoolean("pref_escape", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_escape), context.getString(R.string.text_escape));
                rules.addTrait(context.getString(R.string.title_acrobatics), context.getString(R.string.text_acrobatics), context);
                rules.setSuccess(context.getString(R.string.success_escape));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_escape));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_escape));
                rules.addNote(context.getString(R.string.title_grabbed), context.getString(R.string.text_grabbed), context);
                rules.addNote(context.getString(R.string.title_restrained), context.getString(R.string.text_restrained), context);
                rules.addNote(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_escape), rules));
            }
            if (sharedPref.getBoolean("pref_grab_edge", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_grab_edge), context.getString(R.string.text_grab_edge));
                rules.addTrait(context.getString(R.string.title_acrobatics), context.getString(R.string.text_acrobatics), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setTrigger(context.getString(R.string.trigger_grab_edge));
                rules.setRequirement(context.getString(R.string.requirement_grab_edge));
                rules.setSuccess(context.getString(R.string.success_grab_edge));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_grab_edge));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_grab_edge));
                skillActions.add(new NavItemModel(context.getString(R.string.title_grab_edge), rules));
            }
            if (sharedPref.getBoolean("pref_maintain_balance", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_maintain_balance), context.getString(R.string.text_maintain_balance));
                rules.addTrait(context.getString(R.string.title_acrobatics), context.getString(R.string.text_acrobatics), context);
                rules.setTrigger(context.getString(R.string.trigger_maintain_balance));
                rules.setSuccess(context.getString(R.string.success_maintain_balance));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_maintain_balance));
                skillActions.add(new NavItemModel(context.getString(R.string.title_aid), rules));
            }
            if (sharedPref.getBoolean("pref_squeeze", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_squeeze), context.getString(R.string.text_squeeze));
                rules.addTrait(context.getString(R.string.title_acrobatics), context.getString(R.string.text_acrobatics), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.setSuccess(context.getString(R.string.success_squeeze));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_squeeze));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_squeeze));
                skillActions.add(new NavItemModel(context.getString(R.string.title_squeeze), rules));
            }
            if (sharedPref.getBoolean("pref_tumble_through", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_tumble_through), context.getString(R.string.text_tumble_through));
                rules.addTrait(context.getString(R.string.title_acrobatics), context.getString(R.string.text_acrobatics), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.setSuccess(context.getString(R.string.success_tumble_through));
                rules.addNote(context.getString(R.string.title_stride), context.getString(R.string.text_stride), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_tumble_through), rules));
            }
            if (sharedPref.getBoolean("pref_maneuver_in_flight", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_maneuver_in_flight), context.getString(R.string.text_maneuver_in_flight));
                rules.addTrait(context.getString(R.string.title_acrobatics), context.getString(R.string.text_acrobatics), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.setSuccess(context.getString(R.string.success_maneuver_in_flight));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_maneuver_in_flight));
                skillActions.add(new NavItemModel(context.getString(R.string.title_maneuver_in_flight), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_arcana", true))
        {
            RulesModel rulesAcrobatics = new RulesModel(context.getString(R.string.title_arcana), context.getString(R.string.text_arcana));
            skillActions.add(new NavItemModel(context.getString(R.string.title_arcana), rulesAcrobatics));

            if (sharedPref.getBoolean("pref_recall_knowledge_arcana", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_recall_knowledge_arcana), context.getString(R.string.text_recall_knowledge_arcana));
                rules.addTrait(context.getString(R.string.title_arcana), context.getString(R.string.text_arcana), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.setSuccess(context.getString(R.string.success_recall_knowledge_arcana));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_recall_knowledge_arcana));
                skillActions.add(new NavItemModel(context.getString(R.string.title_recall_knowledge_arcana), rules));
            }

            if (sharedPref.getBoolean("pref_borrow_arcane_spell", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_borrow_arcane_spell), context.getString(R.string.text_borrow_arcane_spell));
                rules.addTrait(context.getString(R.string.title_arcana), context.getString(R.string.text_arcana), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_borrow_arcane_spell));
                rules.setFailure(context.getString(R.string.failure_borrow_arcane_spell));
                skillActions.add(new NavItemModel(context.getString(R.string.title_borrow_arcane_spell), rules));
            }

            if (sharedPref.getBoolean("pref_identify_magic_arcana", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_identify_magic_arcana), context.getString(R.string.text_identify_magic_arcana));
                rules.addTrait(context.getString(R.string.title_arcana), context.getString(R.string.text_arcana), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.setSuccess(context.getString(R.string.success_balance));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_identify_magic_arcana));
                rules.setFailure(context.getString(R.string.failure_identify_magic_arcana));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_identify_magic_arcana));
                skillActions.add(new NavItemModel(context.getString(R.string.title_identify_magic_arcana), rules));
            }

            if (sharedPref.getBoolean("pref_learn_arcane_spell", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_learn_arcane_spell), context.getString(R.string.text_learn_arcane_spell));
                rules.addTrait(context.getString(R.string.title_arcana), context.getString(R.string.text_arcana), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_learn_arcane_spell));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_learn_arcane_spell));
                rules.setFailure(context.getString(R.string.failure_learn_arcane_spell));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_learn_arcane_spell));
                skillActions.add(new NavItemModel(context.getString(R.string.title_learn_arcane_spell), rules));
            }

            if (sharedPref.getBoolean("pref_read_magic", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_read_magic), context.getString(R.string.text_read_magic));
                rules.addTrait(context.getString(R.string.title_arcana), context.getString(R.string.text_arcana), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.setSuccess(context.getString(R.string.success_read_magic));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_read_magic));
                skillActions.add(new NavItemModel(context.getString(R.string.title_read_magic), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_arcana", true)) //TODO
        {
            RulesModel rulesAcrobatics = new RulesModel(context.getString(R.string.title_arcana), context.getString(R.string.text_arcana));
            skillActions.add(new NavItemModel(context.getString(R.string.title_arcana), rulesAcrobatics));

            if (sharedPref.getBoolean("pref_balance", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_balance), context.getString(R.string.text_balance));
                rules.addTrait(context.getString(R.string.title_arcana), context.getString(R.string.text_arcana), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setTrigger(context.getString(R.string.trigger_aid));
                rules.setRequirement(context.getString(R.string.requirement_aid));
                rules.setSuccess(context.getString(R.string.success_balance));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_balance));
                rules.setFailure(context.getString(R.string.failure_balance));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_balance));
                skillActions.add(new NavItemModel(context.getString(R.string.title_aid), rules));
            }
        }

        return skillActions;
    }
}