package services;


import entities.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployeeService {
    private static Map<Integer, Employee> customers;
    static {

        customers = new HashMap<>();
        customers.put(1, new Employee(1, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Employee(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Employee(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Employee(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new Employee(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Employee(6, "Rose", "rose@codegym.vn", "Newyork"));
    }
    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Employee customer) {

        customers.put(customer.getId(), customer);
    }

    @Override
    public Employee findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Employee customer) {
        customers.put(id, customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
