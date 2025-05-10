package com.example.tryagainmodule2paa.repo;

import com.example.tryagainmodule2paa.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository implements EmployeeRepo {
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }
}
