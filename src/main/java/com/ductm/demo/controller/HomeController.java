package com.ductm.demo.controller;

import com.ductm.demo.Model.Employee;
import com.ductm.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("getEmp")
    public Employee getEmp(){
        return employeeService.getEmployee();
    }

    @RequestMapping("getListEmp")
    public List<Employee> getListEmp(){
        return employeeService.getListEmployee();
    }

    @RequestMapping("hello")
    public String firtpage(){
        return "Hello World";
    }
}
