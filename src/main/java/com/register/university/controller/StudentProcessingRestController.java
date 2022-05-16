package com.register.university.controller;

import com.register.university.model.BachelorStudent;
import com.register.university.service.BachelorControlService;
import com.register.university.service.MasterControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/process")
public class StudentProcessingRestController {

    private BachelorControlService bachelorService;
    private MasterControlService masterService;

    @Autowired
    public StudentProcessingRestController(@Qualifier("bachelorService") BachelorControlService bachelorService,
                                           @Qualifier("masterService")MasterControlService masterService) {
        this.bachelorService = bachelorService;
        this.masterService = masterService;
    }

    @GetMapping("/bachelors")
    public List listBachelors(){
        return bachelorService.getAll();
    }

    @GetMapping("/masters")
    public List listMasters(){

        return masterService.getAll();
    }

    @PostMapping("/bachelors/approve/{id}")
    public void approveBachelor(@PathVariable("id") int id){
        bachelorService.approve(id);
    }

    @PostMapping("/masters/approve/{id}")
    public void approveMaster(@PathVariable("id") int id){
        masterService.approve(id);
    }

    @GetMapping("/bachelors/delete")
    public void deleteNotApprovedBachelors(){
        bachelorService.delete();
    }

    @PostMapping("/basters/delete")
    public void deleteNotApprovedMasters(){
        masterService.delete();
    }


}
