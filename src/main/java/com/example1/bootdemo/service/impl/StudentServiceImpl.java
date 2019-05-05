package com.example1.bootdemo.service.impl;

import com.example1.bootdemo.dao.StudentMapper;
import com.example1.bootdemo.domain.Student;
import com.example1.bootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper mapper;

    @Override
    public List<Student> queryAll() {
        return mapper.queryAll();
    }
}
