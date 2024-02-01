package com.example.baseDati;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studenti")
@AllArgsConstructor
@NoArgsConstructor
public class StudentController {
    private StudentRepository studentRepository;

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
