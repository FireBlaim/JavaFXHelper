package fr.fireblaim.javafxhelper.builders;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;

public class TextFieldBuilder extends TextField {

    public TextFieldBuilder(int posX, int posY, double width, double height, Pane pane) {
        setLayoutX(posX);
        setLayoutY(posY);
        setPrefSize(width, height);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(int posX, int posY, double width, double height, Pane pane, Font font) {
        setLayoutX(posX);
        setLayoutY(posY);
        setPrefSize(width, height);
        setFont(font);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(Pane pane, Priority priority, VPos vpos, HPos hpos) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);
        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(Pane pane, Priority priority, HPos hpos) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(Pane pane, Priority priority, VPos vpos) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(Pane pane, Priority priority) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(Pane pane, Priority priority, VPos vpos, HPos hpos, Font font) {
        setFont(font);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);
        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(Pane pane, Priority priority, HPos hpos, Font font) {
        setFont(font);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(Pane pane, Priority priority, VPos vpos, Font font) {
        setFont(font);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public TextFieldBuilder(Pane pane, Priority priority, Font font) {
        setFont(font);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        pane.getChildren().add(this);
    }

    public void setVoidText(String voidText) {
        setPromptText(voidText);
    }

}
