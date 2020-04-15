package fr.fireblaim.javafxhelper.utils;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;

public class WindowMover {

    //Code by Trxyy thx !

    Point dragPoint = new Point();

    public WindowMover(Stage stage) {
        stage.getScene().setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                dragPoint.x = (int) (stage.getX() - event.getScreenX());
                dragPoint.y = (int) (stage.getY() - event.getScreenY());
            }
        });
        stage.getScene().setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() + dragPoint.x);
                stage.setY(event.getScreenY() + dragPoint.y);
            }
        });
    }

}
