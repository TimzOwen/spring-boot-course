package com.timzowen.student.demo.controller;


import com.timzowen.student.demo.model.Student;
import com.timzowen.student.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllStudents() {
        return studentService.deleteAllStudents();
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/grade/{grade}")
    public List<Student> fetchStudentsByGrade(@PathVariable String grade) {
        return studentService.getStudentsByGrade(grade);
    }

    @PostMapping("/saveAll")
    public List<Student> saveAllStudents(@RequestBody List<Student> students) {
        return studentService.saveAllStudents(students);
    }

}
