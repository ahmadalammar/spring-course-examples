package com.spring.professional.exam.tutorial.module06.question05.dao;

import com.spring.professional.exam.tutorial.module06.question05.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesDao extends CrudRepository<Employee, Integer> {
}
