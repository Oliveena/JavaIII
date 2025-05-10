package com.example.tryagainmodule2paa.models;

public class Intern extends Employee {
    String program;

    public Intern(String name, int age, String email, double salary, String program) {
        super(name, age, email, salary);
        this.program = program;
    }

    @Override
    public String displayInfo() {
        return "Intern: " + name + ", Age: " + age + ", Email: " + email + ", Salary: $" + salary + ", Program: " + program;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
