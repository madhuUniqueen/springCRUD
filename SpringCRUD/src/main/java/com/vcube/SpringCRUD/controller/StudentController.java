package com.vcube.SpringCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.StudentEntity;
import service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
@PostMapping("/api/create-student")
  public int createStudent(@RequestBody StudentEntity entity) {
	service.saveStudent(entity);
	return entity.getStudentId();	
}
@PutMapping("/api/update-student")
  public String updateStudent(@RequestBody StudentEntity entity) {
	service.updateStudent(entity);
	return "student updated";
}
@GetMapping("/api/get-student/{id}")
  public StudentEntity getStudent(@PathVariable int id) {
  return service.getStudent(id);
}
@GetMapping("/api/get-all-students")
public List<StudentEntity> getAllStudents(){
	return service.getAllStudents();	
}
@DeleteMapping("/api/delete-student/{id}")
  public String deleteStudent(@PathVariable int id) {
	service.deleteStudent(id);
	return "student deleted";
}
}





