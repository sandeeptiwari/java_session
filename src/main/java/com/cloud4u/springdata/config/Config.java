package com.cloud4u.springdata.config;

import com.cloud4u.springdata.domain.CPU;
import com.cloud4u.springdata.service.Bike;
import com.cloud4u.springdata.service.Car;
import com.cloud4u.springdata.service.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {

    @Bean
    public CPU cpu() {
        return new CPU("i5", 7);
    }

    @Bean
    public Map<String, String> map() {
        Map map = new HashMap();
        map.put("diskZise", "500MB");
        return map;
    }

    @Bean
    public Vehicle car() {
        return new Car();
    }

    @Bean
    public Vehicle bike() {
        return new Bike();
    }
}
