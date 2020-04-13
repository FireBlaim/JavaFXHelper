package fr.fireblaim.javafxhelper;

import javax.swing.*;

public class JavaFXHelper {

    public static String resourceLocation = "";

    public static void systemLookAndFeelSetup() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println("[ResourceLoaderFx] I can't setup the look and feel :( : " + e);
        }
    }

    public static String getResourceLocation() {
        return resourceLocation;
    }

    public static void setResourceLocation(String resourceLocation) {
        JavaFXHelper.resourceLocation = resourceLocation;
    }

    public static int percentage(int value, int maximum) {
        return (int) (value / maximum * 100);
    }
}
