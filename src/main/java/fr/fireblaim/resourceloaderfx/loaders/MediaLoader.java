package fr.fireblaim.resourceloaderfx.loaders;

import fr.fireblaim.resourceloaderfx.ResourceLoaderFX;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URISyntaxException;
import java.net.URL;

public class MediaLoader {

    public static void loadMedia(String file, int posX, int posY, int width, int height, Pane pane, boolean autoCycle) {
        MediaPlayer player = new MediaPlayer(getMedia(file));
        MediaView viewer = new MediaView(player);

        viewer.setFitWidth(width);
        viewer.setFitHeight(height);
        viewer.setLayoutX(posX);
        viewer.setLayoutY(posY);
        viewer.setPreserveRatio(false);

        player.setCycleCount(autoCycle ? -1 : 1);

        player.play();

        pane.getChildren().add(viewer);
    }

    public static void loadMedia(String file, int posX, int posY, Pane pane, boolean autoCycle) {
        Media media = getMedia(file);
        loadMedia(file, posX, posY, media.getWidth(), media.getHeight(), pane, autoCycle);
    }

    public static Media getMedia(String file) {
        Media media = null;
        URL resource = MediaLoader.class.getResource(ResourceLoaderFX.getResourceLocation() + file);
        try {
            media = new Media(resource.toURI().toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return media;
    }

}
