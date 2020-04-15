package fr.fireblaim.javafxhelper.builders;

import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

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

    public ButtonBuilder(Pane pane, Priority priority, boolean hoverSystem) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

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

    public ButtonBuilder(Pane pane, Priority priority, VPos vpos, boolean hoverSystem) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setValignment(this, vpos);

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

    public ButtonBuilder(Pane pane, Priority priority, HPos hpos, boolean hoverSystem) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setHalignment(this, hpos);

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

    public ButtonBuilder(Pane pane, Priority priority, VPos vpos, HPos hpos, boolean hoverSystem) {
        GridPane.setHgrow(this, priority);
        GridPane.setVgrow(this, priority);

        GridPane.setValignment(this, vpos);
        GridPane.setHalignment(this, hpos);

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
