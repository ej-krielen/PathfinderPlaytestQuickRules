package nl.rekijan.pathfinderplaytestquickrules.models;

/**
 * Custom class to set fields for NavItems
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 2-4-2016
 */
public class NavItemModel {

    private String title;
    private RulesModel rulesModel;

    public NavItemModel(String title, RulesModel rulesModel) {
        this.title = title;
        this.rulesModel = rulesModel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RulesModel getRulesModel() {
        return rulesModel;
    }

    public void setRulesModel(RulesModel rulesModel) {
        this.rulesModel = rulesModel;
    }
}