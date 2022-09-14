package com.github.vasiljeu95.springboot.spring_udemy_boot.service;

import com.github.vasiljeu95.springboot.spring_udemy_boot.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);
}
