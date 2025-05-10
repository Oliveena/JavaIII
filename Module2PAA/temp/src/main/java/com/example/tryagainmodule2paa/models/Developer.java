package com.example.tryagainmodule2paa.models;

public class Developer extends Employee {
    String language;

    public Developer(String name, int age, String email, double salary, String language) {
        super(name, age, email, salary);
        this.language = language;
    }

    @Override
    public String displayInfo() {
        return "Developer: " + name + ", Age: " + age + ", Email: " + email + ", Salary: $" + salary + ", Language: " + language;
    }

    @Override
    public double calculatePay() {
        return salary * 1.25;
    }
}
