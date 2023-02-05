package com.spring.professional.exam.tutorial.module03.question06;


import com.spring.professional.exam.tutorial.module03.question06.ds.Employee;
import com.spring.professional.exam.tutorial.module03.question06.ds.TestBean;
import com.spring.professional.exam.tutorial.module03.question06.service.EmployeeReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("plus-api")
public class Rest {

    @Autowired
    private EmployeeReportService employeeReportService;

    @Autowired
    private TestBean testBean;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String showForm() throws InterruptedException {

        try {
            employeeReportService.printReportInTransaction();
            Thread.sleep(6000);

        }catch (Exception e){
            employeeReportService.printReport();}
        return "Hi :"+testBean.getV();
    }


    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public String setv() throws InterruptedException {

        try {
            employeeReportService.printReportInTransaction();
            //Thread.sleep(45000);
            testBean.setV("set alreadyyyyy");
        }catch (Exception e){
            employeeReportService.printReport();}
        return "Hi :"+testBean.getV();
    }



}
