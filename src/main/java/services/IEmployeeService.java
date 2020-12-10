package services;

import entities.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    void save(Employee customer);

    Employee findById(int id);

    void update(int id, Employee customer);

    void remove(int id);
}
