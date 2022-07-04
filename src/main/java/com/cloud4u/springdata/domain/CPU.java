package com.cloud4u.springdata.domain;

import org.springframework.context.annotation.Bean;

public class CPU {
    private String name;
    private int generation;


    public CPU(String name, int generation) {
        this.name = name;
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                ", generation=" + generation +
                '}';
    }
}
