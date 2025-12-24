package com.example.demo.entity;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @NotBlank(message="Id should not be empty,null or blank")
    private Long id;
    private String name;
    private String dept;
    @Past(message="Present and Future date cannot be accepted")
    private Long age;
    private float cgpa;
    private bool isPlaced;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public Long getAge(){
        return age;
    }
    public void setAge(LocalDate dob){
        this.age=age;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public Student(){

    }
    public Student(Long id,String name,String dept,LocalDate dob,float cgpa){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.dob=dob;
        this.cgpa=cgpa;
    }
}