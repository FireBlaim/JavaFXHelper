package fr.fireblaim.javafxhelper.builders;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
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

    public void setVoidText(String voidText) {
        setPromptText(voidText);
    }

}
