package com.timzowen.student.demo.service;

import com.timzowen.student.demo.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> saveAllStudents(List<Student> students);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    String deleteStudent(Long id);

    String deleteAllStudents();

    Student updateStudent(Long id, Student student);

    List<Student> getStudentsByGrade(String grade);


}
