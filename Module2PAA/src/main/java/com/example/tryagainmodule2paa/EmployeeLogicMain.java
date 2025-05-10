package com.example.tryagainmodule2paa;

import com.example.tryagainmodule2paa.models.*;

public class EmployeeLogicMain {

    public static void main(String[] args) {
        // Create Employees using the factory
        Employee developer = EmployeeFactory.createEmployee("developer", "John Doe", 28, "john.doe@example.com", 60000, "Java");
        Employee manager = EmployeeFactory.createEmployee("manager", "Jane Smith", 35, "jane.smith@example.com", 80000, "Democratic");
        Employee intern = EmployeeFactory.createEmployee("intern", "Alice Johnson", 22, "alice.johnson@example.com", 15000, "Summer Internship");

        // Create a team and add members
        Team<Employee> team = new Team<>();
        team.addTeamMember(developer);
        team.addTeamMember(manager);
        team.addTeamMember(intern);

        // Print information about the team
        team.printTeamInfo();

        // Calculate and print pay for each employee
        for (Employee employee : team.getTeamMembers()) {
            System.out.println(employee.getName() + "'s Pay: " + employee.calculatePay());
        }
    }
}
