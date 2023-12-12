package com.example.demo5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {

    private static final Image logo = new Image(new File("src/main/resources/image/logo.png").toURI().toString());
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inbox chat");
        stage.setScene(scene);
        stage.getIcons().add(logo);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}