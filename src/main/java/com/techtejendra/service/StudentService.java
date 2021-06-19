package com.techtejendra.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.techtejendra.model.Student;  
import com.techtejendra.repository.StudentRepository;  
@Service  
public class StudentService   
{  
	@Autowired  
	StudentRepository studentRepository;  
	public List<Student> getAllStudent()   
	{  
		List<Student> students = new ArrayList<Student>();  
		studentRepository.findAll().forEach(student -> students.add(student));  
		return students;  
	}  
	
	//getting a specific record  
	public Student getStudentById(int id)   
	{  
		return studentRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Student student)   
	{  
		studentRepository.save(student);  
	}  
	
	//deleting a specific record  
	public void delete(int id)   
	{  
		studentRepository.deleteById(id);  
	}  
}  