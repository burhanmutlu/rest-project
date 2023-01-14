package com.burhanmutlu.restProject.controller;

import com.burhanmutlu.restProject.service.abstracts.UniversityService;
import com.burhanmutlu.restProject.dtos.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UniversityController {

    private UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        super();
        this.universityService = universityService;
    }
    @RequestMapping(value = "/search" )
    @ResponseBody
    public List<University> getByCountryName(@RequestParam("country") String countryName) {
        return this.universityService.getByCountryName(countryName);
    }

    @RequestMapping(value = "/search/all" )
    @ResponseBody
    public List<University> getAllUniversity() {
        return this.universityService.getAllUniversity();
    }

}
