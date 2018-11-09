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
        if(sharedPref.getBoolean("pref_show_skill_actions_acrobatics", true))
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

        if(sharedPref.getBoolean("pref_show_skill_actions_arcana", true))
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

        if(sharedPref.getBoolean("pref_show_skill_actions_athletics", true))
        {
            RulesModel rulesAthletics = new RulesModel(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics));
            skillActions.add(new NavItemModel(context.getString(R.string.title_athletics), rulesAthletics));

            if (sharedPref.getBoolean("pref_break_grapple", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_break_grapple), context.getString(R.string.text_break_grapple));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.setSuccess(context.getString(R.string.success_break_grapple));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_break_grapple));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_break_grapple));
                rules.addNote(context.getString(R.string.title_attack), context.getString(R.string.text_attack), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_break_grapple), rules));
            }

            if (sharedPref.getBoolean("pref_break_open", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_break_open), context.getString(R.string.text_break_open));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.addTrait(context.getString(R.string.title_attack), context.getString(R.string.text_attack), context);
                rules.setSuccess(context.getString(R.string.success_break_open));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_break_open));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_break_open));
                skillActions.add(new NavItemModel(context.getString(R.string.title_break_open), rules));
            }

            if (sharedPref.getBoolean("pref_climb", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_climb), context.getString(R.string.text_climb));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.setRequirement(context.getString(R.string.requirement_climb));
                rules.setSuccess(context.getString(R.string.success_climb));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_climb));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_climb));
                rules.addNote(context.getString(R.string.title_flatfooted), context.getString(R.string.text_flatfooted), context);
                rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_climb), rules));
            }

            if (sharedPref.getBoolean("pref_grapple", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_grapple), context.getString(R.string.text_grapple));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.addTrait(context.getString(R.string.title_attack), context.getString(R.string.text_attack), context);
                rules.setRequirement(context.getString(R.string.requirement_grapple));
                rules.setSuccess(context.getString(R.string.success_grapple));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_grapple));
                rules.setFailure(context.getString(R.string.failure_grapple));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_grapple));
                rules.addNote(context.getString(R.string.title_grabbed), context.getString(R.string.text_grabbed), context);
                rules.addNote(context.getString(R.string.title_restrained), context.getString(R.string.text_restrained), context);
                rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_grapple), rules));
            }

            if (sharedPref.getBoolean("pref_high_jump", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_high_jump), context.getString(R.string.text_high_jump));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_high_jump));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_high_jump));
                rules.setFailure(context.getString(R.string.failure_high_jump));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_high_jump));
                rules.addNote(context.getString(R.string.title_stride), context.getString(R.string.text_stride), context);
                rules.addNote(context.getString(R.string.title_leap), context.getString(R.string.text_leap), context);
                rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_high_jump), rules));
            }

            if (sharedPref.getBoolean("pref_long_jump", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_long_jump), context.getString(R.string.text_long_jump));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.setSuccess(context.getString(R.string.success_long_jump));
                rules.setFailure(context.getString(R.string.failure_long_jump));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_long_jump));
                rules.addNote(context.getString(R.string.title_stride), context.getString(R.string.text_stride), context);
                rules.addNote(context.getString(R.string.title_leap), context.getString(R.string.text_leap), context);
                rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_long_jump), rules));
            }

            if (sharedPref.getBoolean("pref_shove", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_shove), context.getString(R.string.text_shove));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.addTrait(context.getString(R.string.title_attack), context.getString(R.string.text_attack), context);
                rules.setRequirement(context.getString(R.string.requirement_shove));
                rules.setSuccess(context.getString(R.string.success_shove));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_shove));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_shove));
                rules.addNote(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_shove), rules));
            }

            if (sharedPref.getBoolean("pref_swim", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_swim), context.getString(R.string.text_swim));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.setSuccess(context.getString(R.string.success_swim));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_swim));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_swim));
                //TODO add notes hold your breath, drowning, difficult terrain
                skillActions.add(new NavItemModel(context.getString(R.string.title_swim), rules));
            }

            if (sharedPref.getBoolean("pref_trip", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_trip), context.getString(R.string.text_trip));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.addTrait(context.getString(R.string.title_attack), context.getString(R.string.text_attack), context);
                rules.setRequirement(context.getString(R.string.requirement_trip));
                rules.setSuccess(context.getString(R.string.success_trip));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_trip));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_trip));
                rules.addNote(context.getString(R.string.title_prone), context.getString(R.string.text_prone), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_trip), rules));
            }

            if (sharedPref.getBoolean("pref_disarm", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_disarm), context.getString(R.string.text_disarm));
                rules.addTrait(context.getString(R.string.title_athletics), context.getString(R.string.text_athletics), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_attack), context.getString(R.string.text_attack), context);
                rules.setRequirement(context.getString(R.string.requirement_disarm));
                rules.setSuccess(context.getString(R.string.success_disarm));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_disarm));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_disarm));
                skillActions.add(new NavItemModel(context.getString(R.string.title_disarm), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_crafting", true))
        {
            RulesModel rulesCrafting = new RulesModel(context.getString(R.string.title_crafting), context.getString(R.string.text_crafting));
            skillActions.add(new NavItemModel(context.getString(R.string.title_crafting), rulesCrafting));

            if (sharedPref.getBoolean("pref_recall_knowledge_crafting", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_recall_knowledge_crafting), context.getString(R.string.text_recall_knowledge_crafting));
                rules.addTrait(context.getString(R.string.title_crafting), context.getString(R.string.text_crafting), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.setSuccess(context.getString(R.string.success_recall_knowledge_crafting));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_recall_knowledge_crafting));
                skillActions.add(new NavItemModel(context.getString(R.string.title_recall_knowledge_crafting), rules));
            }

            if (sharedPref.getBoolean("pref_repair", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_repair), context.getString(R.string.text_repair));
                rules.addTrait(context.getString(R.string.title_crafting), context.getString(R.string.text_crafting), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setRequirement(context.getString(R.string.requirement_repair));
                rules.setSuccess(context.getString(R.string.success_repair));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_repair));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_repair));
                //TODO add item notes/dents
                skillActions.add(new NavItemModel(context.getString(R.string.title_repair), rules));
            }

            if (sharedPref.getBoolean("pref_craft", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_craft), context.getString(R.string.text_craft));
                rules.addTrait(context.getString(R.string.title_crafting), context.getString(R.string.text_crafting), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.setSuccess(context.getString(R.string.success_craft));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_craft));
                rules.setFailure(context.getString(R.string.failure_craft));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_craft));
                //TODO add table 4-3
                skillActions.add(new NavItemModel(context.getString(R.string.title_craft), rules));
            }

            if (sharedPref.getBoolean("pref_identify_alchemy", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_identify_alchemy), context.getString(R.string.text_identify_alchemy));
                rules.addTrait(context.getString(R.string.title_crafting), context.getString(R.string.text_crafting), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setRequirement(context.getString(R.string.requirement_identify_alchemy));
                rules.setSuccess(context.getString(R.string.success_identify_alchemy));
                rules.setFailure(context.getString(R.string.failure_identify_alchemy));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_identify_alchemy));
                skillActions.add(new NavItemModel(context.getString(R.string.title_identify_alchemy), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_deception", true))
        {
            RulesModel rulesDeception = new RulesModel(context.getString(R.string.title_deception), context.getString(R.string.text_deception));
            skillActions.add(new NavItemModel(context.getString(R.string.title_deception), rulesDeception));

            if (sharedPref.getBoolean("pref_create_diversion", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_create_diversion), context.getString(R.string.text_create_diversion));
                rules.addTrait(context.getString(R.string.title_deception), context.getString(R.string.text_deception), context);
                rules.addTrait(context.getString(R.string.title_mental), context.getString(R.string.text_mental), context);
                rules.setSuccess(context.getString(R.string.success_create_diversion));
                rules.setFailure(context.getString(R.string.failure_create_diversion));
                rules.addNote(context.getString(R.string.title_manipulate) , context.getString(R.string.text_manipulate), context);
                rules.addNote(context.getString(R.string.title_auditory) , context.getString(R.string.text_auditory), context);
                rules.addNote(context.getString(R.string.title_lingual) , context.getString(R.string.text_lingual), context);
                rules.addNote(context.getString(R.string.title_sensed) , context.getString(R.string.text_sensed), context);
                rules.addNote(context.getString(R.string.title_step) , context.getString(R.string.text_step), context);
                rules.addNote(context.getString(R.string.title_hide) , context.getString(R.string.text_hide), context);
                rules.addNote(context.getString(R.string.title_sneak) , context.getString(R.string.text_sneak), context);
                //TODO add detecting a creature, seen
                skillActions.add(new NavItemModel(context.getString(R.string.title_create_diversion), rules));
            }

            if (sharedPref.getBoolean("pref_impersonate", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_impersonate), context.getString(R.string.text_impersonate));
                rules.addTrait(context.getString(R.string.title_deception), context.getString(R.string.text_deception), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setSuccess(context.getString(R.string.success_impersonate));
                rules.setFailure(context.getString(R.string.failure_impersonate));
                rules.addNote(context.getString(R.string.title_seek) , context.getString(R.string.text_seek), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_impersonate), rules));
            }

            if (sharedPref.getBoolean("pref_lie", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_lie), context.getString(R.string.text_lie));
                rules.addTrait(context.getString(R.string.title_deception), context.getString(R.string.text_deception), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_lingual), context.getString(R.string.text_lingual), context);
                rules.addTrait(context.getString(R.string.title_mental), context.getString(R.string.text_mental), context);
                rules.setSuccess(context.getString(R.string.success_lie));
                rules.setFailure(context.getString(R.string.failure_lie));
                skillActions.add(new NavItemModel(context.getString(R.string.title_lie), rules));
            }

            if (sharedPref.getBoolean("pref_feint", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_feint), context.getString(R.string.text_feint));
                rules.addTrait(context.getString(R.string.title_deception), context.getString(R.string.text_deception), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_mental), context.getString(R.string.text_mental), context);
                rules.setRequirement(context.getString(R.string.requirement_feint));
                rules.setSuccess(context.getString(R.string.success_feint));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_feint));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_feint));
                rules.addNote(context.getString(R.string.title_flatfooted) , context.getString(R.string.text_flatfooted), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_feint), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_diplomacy", true))
        {
            RulesModel rulesDiplomacy = new RulesModel(context.getString(R.string.title_diplomacy), context.getString(R.string.text_diplomacy));
            skillActions.add(new NavItemModel(context.getString(R.string.title_diplomacy), rulesDiplomacy));

            if (sharedPref.getBoolean("pref_gather_information", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_gather_information), context.getString(R.string.text_gather_information));
                rules.addTrait(context.getString(R.string.title_diplomacy), context.getString(R.string.text_diplomacy), context);
                rules.addTrait(context.getString(R.string.title_downtime), context.getString(R.string.text_downtime), context);
                rules.setSuccess(context.getString(R.string.success_gather_information));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_gather_information));
                rules.addNote(context.getString(R.string.title_flatfooted) , context.getString(R.string.text_flatfooted), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_gather_information), rules));
            }

            if (sharedPref.getBoolean("pref_make_impression", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_make_impression), context.getString(R.string.text_make_impression));
                rules.addTrait(context.getString(R.string.title_diplomacy), context.getString(R.string.text_diplomacy), context);
                rules.addTrait(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_mental), context.getString(R.string.text_mental), context);
                rules.setSuccess(context.getString(R.string.success_make_impression));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_make_impression));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_make_impression));
                rules.addNote(context.getString(R.string.title_flatfooted) , context.getString(R.string.text_flatfooted), context);
                //TODO Notes  npc attitudes
                skillActions.add(new NavItemModel(context.getString(R.string.title_make_impression), rules));
            }

            if (sharedPref.getBoolean("pref_request", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_request), context.getString(R.string.text_request));
                rules.addTrait(context.getString(R.string.title_diplomacy), context.getString(R.string.text_diplomacy), context);
                rules.addTrait(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_lingual), context.getString(R.string.text_lingual), context);
                rules.addTrait(context.getString(R.string.title_mental), context.getString(R.string.text_mental), context);
                rules.setSuccess(context.getString(R.string.success_request));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_request));
                rules.setFailure(context.getString(R.string.failure_request));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_request));
                rules.addNote(context.getString(R.string.title_flatfooted) , context.getString(R.string.text_flatfooted), context);
                //TODO Notes   npc attitudes
                skillActions.add(new NavItemModel(context.getString(R.string.title_request), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_intimidation", true)) //TODO
        {
            RulesModel rulesIntimidation = new RulesModel(context.getString(R.string.title_intimidation), context.getString(R.string.text_intimidation));
            skillActions.add(new NavItemModel(context.getString(R.string.title_intimidation), rulesIntimidation));

            if (sharedPref.getBoolean("pref_coerce", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_coerce), context.getString(R.string.text_coerce));
                rules.addTrait(context.getString(R.string.title_intimidation), context.getString(R.string.text_intimidation), context);
                rules.addTrait(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_emotion), context.getString(R.string.text_emotion), context);
                rules.addTrait(context.getString(R.string.title_lingual), context.getString(R.string.text_lingual), context);
                rules.addTrait(context.getString(R.string.title_mental), context.getString(R.string.text_mental), context);
                rules.setSuccess(context.getString(R.string.success_coerce));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_coerce));
                rules.setFailure(context.getString(R.string.failure_coerce));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_coerce));
                //TODO Notes  NPC attitudes   -->
                skillActions.add(new NavItemModel(context.getString(R.string.title_coerce), rules));
            }

            if (sharedPref.getBoolean("pref_demoralize", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_demoralize), context.getString(R.string.text_demoralize));
                rules.addTrait(context.getString(R.string.title_intimidation), context.getString(R.string.text_intimidation), context);
                rules.addTrait(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_emotion), context.getString(R.string.text_emotion), context);
                rules.addTrait(context.getString(R.string.title_lingual), context.getString(R.string.text_lingual), context);
                rules.addTrait(context.getString(R.string.title_mental), context.getString(R.string.text_mental), context);
                rules.setSuccess(context.getString(R.string.success_demoralize));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_demoralize));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_demoralize));
                rules.addNote(context.getString(R.string.title_frightened) , context.getString(R.string.text_frightened), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_demoralize), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_lore", true))
        {
            RulesModel rulesLore = new RulesModel(context.getString(R.string.title_lore), context.getString(R.string.text_lore));
            skillActions.add(new NavItemModel(context.getString(R.string.title_lore), rulesLore));

            if (sharedPref.getBoolean("pref_recall_knowledge_lore", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_recall_knowledge_lore), context.getString(R.string.text_recall_knowledge_lore));
                rules.addTrait(context.getString(R.string.title_lore), context.getString(R.string.text_lore), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_recall_knowledge_lore));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_recall_knowledge_lore));
                skillActions.add(new NavItemModel(context.getString(R.string.title_recall_knowledge_lore), rules));
            }

            if (sharedPref.getBoolean("pref_practice_trade", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_practice_trade), context.getString(R.string.text_practice_trade));
                rules.addTrait(context.getString(R.string.title_lore), context.getString(R.string.text_lore), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_downtime), context.getString(R.string.text_secret), context);
                rules.setSuccess(context.getString(R.string.success_practice_trade));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_practice_trade));
                rules.setFailure(context.getString(R.string.failure_practice_trade));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_practice_trade));
                //TODO   Notes  table 4-4 and more?
                skillActions.add(new NavItemModel(context.getString(R.string.title_practice_trade), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_medicine", true))
        {
            RulesModel rulesMedicine = new RulesModel(context.getString(R.string.title_medicine), context.getString(R.string.text_medicine));
            skillActions.add(new NavItemModel(context.getString(R.string.title_medicine), rulesMedicine));

            if (sharedPref.getBoolean("pref_administer_first_aid", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_administer_first_aid), context.getString(R.string.text_administer_first_aid));
                rules.addTrait(context.getString(R.string.title_medicine), context.getString(R.string.text_medicine), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setRequirement(context.getString(R.string.requirement_administer_first_aid));
                rules.setSuccess(context.getString(R.string.success_administer_first_aid));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_administer_first_aid));
                rules.addNote(context.getString(R.string.title_dying) , context.getString(R.string.text_dying), context);
                rules.addNote(context.getString(R.string.title_unconscious) , context.getString(R.string.text_unconscious), context);
                rules.addNote(context.getString(R.string.title_persistent_damage) , context.getString(R.string.text_persistent_damage), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_administer_first_aid), rules));
            }

            if (sharedPref.getBoolean("pref_analyze_forensics", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_analyze_forensics), context.getString(R.string.text_analyze_forensics));
                rules.addTrait(context.getString(R.string.title_medicine), context.getString(R.string.text_medicine), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setSuccess(context.getString(R.string.success_analyze_forensics));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_analyze_forensics));
                skillActions.add(new NavItemModel(context.getString(R.string.title_analyze_forensics), rules));
            }

            if (sharedPref.getBoolean("pref_treat_disease", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_treat_disease), context.getString(R.string.text_treat_disease));
                rules.addTrait(context.getString(R.string.title_medicine), context.getString(R.string.text_medicine), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_downtime), context.getString(R.string.text_downtime), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setRequirement(context.getString(R.string.requirement_treat_disease));
                rules.setSuccess(context.getString(R.string.success_treat_disease));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_treat_disease));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_treat_disease));
                skillActions.add(new NavItemModel(context.getString(R.string.title_treat_disease), rules));
            }

            if (sharedPref.getBoolean("pref_treat_poison", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_treat_poison), context.getString(R.string.text_treat_poison));
                rules.addTrait(context.getString(R.string.title_medicine), context.getString(R.string.text_medicine), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setRequirement(context.getString(R.string.requirement_treat_poison));
                rules.setSuccess(context.getString(R.string.success_treat_poison));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_treat_poison));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_treat_poison));
                rules.addNote(context.getString(R.string.title_flatfooted) , context.getString(R.string.text_flatfooted), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_treat_poison), rules));
            }

            if (sharedPref.getBoolean("pref_treat_wounds", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_treat_wounds), context.getString(R.string.text_treat_wounds));
                rules.addTrait(context.getString(R.string.title_medicine), context.getString(R.string.text_medicine), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_healing), context.getString(R.string.text_healing), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setRequirement(context.getString(R.string.requirement_treat_wounds));
                rules.setSuccess(context.getString(R.string.success_treat_wounds));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_treat_wounds));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_treat_wounds));
                rules.addNote(context.getString(R.string.title_bolstered) , context.getString(R.string.text_bolstered), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_treat_wounds), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_nature", true))
        {
            RulesModel rulesNature = new RulesModel(context.getString(R.string.title_nature), context.getString(R.string.text_nature));
            skillActions.add(new NavItemModel(context.getString(R.string.title_nature), rulesNature));

            if (sharedPref.getBoolean("pref_command_animal", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_command_animal), context.getString(R.string.text_command_animal));
                rules.addTrait(context.getString(R.string.title_nature), context.getString(R.string.text_nature), context);
                rules.addTrait(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addNote(context.getString(R.string.title_handle_animal) , context.getString(R.string.text_handle_animal), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_command_animal), rules));
            }

            if (sharedPref.getBoolean("pref_handle_animal", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_handle_animal), context.getString(R.string.text_handle_animal));
                rules.addTrait(context.getString(R.string.title_nature), context.getString(R.string.text_nature), context);
                rules.addTrait(context.getString(R.string.title_auditory), context.getString(R.string.text_auditory), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_handle_animal));
                rules.addNote(context.getString(R.string.title_command_animal) , context.getString(R.string.text_command_animal), context);
                rules.addNote(context.getString(R.string.title_mount) , context.getString(R.string.text_mount), context);
                skillActions.add(new NavItemModel(context.getString(R.string.title_handle_animal), rules));
            }

            if (sharedPref.getBoolean("pref_recall_knowledge_nature", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_recall_knowledge_nature), context.getString(R.string.text_recall_knowledge_nature));
                rules.addTrait(context.getString(R.string.title_nature), context.getString(R.string.text_nature), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_recall_knowledge_nature));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_recall_knowledge_nature));
                skillActions.add(new NavItemModel(context.getString(R.string.title_recall_knowledge_nature), rules));
            }

            if (sharedPref.getBoolean("pref_identify_magic_nature", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_identify_magic_nature), context.getString(R.string.text_identify_magic_nature));
                rules.addTrait(context.getString(R.string.title_nature), context.getString(R.string.text_nature), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_identify_magic_nature));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_identify_magic_nature));
                rules.setFailure(context.getString(R.string.failure_identify_magic_nature));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_identify_magic_nature));
                skillActions.add(new NavItemModel(context.getString(R.string.title_identify_magic_nature), rules));
            }

            if (sharedPref.getBoolean("pref_learn_primal_spell", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_learn_primal_spell), context.getString(R.string.text_learn_primal_spell));
                rules.addTrait(context.getString(R.string.title_nature), context.getString(R.string.text_nature), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_learn_primal_spell));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_learn_primal_spell));
                rules.setFailure(context.getString(R.string.failure_learn_primal_spell));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_learn_primal_spell));
                //TODO Notes table 4-2   -->
                skillActions.add(new NavItemModel(context.getString(R.string.title_learn_primal_spell), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_occultism", true))
        {
            RulesModel rulesOccultism = new RulesModel(context.getString(R.string.title_occultism), context.getString(R.string.text_occultism));
            skillActions.add(new NavItemModel(context.getString(R.string.title_occultism), rulesOccultism));

            if (sharedPref.getBoolean("pref_recall_knowledge_occultism", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_recall_knowledge_occultism), context.getString(R.string.text_recall_knowledge_occultism));
                rules.addTrait(context.getString(R.string.title_occultism), context.getString(R.string.text_occultism), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_recall_knowledge_occultism));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_recall_knowledge_occultism));
                skillActions.add(new NavItemModel(context.getString(R.string.title_recall_knowledge_occultism), rules));
            }

            if (sharedPref.getBoolean("pref_identify_magic_occultism", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_identify_magic_occultism), context.getString(R.string.text_identify_magic_occultism));
                rules.addTrait(context.getString(R.string.title_occultism), context.getString(R.string.text_occultism), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_identify_magic_occultism));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_identify_magic_occultism));
                rules.setFailure(context.getString(R.string.failure_identify_magic_occultism));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_identify_magic_occultism));
                skillActions.add(new NavItemModel(context.getString(R.string.title_identify_magic_occultism), rules));
            }
            if (sharedPref.getBoolean("pref_learn_occult_spell", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_learn_occult_spell), context.getString(R.string.text_learn_occult_spell));
                rules.addTrait(context.getString(R.string.title_occultism), context.getString(R.string.text_occultism), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_learn_occult_spell));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_learn_occult_spell));
                rules.setFailure(context.getString(R.string.failure_learn_occult_spell));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_learn_occult_spell));
                //TODO  Notes  table 4-2   -->
                skillActions.add(new NavItemModel(context.getString(R.string.title_learn_occult_spell), rules));
            }
            if (sharedPref.getBoolean("pref_read_esoterica", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_read_esoterica), context.getString(R.string.text_read_esoterica));
                rules.addTrait(context.getString(R.string.title_occultism), context.getString(R.string.text_occultism), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_read_esoterica));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_read_esoterica));
                skillActions.add(new NavItemModel(context.getString(R.string.title_read_esoterica), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_performance", true)) //TODO
        {
            RulesModel rulesPerformance = new RulesModel(context.getString(R.string.title_performance), context.getString(R.string.text_performance));
            skillActions.add(new NavItemModel(context.getString(R.string.title_performance), rulesPerformance));

            if (sharedPref.getBoolean("pref_perform", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_perform), context.getString(R.string.text_perform));
                rules.addTrait(context.getString(R.string.title_performance), context.getString(R.string.text_performance), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_perform));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_perform));
                rules.setFailure(context.getString(R.string.failure_perform));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_perform));
                //TODO check if notes needed
                skillActions.add(new NavItemModel(context.getString(R.string.title_perform), rules));
            }

            if (sharedPref.getBoolean("pref_stage_performance", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_stage_performance), context.getString(R.string.text_stage_performance));
                rules.addTrait(context.getString(R.string.title_performance), context.getString(R.string.text_performance), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_downtime), context.getString(R.string.text_downtime), context);
                rules.setSuccess(context.getString(R.string.success_stage_performance));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_stage_performance));
                rules.setFailure(context.getString(R.string.failure_stage_performance));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_stage_performance));
                //TODO  Notes  table 4-4 and check for others
                skillActions.add(new NavItemModel(context.getString(R.string.title_stage_performance), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_religion", true))
        {
            RulesModel rulesReligion = new RulesModel(context.getString(R.string.title_religion), context.getString(R.string.text_religion));
            skillActions.add(new NavItemModel(context.getString(R.string.title_religion), rulesReligion));

            if (sharedPref.getBoolean("pref_recall_knowledge_religion", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_recall_knowledge_religion), context.getString(R.string.text_recall_knowledge_religion));
                rules.addTrait(context.getString(R.string.title_religion), context.getString(R.string.text_religion), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_recall_knowledge_religion));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_recall_knowledge_religion));
                skillActions.add(new NavItemModel(context.getString(R.string.title_recall_knowledge_religion), rules));
            }

            if (sharedPref.getBoolean("pref_identify_magic_religion", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_identify_magic_religion), context.getString(R.string.text_identify_magic_religion));
                rules.addTrait(context.getString(R.string.title_religion), context.getString(R.string.text_religion), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_identify_magic_religion));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_identify_magic_religion));
                rules.setFailure(context.getString(R.string.failure_identify_magic_religion));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_identify_magic_religion));
                //TODO Notes table 4-2   -->
                skillActions.add(new NavItemModel(context.getString(R.string.title_identify_magic_religion), rules));
            }

            if (sharedPref.getBoolean("pref_learn_divine_spell", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_learn_divine_spell), context.getString(R.string.text_learn_divine_spell));
                rules.addTrait(context.getString(R.string.title_religion), context.getString(R.string.text_religion), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_learn_divine_spell));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_learn_divine_spell));
                rules.setFailure(context.getString(R.string.failure_learn_divine_spell));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_learn_divine_spell));
                skillActions.add(new NavItemModel(context.getString(R.string.title_learn_divine_spell), rules));
            }

            if (sharedPref.getBoolean("pref_read_scripture", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_read_scripture), context.getString(R.string.text_read_scripture));
                rules.addTrait(context.getString(R.string.title_religion), context.getString(R.string.text_religion), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_read_scripture));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_read_scripture));
                skillActions.add(new NavItemModel(context.getString(R.string.title_read_scripture), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_society", true))
        {
            RulesModel rulesSociety = new RulesModel(context.getString(R.string.title_society), context.getString(R.string.text_society));
            skillActions.add(new NavItemModel(context.getString(R.string.title_society), rulesSociety));

            if (sharedPref.getBoolean("pref_recall_knowledge_society", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_recall_knowledge_society), context.getString(R.string.text_recall_knowledge_society));
                rules.addTrait(context.getString(R.string.title_society), context.getString(R.string.text_society), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_recall_knowledge_society));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_recall_knowledge_society));
                skillActions.add(new NavItemModel(context.getString(R.string.title_recall_knowledge_society), rules));
            }

            if (sharedPref.getBoolean("pref_subsist_streets", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_subsist_streets), context.getString(R.string.text_subsist_streets));
                rules.addTrait(context.getString(R.string.title_society), context.getString(R.string.text_society), context);
                rules.addTrait(context.getString(R.string.title_downtime), context.getString(R.string.text_downtime), context);
                rules.setSuccess(context.getString(R.string.success_subsist_streets));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_subsist_streets));
                rules.setFailure(context.getString(R.string.failure_subsist_streets));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_subsist_streets));
                skillActions.add(new NavItemModel(context.getString(R.string.title_subsist_streets), rules));
            }

            if (sharedPref.getBoolean("pref_create_forgery", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_create_forgery), context.getString(R.string.text_create_forgery));
                rules.addTrait(context.getString(R.string.title_society), context.getString(R.string.text_society), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_downtime), context.getString(R.string.text_downtime), context);
                rules.setSuccess(context.getString(R.string.success_create_forgery));
                rules.setFailure(context.getString(R.string.failure_create_forgery));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_create_forgery), rules));
            }

            if (sharedPref.getBoolean("pref_decipher_writing", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_decipher_writing), context.getString(R.string.text_decipher_writing));
                rules.addTrait(context.getString(R.string.title_society), context.getString(R.string.text_society), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_decipher_writing));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_decipher_writing));
                rules.setFailure(context.getString(R.string.failure_decipher_writing));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_decipher_writing));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_decipher_writing), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_stealth", true))
        {
            RulesModel rulesStealth = new RulesModel(context.getString(R.string.title_stealth), context.getString(R.string.text_stealth));
            skillActions.add(new NavItemModel(context.getString(R.string.title_stealth), rulesStealth));

            if (sharedPref.getBoolean("pref_conceal_object", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_conceal_object), context.getString(R.string.text_conceal_object));
                rules.addTrait(context.getString(R.string.title_stealth), context.getString(R.string.text_stealth), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setSuccess(context.getString(R.string.success_conceal_object));
                rules.setFailure(context.getString(R.string.failure_conceal_object));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_conceal_object), rules));
            }

            if (sharedPref.getBoolean("pref_hide", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_hide), context.getString(R.string.text_hide));
                rules.addTrait(context.getString(R.string.title_stealth), context.getString(R.string.text_stealth), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.setSuccess(context.getString(R.string.success_hide));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_hide), rules));
            }

            if (sharedPref.getBoolean("pref_sneak", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_sneak), context.getString(R.string.text_sneak));
                rules.addTrait(context.getString(R.string.title_stealth), context.getString(R.string.text_stealth), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.setSuccess(context.getString(R.string.success_sneak));
                rules.setFailure(context.getString(R.string.failure_sneak));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_sneak), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_survival", true))
        {
            RulesModel ruleSurvival = new RulesModel(context.getString(R.string.title_survival), context.getString(R.string.text_survival));
            skillActions.add(new NavItemModel(context.getString(R.string.title_survival), ruleSurvival));

            if (sharedPref.getBoolean("pref_sense_direction", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_sense_direction), context.getString(R.string.text_sense_direction));
                rules.addTrait(context.getString(R.string.title_survival), context.getString(R.string.text_survival), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.setSuccess(context.getString(R.string.success_sense_direction));
                //TODO notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_sense_direction), rules));
            }

            if (sharedPref.getBoolean("pref_survive_wild", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_survive_wild), context.getString(R.string.text_survive_wild));
                rules.addTrait(context.getString(R.string.title_survival), context.getString(R.string.text_survival), context);
                rules.addTrait(context.getString(R.string.title_downtime), context.getString(R.string.text_downtime), context);
                rules.addTrait(context.getString(R.string.title_secret), context.getString(R.string.text_secret), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.setSuccess(context.getString(R.string.success_survive_wild));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_survive_wild));
                rules.setFailure(context.getString(R.string.failure_survive_wild));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_survive_wild));
                //TODO notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_survive_wild), rules));
            }

            if (sharedPref.getBoolean("pref_cover_tracks", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_cover_tracks), context.getString(R.string.text_cover_tracks));
                rules.addTrait(context.getString(R.string.title_survival), context.getString(R.string.text_survival), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                //TODO  Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_cover_tracks), rules));
            }

            if (sharedPref.getBoolean("pref_track", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_track), context.getString(R.string.text_track));
                rules.addTrait(context.getString(R.string.title_survival), context.getString(R.string.text_survival), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_concentrate), context.getString(R.string.text_concentrate), context);
                rules.addTrait(context.getString(R.string.title_move), context.getString(R.string.text_move), context);
                rules.setSuccess(context.getString(R.string.success_track));
                rules.setFailure(context.getString(R.string.failure_track));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_track), rules));
            }
        }

        if(sharedPref.getBoolean("pref_show_skill_actions_thievery", true))
        {
            RulesModel rulesThievery = new RulesModel(context.getString(R.string.title_thievery), context.getString(R.string.text_thievery));
            skillActions.add(new NavItemModel(context.getString(R.string.title_thievery), rulesThievery));

            if (sharedPref.getBoolean("pref_palm_object", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_palm_object), context.getString(R.string.text_palm_object));
                rules.addTrait(context.getString(R.string.title_thievery), context.getString(R.string.text_thievery), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setSuccess(context.getString(R.string.success_palm_object));
                rules.setFailure(context.getString(R.string.failure_palm_object));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_palm_object), rules));
            }

            if (sharedPref.getBoolean("pref_steal_object", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_steal_object), context.getString(R.string.text_steal_object));
                rules.addTrait(context.getString(R.string.title_thievery), context.getString(R.string.text_thievery), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setSuccess(context.getString(R.string.success_steal_object));
                rules.setFailure(context.getString(R.string.failure_steal_object));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_steal_object), rules));
            }

            if (sharedPref.getBoolean("pref_disable_device", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_disable_device), context.getString(R.string.text_disable_device));
                rules.addTrait(context.getString(R.string.title_thievery), context.getString(R.string.text_thievery), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setRequirement(context.getString(R.string.requirement_disable_device));
                rules.setSuccess(context.getString(R.string.success_disable_device));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_disable_device));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_disable_device));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_disable_device), rules));
            }

            if (sharedPref.getBoolean("pref_pick_lock", true)) {
                RulesModel rules = new RulesModel(context.getString(R.string.title_pick_lock), context.getString(R.string.text_pick_lock));
                rules.addTrait(context.getString(R.string.title_thievery), context.getString(R.string.text_thievery), context);
                rules.addTrait(context.getString(R.string.title_trained_only), context.getString(R.string.text_trained_only), context);
                rules.addTrait(context.getString(R.string.title_manipulate), context.getString(R.string.text_manipulate), context);
                rules.setRequirement(context.getString(R.string.requirement_pick_lock));
                rules.setSuccess(context.getString(R.string.success_pick_lock));
                rules.setCriticalSuccess(context.getString(R.string.critical_success_pick_lock));
                rules.setCriticalFailure(context.getString(R.string.critical_failure_pick_lock));
                //TODO Notes?
                skillActions.add(new NavItemModel(context.getString(R.string.title_pick_lock), rules));
            }
        }
        return skillActions;
    }
}