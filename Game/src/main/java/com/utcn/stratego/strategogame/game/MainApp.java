package com.utcn.stratego.strategogame.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.log4j.Level;
import org.apache.log4j.chainsaw.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
  log.info("Starting Hello JavaFX and Maven demonstration application");

        String fxmlFile = "/fxml/index.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 600, 400);
        
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("Hello JavaFX and Maven");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
