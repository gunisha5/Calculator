package com.example.calculator_service.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calculator")
public class calculatorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_One", nullable = false)
    private int number_One;

    @Column(name = "number_Two", nullable = false)
    private int number_Two;

    @Column(name = "operation", nullable = false)
    private String operation;

    @Column(name = "answer", nullable = false)
    private int answer;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public calculatorEntity(){}
        
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public int getnumber_One() { return number_One; }
        public void setnumber_One(int number_One) { this.number_One = number_One; }
    
        public int getnumber_Two() { return number_Two; }
        public void setnumber_Two(int number_Two) { this.number_Two = number_Two; }

        public String getoperation() { return operation; }
        public void setoperation(String operation) { this.operation = operation; }
    
        public int getanswer() { return answer; }
        public void setsum(int answer) { this.answer = answer; }
        
        public LocalDateTime getCreatedAt() { return createdAt; }
        public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

}
