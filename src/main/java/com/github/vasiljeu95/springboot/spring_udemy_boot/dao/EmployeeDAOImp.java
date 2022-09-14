package com.github.vasiljeu95.springboot.spring_udemy_boot.dao;

import com.github.vasiljeu95.springboot.spring_udemy_boot.entity.Employee;
//import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * EmployeeDaoImp
 *
 * @author Stepan Vasilyeu
 * @since 08.09.2022
 */
@Repository
public class EmployeeDAOImp implements EmployeeDAO {
    @Autowired
    private EntityManager entityManager;

    @ Override
    public List<Employee> getAllEmployees() {
//        Session session = entityManager.unwrap(Session.class);
//        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).getResultList();

        Query query = entityManager.createQuery("FROM Employee");
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);

        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);

        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        session.delete(employee);

        Query query = entityManager.createQuery("DELETE FROM Employee WHERE id =: employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
