package com.hospitalservices.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @PostMapping
    public ResponseEntity postHospital(@RequestBody Hospital hospital) {
        System.out.println("Hi, you are in Hospital post..!");
        Hospital saveHospital = hospitalService.saveHospital(hospital);
        if (saveHospital == null) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity(HttpStatus.CREATED);
        }

    }

    @GetMapping("/hospital/{id}")
    public ResponseEntity<Hospital> getHospital(@PathVariable int id) {
        System.out.println("Hi, you are in Hospital get..!");
        //  return "Hospital";
        Hospital retrievedHospital = hospitalService.getHospital(id);
        if (retrievedHospital == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @GetMapping
    public ResponseEntity<List<Hospital>> getAll() {
        List<Hospital> allHospital = hospitalService.getAllHospital();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
