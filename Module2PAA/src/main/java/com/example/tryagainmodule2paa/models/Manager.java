package com.example.tryagainmodule2paa.models;

public class Manager extends Employee {

    private String managerialStyle;
    private double bonusRate; // e.g., 0.15 means 15% bonus

    public Manager(String name, int age, String email, double salary, String managerialStyle, double bonusRate) {
        super(name, age, email, salary);
        this.managerialStyle = managerialStyle;
        this.bonusRate = bonusRate;
    }

    public String getManagerialStyle() {
        return managerialStyle;
    }

    public void setManagerialStyle(String managerialStyle) {
        this.managerialStyle = managerialStyle;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public String displayInfo() {
        return "Manager: " + name + ", Age: " + age +
                ", Email: " + email + ", Salary: $" + salary +
                ", Style: " + managerialStyle;
    }

    @Override
    public double calculatePay() {
        return salary + (salary * bonusRate);
    }
}

