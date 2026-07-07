package com.example.calculator_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator_service.domain.calculatorEntity;
import com.example.calculator_service.service.calculationService;

@RestController
@RequestMapping("/calculator")
public class calculatorController {
    @Autowired
    private calculationService calculationService;

    @PostMapping("/add")
    public ResponseEntity<calculatorEntity> add(@RequestBody calculatorEntity number) {
        
        return ResponseEntity.ok(calculationService.add(number));
        
    }
    @PostMapping("/sub")
    public ResponseEntity<calculatorEntity> sub(@RequestBody calculatorEntity number) {
        
        return ResponseEntity.ok(calculationService.sub(number));
        
    }
    @PostMapping("/mul")
    public ResponseEntity<calculatorEntity> mul(@RequestBody calculatorEntity number) {
        
        return ResponseEntity.ok(calculationService.mul(number));
        
    }

    
}