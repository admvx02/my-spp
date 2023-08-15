/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

/**
 *
 * @author adam x rezaa
 */
public class UserSession {

    /**
     * @return the id
     */
    public static String getId() {
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(String aId) {
        id = aId;
    }

    /**
     * @return the name
     */
    public static String getName() {
        return name;
    }

    /**
     * @param aName the name to set
     */
    public static void setName(String aName) {
        name = aName;
    }

    /**
     * @return the level
     */
    public static String getLevel() {
        return level;
    }

    /**
     * @param aLevel the level to set
     */
    public static void setLevel(String aLevel) {
        level = aLevel;
    }

    /**
     * @return the levelName
     */
    public static String getLevelName() {
        return levelName;
    }

    /**
     * @param aLevelName the levelName to set
     */
    public static void setLevelName(String aLevelName) {
        levelName = aLevelName;
    }

    /**
     * @return the panelOpened
     */
    public static String getPanelOpened() {
        return panelOpened;
    }

    /**
     * @param aPanelOpened the panelOpened to set
     */
    public static void setPanelOpened(String aPanelOpened) {
        panelOpened = aPanelOpened;
    }
    private static String id;
    private static String name;
    private static String level;
    private static String levelName;
    private static String panelOpened;
}
