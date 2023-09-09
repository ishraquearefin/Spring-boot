package com.example.key.service;

import com.example.key.model.Division;
import com.example.key.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionService {

    @Autowired
    private DivisionRepository divisionRepository;
    public String addDivision(String division){

        try{
            Division divisionObject = new Division();
            divisionObject.setName(division);
            divisionRepository.save(divisionObject);
            return "division added successfully";
        }
        catch (Exception ex){
            return ex.getMessage();
        }

    }
}
