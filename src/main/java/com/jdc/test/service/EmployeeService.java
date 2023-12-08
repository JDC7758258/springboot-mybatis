package com.jdc.test.service;

import com.jdc.test.mapper.EmployeeMapper;
import com.jdc.test.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public void insertEmployee(Employee employee) {
        employeeMapper.insertEmployee(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeMapper.deleteEmployeeById(id);
    }

    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    public Employee selectEmployeeById(Long id) {
        return employeeMapper.selectEmployeeById(id);
    }

    public List<Employee> selectAllEmployees() {
        return employeeMapper.selectAllEmployees();
    }

    public List<Employee> selectEmployeesByName(String name) {
        return employeeMapper.selectEmployeesByName(name);
    }

    public List<Employee> selectEmployeesByPage(int start, int pageSize) {
        return employeeMapper.selectEmployeesByPage(start, pageSize);
    }
}

