package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
  @Query(*FROM Student s Where s.name= :n")
  List<Student>getAllByName(@Param("n") String name);

  @Query("FROM Student s where s.age>:age")
}