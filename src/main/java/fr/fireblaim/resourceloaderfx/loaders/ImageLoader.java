package fr.fireblaim.resourceloaderfx.loaders;

import fr.fireblaim.resourceloaderfx.ResourceLoaderFX;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {

    public static void loadImage(String file, int posX, int posY, int width, int height, Pane root) {
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
        ImageView imageView = new ImageView(image);

        imageView.setLayoutX(posX);
        imageView.setLayoutY(posY);
        imageView.setFitWidth(image.getWidth());
        imageView.setFitHeight(image.getHeight());

        root.getChildren().add(imageView);
    }

    public static Image getImage(String file) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(ImageLoader.class.getResource(ResourceLoaderFX.getResourceLocation() + file));
        } catch (IOException ignored) {}
        return SwingFXUtils.toFXImage(image, null);
    }

}
