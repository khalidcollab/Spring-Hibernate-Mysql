package com.springboot.sql.com.sql_example.Resource;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.springboot.sql.com.sql_example.model.student;
import com.springboot.sql.com.sql_example.repository.studentRepository;


@Controller
@RestController
@RequestMapping("/student")
public class Resource {

    @Autowired
    studentRepository studentRepository;

    @GetMapping("/all")
    public List<student> getAll(){
        return studentRepository.findAll();
    }
	

}
