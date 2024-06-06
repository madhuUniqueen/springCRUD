package service;

import java.util.List;
import entity.StudentEntity;

public interface StudentService {
   public void saveStudent(StudentEntity entity);
   public void updateStudent(StudentEntity entity);
   public StudentEntity getStudent(int studentId);
   public List<StudentEntity>getAllStudents();
   public void deleteStudent(int studentId);
}
