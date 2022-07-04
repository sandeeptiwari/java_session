package com.cloud4u.springdata.controller;

import com.cloud4u.springdata.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/wheel")
    public ResponseEntity<?> getWheel() {
        return new ResponseEntity<>(vehicleService.getVehicle(), HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<?> getName() {
        return new ResponseEntity<>(vehicleService.getVehicleName(), HttpStatus.OK);
    }
}
