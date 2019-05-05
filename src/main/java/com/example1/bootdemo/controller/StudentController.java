package com.example1.bootdemo.controller;

import com.example1.bootdemo.domain.Student;
import com.example1.bootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/queryAll")
    public List<Student> queryAll() {
        return studentService.queryAll();
    }

}
