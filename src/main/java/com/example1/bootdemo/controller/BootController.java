package com.example1.bootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BootController {


    @RequestMapping("/getAll")
    public Map<String, Object> getAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "tom");
        map.put("gender", "woman");
        map.put("age", 19);
        map.put("ismarry", false);
        return map;
    }

}
