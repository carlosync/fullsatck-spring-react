package com.foundationvip.aura.controller;

import com.foundationvip.aura.model.Gender;
import com.foundationvip.aura.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(
                        1L,
                        "Carlos",
                        "2021020204",
                        "carlos@aura.edu",
                        Gender.MALE
                ),
                new Student(
                        2L,
                        "Jamires",
                        "2021050721",
                        "jamires@aura.edu",
                        Gender.FEMALE
                )
        );
        return students;
    }

}
