package com.spring.professional.exam.tutorial.module03.question06.ds;

import org.springframework.context.annotation.Scope;

public class TestBean {
    public String v;

    public TestBean(String v){
        this.v=v;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
