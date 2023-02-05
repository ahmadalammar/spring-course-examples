package com.spring.professional.exam.tutorial.module03.question02.boot.service;

import com.spring.professional.exam.tutorial.module03.question02.boot.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeReportService {

    @Autowired
    private EmployeeDao employeeDao;


    public void printReport() {
        employeeDao.findEmployeeEmails()
                .forEach(System.out::println);
        employeeDao.findEmployeeEmails()
                .forEach(System.out::println);
    }
}
