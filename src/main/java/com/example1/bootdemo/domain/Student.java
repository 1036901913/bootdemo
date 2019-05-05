package com.example1.bootdemo.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer sid;

    private String sname;

    private String gender;

    private String phone;

    private Double sal;

    private String address;

}