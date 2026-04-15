package com.timzowen.student.demo.service;

import com.timzowen.student.demo.model.Student;
import com.timzowen.student.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> saveAllStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return ("Student with " + id + " deleted successfully");
    }

    public String deleteAllStudents() {
        studentRepository.deleteAll();
        return ("All students deleted successfully");
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = getStudentById(id);
        existingStudent.setName(updatedStudent.getName());
        existingStudent.setGrade(updatedStudent.getGrade());
        return studentRepository.save(existingStudent);
    }

}
