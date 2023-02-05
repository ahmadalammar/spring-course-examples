package com.spring.professional.exam.tutorial.module01.question14;

import com.spring.professional.exam.tutorial.module01.question14.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question14.beans.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
public class ApplicationConfiguration {
    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

    @Bean(initMethod = "initMethod")
    protected SpringBean1 springBean1() {
        return new SpringBean1();
    }

    @Bean(destroyMethod = "destroyMethod")
    protected SpringBean2 springBean2() {
        return new SpringBean2();
    }
}
