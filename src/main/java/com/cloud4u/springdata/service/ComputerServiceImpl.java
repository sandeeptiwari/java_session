package com.cloud4u.springdata.service;

import com.cloud4u.springdata.domain.CPU;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ComputerServiceImpl {

    private final CPU cpu;

    private final Map<String, String> map;

    public ComputerServiceImpl(CPU cpu, Map<String, String> map) {
        this.cpu = cpu;
        this.map = map;
    }

    public String cpuInfo() {
        return cpu.toString() + "Prtition Details " + map;
    }
}
