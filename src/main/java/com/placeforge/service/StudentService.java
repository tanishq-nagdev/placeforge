package com.placeforge.service;

import com.placeforge.entity.Student;
import com.placeforge.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public Student getStudentById(Integer id){
        return studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student with id "+id+" not found"));

    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
   public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
   }
}
