package com.spring.professional.exam.tutorial.module01.question04.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Battery battery;
    private Engine engine;
    private Wheels wheels;
    private Gearbox gearbox;

    @Autowired
    public Car(Battery battery,Engine engine,Wheels wheels,Gearbox gearbox){
        this.battery = battery;
        this.engine = engine;
        this.wheels=wheels;
        this.gearbox = gearbox;
    }

    public void drive() {
        battery.supplyPower();
        engine.start();
        gearbox.putIntoDrivePosition();
        wheels.roll();
    }
}
