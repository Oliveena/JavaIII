package com.example.tryagainmodule2paa;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.tryagainmodule2paa") // Ensure Spring scans your package
public class HelloApplication extends Application {

    public static void main(String[] args) {
        // Launch Spring Boot and JavaFX
        new SpringApplicationBuilder(HelloApplication.class).run(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // This is where your JavaFX UI logic will go
        // But before that, let's call the business logic

        // Call the logic from EmployeeLogicMain
        EmployeeLogicMain.main(new String[0]);  // You can call the logic from the Main class

        // Continue with your JavaFX UI logic here
        stage.setTitle("JavaFX + Spring Boot");
        stage.show();
    }
}
