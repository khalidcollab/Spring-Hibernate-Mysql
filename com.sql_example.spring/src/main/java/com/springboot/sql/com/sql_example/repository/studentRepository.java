package com.springboot.sql.com.sql_example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sql.com.sql_example.model.student;

public interface studentRepository extends JpaRepository<student, Integer>{

	//List<student> findAll();

}
