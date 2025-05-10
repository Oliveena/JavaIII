module com.example.tryagainmodule2paa {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.boot.autoconfigure;

    opens com.example.tryagainmodule2paa to spring.core, javafx.fxml;
}
