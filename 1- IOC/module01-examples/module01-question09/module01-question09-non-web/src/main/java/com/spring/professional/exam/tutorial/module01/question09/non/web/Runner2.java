package com.spring.professional.exam.tutorial.module01.question09.non.web;

import com.spring.professional.exam.tutorial.module01.question09.non.web.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner2 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {

            SpringBean1 springBean1 = context.getBean(SpringBean1.class);
            springBean1.sayHello();
        }
    }
}
