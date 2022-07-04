package com.cloud4u.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Value("${carname}")
    private String carName;

    @Autowired
    @Qualifier("bike")
    private Vehicle vehicle;


    public int getVehicle() {
        return vehicle.getWheel();
    }

    public String getVehicleName() {
        return carName;
    }
}
