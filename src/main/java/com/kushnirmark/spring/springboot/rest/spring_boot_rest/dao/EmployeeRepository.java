package com.kushnirmark.spring.springboot.rest.spring_boot_rest.dao;




import com.kushnirmark.spring.springboot.rest.spring_boot_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
