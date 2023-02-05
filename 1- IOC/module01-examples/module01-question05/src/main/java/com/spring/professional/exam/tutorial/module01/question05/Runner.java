package com.spring.professional.exam.tutorial.module01.question05;

import com.spring.professional.exam.tutorial.module01.question05.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        /*
        first it will resolve all depencies then call before then init method then after
        * */
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            SpringBean1 springBean1 = context.getBean(SpringBean1.class);
        }
    }
}
