package com.example1.bootdemo.dao;

import com.example1.bootdemo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {


    List<Student> queryAll();


}