package com.example.tryagainmodule2paa.controller;

import com.example.tryagainmodule2paa.models.Developer;
import com.example.tryagainmodule2paa.models.Employee;
import com.example.tryagainmodule2paa.models.Intern;
import com.example.tryagainmodule2paa.models.Manager;
import com.example.tryagainmodule2paa.repo.EmployeeRepo;
import com.example.tryagainmodule2paa.service.TeamService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TeamController {

    @FXML
    private ComboBox<String> roleSelector;
    @FXML private TextField nameInput;
    @FXML private TextField ageInput;
    @FXML private TextField emailInput;
    @FXML private TextField salaryInput;
    @FXML private ListView<Employee> teamList;
    @FXML private TextField languageInput;
    @FXML private TextField managerialStyleInput;
    @FXML private TextField bonusRateInput;
    @FXML private TextField programInput;

    private final TeamService teamService = new TeamService(new EmployeeRepo() {
        @Override
        public void save(Employee employee) {
        }

        @Override
        public List<Employee> findAll() {
            return List.of();
        }
    });

    @FXML
    public void initialize() {
        roleSelector.getItems().addAll("Developer", "Manager", "Intern");

        languageInput.setVisible(false);
        managerialStyleInput.setVisible(false);
        bonusRateInput.setVisible(false);
        programInput.setVisible(false);

        languageInput.setPromptText("Programming language");
        managerialStyleInput.setPromptText("Managerial style");
        bonusRateInput.setPromptText("Bonus rate (e.g. 0.15)");
        programInput.setPromptText("Internship program");

        roleSelector.setOnAction(event -> updateFieldVisibility());

        refreshTeamList();
    }

    private void updateFieldVisibility() {
        String selectedRole = roleSelector.getValue();

        languageInput.setVisible(false);
        managerialStyleInput.setVisible(false);
        bonusRateInput.setVisible(false);
        programInput.setVisible(false);

        if ("Developer".equals(selectedRole)) {
            languageInput.setVisible(true);
        } else if ("Manager".equals(selectedRole)) {
            managerialStyleInput.setVisible(true);
            bonusRateInput.setVisible(true);
        } else if ("Intern".equals(selectedRole)) {
            programInput.setVisible(true);
        }
    }

    @FXML
    public void handleAddMember() {
        try {
            String name = nameInput.getText();
            if (name.isBlank()) throw new IllegalArgumentException("Name is required.");

            int age = Integer.parseInt(ageInput.getText());
            String email = emailInput.getText();
            if (!email.contains("@")) throw new IllegalArgumentException("Invalid email.");

            double salary = Double.parseDouble(salaryInput.getText());
            String role = roleSelector.getValue();

            String language = languageInput.getText();
            String managerialStyle = managerialStyleInput.getText();
            double bonusRate = bonusRateInput.getText().isEmpty() ? 0.0 : Double.parseDouble(bonusRateInput.getText());
            String program = programInput.getText();

            teamService.addMember(name, age, email, salary, role, language, managerialStyle, bonusRate, program);

            refreshTeamList();
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Validation error: " + e.getMessage());
        }
    }

    private void refreshTeamList() {
        teamList.setItems(FXCollections.observableArrayList(teamService.getTeamMembers()));
    }
}
