package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository stdrepo;
    @Override
    public Student poststudent(Student st){
        return stdrepo.save(st);
    }
    @Override
    public List<Student> getAllByName(Student name){
        return stdrepo.findAll();
    }
    @Override
    public Optional<Student> getById(Long id){
        return stdrepo.findById(id);
    }
    @Override
    public String updateData(Long id, Student st){
        boolean status=stdrepo.existsById(id);
        if(status){
            st.setId(id);
            stdrepo.save(st);
            return "Student updated successfully";
        }
        else{
            return "Student with Id "+id+" not found";
        }
    }
    @Override
    public String deleteData(Long id){
       boolean status=stdrepo.existsById(id);
       if(status){
           stdrepo.deleteById(id);
           return "Student Deleted Successfully";
       }else{
        return "Student with ID "+id+" not found";
       }
    }
}
