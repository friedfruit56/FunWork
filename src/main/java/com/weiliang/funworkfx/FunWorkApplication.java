package com.weiliang.funworkfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FunWorkApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FunWorkApplication.class.getResource("index-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 300);
        stage.setTitle("FunWork");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(e->{
            System.out.println("wokao");
        });
    }

    public static void main(String[] args) {
        launch();
    }
}