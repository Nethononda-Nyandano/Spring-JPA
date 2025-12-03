package com.start.start.Service;

import com.start.start.Entity.Student;
import com.start.start.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student find(String id) {
        return repository.findById(id).orElse(null);
    }

    public Student updateStudent(Student student) {
        if (repository.existsById(student.getStudent_id())) {
            return repository.save(student);
        }
        return null;
    }

    public void removeStudent(Student student) {
        repository.delete(student);
    }

}