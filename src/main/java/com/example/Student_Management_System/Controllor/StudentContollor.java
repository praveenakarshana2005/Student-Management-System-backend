package com.example.Student_Management_System.Controllor;

import com.example.Student_Management_System.Entity.Student;
import com.example.Student_Management_System.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentContollor {

    private final StudentService studentService;

    @PostMapping("/add")
    public Student addstudent(@RequestBody Student student){
        return studentService.addstudent(student);
    }
}
