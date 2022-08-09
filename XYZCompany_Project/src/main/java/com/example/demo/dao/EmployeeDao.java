package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Employee;
@RepositoryRestResource(path="emp")
@CrossOrigin("http://localhost:4200/")
public interface EmployeeDao extends JpaRepository<Employee, Integer>
{
	List<Employee> findByEnameIgnoreCase(String ename);

}
