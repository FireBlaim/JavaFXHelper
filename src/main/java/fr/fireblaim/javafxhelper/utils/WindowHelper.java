package fr.fireblaim.javafxhelper.utils;

import fr.fireblaim.javafxhelper.loaders.ImageLoader;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class WindowHelper {

    private Stage stage;
    private double width, height;
    private Pane pane;
    private String title;

    public WindowHelper() {

    }

    public void createWindow(String title, double width, double height, StageStyle stageStyle, Pane pane, Stage stage, String iconFile, boolean isResizable) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.stage = stage;
        this.pane = pane;

        stage.setTitle(title);

        stage.setWidth(width);
        stage.setHeight(height);

        stage.getIcons().add(ImageLoader.getImage(iconFile));

        if(isResizable) stage.setResizable(true);
        if(!isResizable) stage.setResizable(false);

        stage.initStyle(stageStyle);

        stage.setOnCloseRequest(event -> {
            Platform.exit();
            System.exit(0);
        });

        stage.setScene(new Scene(pane));

        stage.centerOnScreen();
        stage.show();
    }

    public void createWindow(String title, double width, double height, StageStyle stageStyle, Pane pane, Stage stage, boolean isResizable) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.stage = stage;
        this.pane = pane;

        stage.setTitle(title);

        stage.setWidth(width);
        stage.setHeight(height);

        if(isResizable) stage.setResizable(true);
        if(!isResizable) stage.setResizable(false);

        stage.initStyle(stageStyle);

        stage.setOnCloseRequest(event -> {
            Platform.exit();
            System.exit(0);
        });

        stage.setScene(new Scene(pane));

        stage.centerOnScreen();
        stage.show();
    }

    public Stage getStage() {
        return stage;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Pane getPane() {
        return pane;
    }

    public String getTitle() {
        return title;
    }
}
