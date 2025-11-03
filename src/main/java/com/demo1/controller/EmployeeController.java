package com.demo1.controller;


import org.springframework.web.bind.annotation.*;

import com.demo1.model.Employee;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeController() {
        // Static data 
        employees.add(new Employee(1, "Pankaj Naik", "IT", 55000));
        employees.add(new Employee(2, "Rohit Sharma", "Sales", 60000));
        employees.add(new Employee(3, "Virat Kohli", "HR", 50000));
    }

   
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees;
    }

    //GET 
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // ✅ POST - Add a new employee
    @PostMapping
    public String addEmployee(@RequestBody Employee newEmp) {
        employees.add(newEmp);
        return "Employee added successfully!";
    }

    // Update
    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmp) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(updatedEmp.getName());
                emp.setDepartment(updatedEmp.getDepartment());
                emp.setSalary(updatedEmp.getSalary());
                return "Employee updated successfully!";
            }
        }
        return "Employee not found!";
    }

    // DELETE 
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        boolean removed = employees.removeIf(emp -> emp.getId() == id);
        return removed ? "Employee deleted successfully!" : "Employee not found!";
    }
}
