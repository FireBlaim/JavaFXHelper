package fr.fireblaim.javafxhelper.builders;

import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;

public class ProgressBarBuilder extends ProgressBar {

    public ProgressBarBuilder(int posX, int posY, double width, double height, Pane pane) {
        setLayoutX(posX);
        setLayoutY(posY);
        setPrefSize(width, height);

        pane.getChildren().add(this);
    }

}
