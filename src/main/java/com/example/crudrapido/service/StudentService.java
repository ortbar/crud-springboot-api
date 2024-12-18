package com.example.crudrapido.service;
import java.util.List;
import java.util.Optional;

import com.example.crudrapido.entity.Student;
import com.example.crudrapido.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired //inyeccion de repository. definir repository en el servicio
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    public Student saveOrUpdate(Student student) {
        return studentRepository.save(student);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
















}
