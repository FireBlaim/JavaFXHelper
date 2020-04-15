package fr.fireblaim.javafxhelper.builders;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

public class ProgressBarBuilder extends ProgressBar {

    public ProgressBarBuilder(int posX, int posY, double width, double height, Pane pane) {
        setLayoutX(posX);
        setLayoutY(posY);
        setPrefSize(width, height);

        pane.getChildren().add(this);
    }

    public ProgressBarBuilder(Pane pane, Priority priority, VPos vpos, HPos hpos) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);
        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public ProgressBarBuilder(Pane pane, Priority priority, HPos hpos) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);

        pane.getChildren().add(this);
    }

    public ProgressBarBuilder(Pane pane, Priority priority, VPos vpos) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setValignment(this, vpos);

        pane.getChildren().add(this);
    }

    public ProgressBarBuilder(Pane pane, Priority priority) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        pane.getChildren().add(this);
    }

}
