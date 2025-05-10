package com.example.tryagainmodule2paa.service;

import com.example.tryagainmodule2paa.models.*;
import com.example.tryagainmodule2paa.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final EmployeeRepo employeeRepo;

    public TeamService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void addMember(String name, int age, String email, double salary, String role,
                          String language, String managerialStyle, double bonusRate, String program) {
        Employee employee;
        switch (role) {
            case "Developer" -> employee = new Developer(name, age, email, salary, language);
            case "Manager" -> employee = new Manager(name, age, email, salary, managerialStyle, bonusRate);
            case "Intern" -> employee = new Intern(name, age, email, salary, program);
            default -> throw new IllegalArgumentException("Invalid role");
        }

        if ("Manager".equals(role) && bonusRate <= 0) {
            throw new IllegalArgumentException("Managers must have a positive bonus rate.");
        }

        employeeRepo.save(employee);
    }

    public List<Employee> getTeamMembers() {
        return employeeRepo.findAll();
    }
}
