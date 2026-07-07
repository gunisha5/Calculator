package com.example.calculator_service.repository;

import com.example.calculator_service.domain.calculatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface calculationRepository extends JpaRepository<calculatorEntity, Long>{

}

    
    
