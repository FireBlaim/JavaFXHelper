package fr.fireblaim.javafxhelper.builders;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class ButtonBuilder extends Button {

    public ButtonBuilder(int posX, int posY, double width, double height, boolean hoverSystem, Pane pane) {
        setLayoutX(posX);
        setLayoutY(posY);
        setPrefSize(width, height);

        if(hoverSystem) {
            setHover(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    setOpacity(0.8D);
                }
            });
            setUnHover(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    setOpacity(1.0D);
                }
            });
        }

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
