package fr.fireblaim.javafxhelper.builders;

import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;

public class TextBuilder extends Label {

    public TextBuilder(String text, int posX, int posY, double width, double height, Pane pane) {
        setText(text);
        setLayoutX(posX);
        setLayoutY(posY);
        setPrefSize(width, height);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, int posX, int posY, double width, double height, Font font, Pane pane) {
        setText(text);
        setLayoutX(posX);
        setLayoutY(posY);
        setPrefSize(width, height);
        setFont(font);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, Pane pane, Priority priority, VPos vpos, HPos hpos) {
        setText(text);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);
        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, Pane pane, Priority priority, HPos hpos) {
        setText(text);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, Pane pane, Priority priority, VPos vpos) {
        setText(text);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, Pane pane, Priority priority) {
        setText(text);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, Pane pane, Priority priority, VPos vpos, HPos hpos, Font font) {
        setText(text);
        setFont(font);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);
        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, Pane pane, Priority priority, HPos hpos, Font font) {
        setText(text);
        setFont(font);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, Pane pane, Priority priority, VPos vpos, Font font) {
        setText(text);
        setFont(font);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public TextBuilder(String text, Pane pane, Priority priority, Font font) {
        setText(text);
        setFont(font);

        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        pane.getChildren().add(this);
    }

    public void setAction(EventHandler<? super MouseEvent> value) {
        onMouseClickedProperty().set(value);
    }

    public void setHover(EventHandler<? super MouseEvent> value) {
        onMouseEnteredProperty().set(value);
    }

    public void setUnHover(EventHandler<? super MouseEvent> value) {
        onMouseExitedProperty().set(value);
    }

}
