package com.jdc.test.controller;

import com.jdc.test.pojo.Employee;
import com.jdc.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public void insertEmployee(@RequestBody Employee employee) {
        employeeService.insertEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        employeeService.updateEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee selectEmployeeById(@PathVariable Long id) {
        return employeeService.selectEmployeeById(id);
    }

    @GetMapping
    public List<Employee> selectAllEmployees() {
        return employeeService.selectAllEmployees();
    }

    @GetMapping("/search")
    public List<Employee> selectEmployeesByName(@RequestParam String name) {
        return employeeService.selectEmployeesByName(name);
    }

    @GetMapping("/page")
    public List<Employee> selectEmployeesByPage(@RequestParam int start, @RequestParam int pageSize) {
        return employeeService.selectEmployeesByPage(start, pageSize);
    }
}


