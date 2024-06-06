package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
public class StudentEntity {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int studentId;
   
   @Column
   private String name;
   @Column
   private String Course;
   @Column
   private String batch;
   @Column
   private String regNo;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}
public String getBatch() {
	return batch;
}
public void setBatch(String batch) {
	this.batch = batch;
}
public String getRegNo() {
	return regNo;
}
public void setRegNo(String regNo) {
	this.regNo = regNo;
}
}