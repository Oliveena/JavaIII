package com.example.tryagainmodule2paa.repo;

import com.example.tryagainmodule2paa.models.Employee;
import java.util.List;

public interface EmployeeRepo {
    void save(Employee employee);
    List<Employee> findAll();
}
