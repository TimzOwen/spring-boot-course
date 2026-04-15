package com.timzowen.student.demo.service;

import com.timzowen.student.demo.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> saveAllStudents(List<Student> students);

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    Student updateStudent(Long id, Student updatedStudent);

    String deleteStudent(Long id);

    String deleteAllStudents();



}
