package fr.fireblaim.javafxhelper.builders;

import javafx.scene.control.Alert;

public class AlertBuilder {

    public AlertBuilder(String title, String text, String headerText, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(text);
        alert.show();
    }

    public AlertBuilder(String title, String text, String headerText) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(text);
        alert.show();
    }

    public AlertBuilder(String title, String text, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText("Argh! There is a problem !");
        alert.setContentText(text);
        alert.show();
    }

    public AlertBuilder(String title, String text) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText("Argh! There is a problem !");
        alert.setContentText(text);
        alert.show();
    }

}
