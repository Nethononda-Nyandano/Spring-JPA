package com.start.start.Controller;

import com.start.start.Entity.Student;
import com.start.start.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String home() {
        return "Student API:\n" +
                "Create Student    \t:api/student/create\n" +
                "Get All Students  \t:api/student/get\n" +
                "Get Student by id \t:api/student/get/id\n" +
                "Update Student    \t:api/student/update\n" +
                "Delete            \t:api/student/delete/{id}";
    }

    @PostMapping("/create")
    public Student createStudent(Student student) {
        return service.createStudent(student);
    }

    @GetMapping("/get")
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable String id) {
        return service.find(id);
    }

    @PutMapping("/update")
    public Student updateStudent(@PathVariable Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        Student student = service.find(id);
        if (student != null) {
            service.removeStudent(student);
            return "Student deleted successfully";
        }
        return "Student not found";
    }
}
