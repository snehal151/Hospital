package com.hospitalservices.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

@Autowired
 CrudRepository hospitalRepository;


    public Hospital saveHospital(Hospital hospital) {
        int newId =(int)hospitalRepository.count()+1;
        hospital.setId(newId);
        hospitalRepository.save(hospital);
        return hospital;
    }
    //---------------get by id---------------------

    public Hospital getHospital(int id)
    {
        Optional<Hospital> byId= hospitalRepository.findById(id);
        if(byId.isPresent()){
            return byId.get();
        }
        else
        {
            return null;
        }

    }

    //------------------ get All-----------------------

    public List<Hospital> getAllHospital() {

        List<Hospital> tempList = new ArrayList<>();
        Iterable<Hospital> iterable = hospitalRepository.findAll();
        Iterator<Hospital> iterator = iterable.iterator();
        while(iterator.hasNext()){
            Hospital hosp = iterator.next();
            tempList.add(hosp);
        }
        return tempList;
    }
}
