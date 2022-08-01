package org.example.sun.controller;

import org.example.sun.entity.Student;
import org.example.sun.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("student")
public class StudentCroller {

    @Autowired
    private StudentRepository repository;

    @RequestMapping("findAll")
    public Collection<Student> findAll(){
        return repository.findAll();
    }

    @RequestMapping("findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return repository.findById(id);
    }
}
