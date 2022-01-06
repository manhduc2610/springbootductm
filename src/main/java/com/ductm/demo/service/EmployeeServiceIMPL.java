package com.ductm.demo.service;

import com.ductm.demo.Model.Employee;
import com.ductm.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceIMPL implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee getEmployee() {

        return employeeRepo.findById("1").get();
    }

    @Override
    public List<Employee> getListEmployee() {
        return employeeRepo.findAll();
    }

//    @Override
//    public boolean addUser(Employee emp) {
//        try {
//            employeeRepo.addUser(emp.getEmpName(),emp.getEmpId(),"cccc")  ;
//            return true;
//        }
//        catch (Exception exc){
//            return false;
//        }
//
//    }

}
