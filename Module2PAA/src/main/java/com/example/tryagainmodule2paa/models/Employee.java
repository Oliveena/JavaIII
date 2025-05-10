package com.example.tryagainmodule2paa.models;

public abstract class Employee {
    protected String name;
    protected int age;
    protected String email;
    protected double salary;

    public Employee(String name, int age, String email, double salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract String displayInfo();

    public abstract double calculatePay();
}
