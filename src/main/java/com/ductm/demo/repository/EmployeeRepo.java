package com.ductm.demo.repository;

import com.ductm.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String> {
    @Query(value = "Insert into users(name,password,email) values(:name,:password,:email)", nativeQuery = true)
    void addUser(@Param("name") String name, @Param("password") String password, @Param("email") String email);
}
