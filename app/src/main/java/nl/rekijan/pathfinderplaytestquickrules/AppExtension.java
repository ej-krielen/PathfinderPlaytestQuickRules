package nl.rekijan.pathfinderplaytestquickrules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nl.rekijan.pathfinderplaytestquickrules.contentloaders.AfflictionRulesContentLoader;
import nl.rekijan.pathfinderplaytestquickrules.contentloaders.BasicActionsContentLoader;
import nl.rekijan.pathfinderplaytestquickrules.contentloaders.ConditionRulesContentLoader;
import nl.rekijan.pathfinderplaytestquickrules.contentloaders.ConditionsContentLoader;
import nl.rekijan.pathfinderplaytestquickrules.contentloaders.EncounterModeContentLoader;
import nl.rekijan.pathfinderplaytestquickrules.contentloaders.SpecialActionsContentLoader;
import nl.rekijan.pathfinderplaytestquickrules.models.NavItemModel;

/**
 * Class for methods and variables that need to be app-wide
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 6-4-2016
 */
public class AppExtension extends Application {

    /**
     * Strings for the categories of items in the ExpendableListView
     */
    private List<String> mListDataHeader;
    /**
     * Items for under the categories in the ExpendableListView<br>
     * Keys: categories from {@link #mListDataHeader}<br>
     * Values: Lists of {@link NavItemModel}<br>
     */
    private HashMap<String, List<NavItemModel>> mListDataChild;

    @Override
    public void onCreate() {
        super.onCreate();
        setDefaultValues();
        createOrUpdateNavigation();
    }

    /**
     * Sets the default values from an XML preference file by reading the values defined
     * by each {@link Preference} item's {@code android:defaultValue} attribute.
     */
    private void setDefaultValues() {
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
    }

    /**
     * Creates or updates {@link #mListDataHeader} and {@link #mListDataChild} with items for the navigation drawer, visibility based on preferences
     */
    public void createOrUpdateNavigation() {
        mListDataHeader = new ArrayList<>();
        mListDataChild = new HashMap<>();
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        //Conditions
        if (sharedPref.getBoolean("pref_show_conditions", true)) {
            mListDataHeader.add(getString(R.string.navigation_category_conditions));
            mListDataChild.put(getString(R.string.navigation_category_conditions), ConditionsContentLoader.getInstance().getConditionsContent(this, sharedPref));
        }

        //Condition Rules
        if (sharedPref.getBoolean("pref_show_condition_rules", true)) {
            mListDataHeader.add(getString(R.string.navigation_category_condition_rules));
            mListDataChild.put(getString(R.string.navigation_category_condition_rules), ConditionRulesContentLoader.getInstance().getConditionRulesContent(this, sharedPref));
        }

        //Basic Actions
        if (sharedPref.getBoolean("pref_show_basic_actions", true)) {
            mListDataHeader.add(getString(R.string.navigation_category_basic_actions));
            mListDataChild.put(getString(R.string.navigation_category_basic_actions), BasicActionsContentLoader.getInstance().getBasicActionsContent(this, sharedPref));
        }

        //Special Actions
        if (sharedPref.getBoolean("pref_show_special_actions", true)) {
            mListDataHeader.add(getString(R.string.navigation_category_special_actions));
            mListDataChild.put(getString(R.string.navigation_category_special_actions), SpecialActionsContentLoader.getInstance().getSpecialActionsContent(this, sharedPref));
        }

        //Affliction Rules
        if (sharedPref.getBoolean("pref_show_affliction_rules", true)) {
            mListDataHeader.add(getString(R.string.navigation_category_affliction_rules));
            mListDataChild.put(getString(R.string.navigation_category_affliction_rules), AfflictionRulesContentLoader.getInstance().getAfflictionRulesContent(this, sharedPref));
        }

        //Encounter Mode
        if (sharedPref.getBoolean("pref_show_encounter_mode", true)) {
            mListDataHeader.add(getString(R.string.navigation_category_encounter_mode));
            mListDataChild.put(getString(R.string.navigation_category_encounter_mode), EncounterModeContentLoader.getInstance().getEncounterModeContent(this, sharedPref));
        }

    }

    public List<String> getHeaders() {
        return mListDataHeader;
    }

    public void setHeaders(List<String> mListDataHeader) {
        this.mListDataHeader = mListDataHeader;
    }

    public HashMap<String, List<NavItemModel>> getNavItems() {
        return mListDataChild;
    }

    public void setNavItems(HashMap<String, List<NavItemModel>> mListDataChild) {
        this.mListDataChild = mListDataChild;
    }
}