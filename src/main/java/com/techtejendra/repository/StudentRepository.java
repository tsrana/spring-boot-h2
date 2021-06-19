package com.techtejendra.repository;

import org.springframework.data.repository.CrudRepository;  
import com.techtejendra.model.Student;  
public interface StudentRepository extends CrudRepository<Student, Integer>  
{  
}  