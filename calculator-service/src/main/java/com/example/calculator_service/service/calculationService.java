package com.example.calculator_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.calculator_service.domain.calculatorEntity;
import com.example.calculator_service.repository.calculationRepository;

@Service
public class calculationService {

    @Autowired
    private calculationRepository calculationRepository;
    
    public calculatorEntity add (calculatorEntity number){

        int sum = number.getnumber_One() + number.getnumber_Two();

        number.setsum(sum);

        return calculationRepository.save(number);



    }
    public calculatorEntity sub (calculatorEntity number){

        int sub = number.getnumber_One() - number.getnumber_Two();

        number.setsum(sub);

        return calculationRepository.save(number);



    }
    public calculatorEntity mul (calculatorEntity number){

        int mul = number.getnumber_One() * number.getnumber_Two();

        number.setsum(mul);

        return calculationRepository.save(number);



    }
    
}
