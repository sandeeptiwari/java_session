package com.cloud4u.springdata.service;

import org.springframework.context.annotation.Configuration;

public class Car implements Vehicle {
    @Override
    public int getWheel() {
        return 4;
    }
}
