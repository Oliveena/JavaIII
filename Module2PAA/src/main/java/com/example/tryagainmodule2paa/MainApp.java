package com.example.tryagainmodule2paa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class MainApp extends Application {

    private static ApplicationContext context;

    @Override
    public void init() {
        context = new SpringApplicationBuilder(HelloApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tryagainmodule2paa/hello-view.fxml"));
        loader.setControllerFactory(context::getBean); // Use Spring's controller factory

        Scene scene = new Scene(loader.load());
        stage.setTitle("JavaFX + Spring Boot Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
