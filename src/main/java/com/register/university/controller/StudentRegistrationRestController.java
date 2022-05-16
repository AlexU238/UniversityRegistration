package com.register.university.controller;


import com.register.university.model.BachelorStudent;
import com.register.university.model.MasterStudent;
import com.register.university.service.StudentRegistrationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class StudentRegistrationRestController {

    private StudentRegistrationsService studentControlService;

    @Autowired
    public StudentRegistrationRestController(@Qualifier("studentService") StudentRegistrationsService studentControlService) {
        this.studentControlService = studentControlService;
    }

    @PostMapping("/bachelor")
    public void registerBachelorStudent(@RequestBody BachelorStudent bachelorStudent){
        bachelorStudent.setId(0);
        studentControlService.registerStudent(bachelorStudent);
    }

    @PostMapping("/master")
    public void registerMasterStudent(@RequestBody MasterStudent masterStudent){
        masterStudent.setId(0);
        studentControlService.registerStudent(masterStudent);
    }
}
