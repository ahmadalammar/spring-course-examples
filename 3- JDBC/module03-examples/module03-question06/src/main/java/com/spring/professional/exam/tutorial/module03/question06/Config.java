package com.spring.professional.exam.tutorial.module03.question06;

import com.spring.professional.exam.tutorial.module03.question06.ds.TestBean;
import org.aspectj.weaver.ast.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope("prototype")
    public TestBean getBean(){

        return new TestBean("test");
    }
}
