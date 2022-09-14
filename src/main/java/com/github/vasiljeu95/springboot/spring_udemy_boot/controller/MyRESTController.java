package com.github.vasiljeu95.springboot.spring_udemy_boot.controller;

import com.github.vasiljeu95.springboot.spring_udemy_boot.entity.Employee;
import com.github.vasiljeu95.springboot.spring_udemy_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * MyRESTController
 *
 * @author Stepan Vasilyeu
 * @since 12.09.2022
 */
@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees () {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

//    @GetMapping("/employees/{id}")
//    public Employee showEmployeeById (@PathVariable int id) {
//        Employee employee = employeeService.getEmployee(id);
//
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee (@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//
//        return employee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee (@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee (@PathVariable int id) {
//        Employee employee = employeeService.getEmployee(id);
//        if (employee == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in DataBase");
//        }
//        employeeService.deleteEmployee(employee);
//
//        return "Employee with ID = " + id + " was deleted";
//    }
}
