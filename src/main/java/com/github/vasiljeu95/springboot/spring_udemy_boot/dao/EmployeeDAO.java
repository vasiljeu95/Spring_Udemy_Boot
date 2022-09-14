package com.github.vasiljeu95.springboot.spring_udemy_boot.dao;

import com.github.vasiljeu95.springboot.spring_udemy_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

//    public void saveEmployee(Employee employee);
//
//    public Employee getEmployee(int id);
//
//    public void deleteEmployee(Employee employee);
}
