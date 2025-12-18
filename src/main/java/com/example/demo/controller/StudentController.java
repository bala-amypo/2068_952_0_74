package com.example.demo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }
    @GetMapping("/getall")
    public List<Student> get(){
        return stdser.getAllStudents();
    }
    @GetMapping("/getById/id")
    public Optional<Student> getId(@PathVariable Long id){
        return stdser.getById(id);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Student st){
        return stdser.updateData(id,st);
    }
}