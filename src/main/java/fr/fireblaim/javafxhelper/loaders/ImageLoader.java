package fr.fireblaim.javafxhelper.loaders;

import fr.fireblaim.javafxhelper.JavaFXHelper;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {

    public static void loadImage(String file, int posX, int posY, double width, double height, Pane root) {
        Image image = getImage(file);
        ImageView imageView = new ImageView(image);

        imageView.setLayoutX(posX);
        imageView.setLayoutY(posY);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);

        root.getChildren().add(imageView);
    }

    public static void loadImage(String file, int posX, int posY, Pane root) {
        Image image = getImage(file);
        loadImage(file, posX, posY, image.getWidth(), image.getHeight(), root);
    }

    public static Image getImage(String file) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(ImageLoader.class.getResource(JavaFXHelper.getResourceLocation() + file));
        } catch (IOException ignored) {}
        return SwingFXUtils.toFXImage(image, null);
    }

}
