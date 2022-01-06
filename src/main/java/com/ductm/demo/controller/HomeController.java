package com.ductm.demo.controller;

import com.ductm.demo.Model.Employee;
import com.ductm.demo.service.EmployeeService;

import com.ductm.demo.Model.User;
import com.ductm.demo.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {
//    @Autowired
    private final EmployeeService employeeService;


//    @Autowired
    private final UserService userService;

    @RequestMapping("/getEmp")
    public Employee getEmp(){
        return employeeService.getEmployee();
    }

    @RequestMapping("/getListEmp")
    public List<Employee> getListEmp(){
        return employeeService.getListEmployee();
    }

//    @PostMapping("/addEmp")
//    public User addUser(@RequestBody User user){
//        return userService.addUser(user);
//    }
    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
