package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.StudentEntity;
import repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    
	@Override
	public void saveStudent(StudentEntity entity) {
	studentRepository.save(entity);	
	}

	@Override
	public void updateStudent(StudentEntity entity) {
		studentRepository.save(entity);	
	}

	@Override
	public StudentEntity getStudent(int studentId) {
		
		return studentRepository.findById(studentId).get();
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		List<StudentEntity>li=new ArrayList<StudentEntity>();
		studentRepository.findAll(li);
		return li;
	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);
		
	}
	 
}
