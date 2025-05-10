package com.example.tryagainmodule2paa;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloApplication extends Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloApplication.class).run(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
