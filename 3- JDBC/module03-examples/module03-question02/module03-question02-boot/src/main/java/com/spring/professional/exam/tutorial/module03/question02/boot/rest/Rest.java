package com.spring.professional.exam.tutorial.module03.question02.boot.rest;


import com.spring.professional.exam.tutorial.module03.question02.boot.service.EmployeeReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books-rest")
public class Rest {

    @Autowired
    private EmployeeReportService employeeReportService;


    @Transactional
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String showForm() throws InterruptedException {
        try {
            employeeReportService.printReport();
            Thread.sleep(15000);

        }catch (Exception e){
            employeeReportService.printReport();}
        return "Hi";
    }



}
