package com.example.tryagainmodule2paa.models;

public class EmployeeFactory {

    // Factory method to create employees
    public static Employee createEmployee(String type, String name, int age, String email, double salary, String extra) {
        switch (type.toLowerCase()) {
            case "developer":
                return new Developer(name, age, email, salary, extra); // 'extra' is the programming language
            case "intern":
                return new Intern(name, age, email, salary, extra); // 'extra' is the program name
            case "manager":
                return new Manager(name, age, email, salary, extra, 0.15); // 'extra' is the managerial style, bonusRate is fixed
            default:
                throw new IllegalArgumentException("Invalid employee type");
        }
    }
}
