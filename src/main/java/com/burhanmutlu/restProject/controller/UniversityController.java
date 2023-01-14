package com.burhanmutlu.restProject.controller;

import com.burhanmutlu.restProject.service.abstracts.UniversityService;
import com.burhanmutlu.restProject.dtos.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/search")
public class UniversityController {

    private UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        super();
        this.universityService = universityService;
    }

    @GetMapping(params = "country")
    @ResponseBody
    public List<University> getByCountryName(@RequestParam(name = "country") String countryName) {
        return this.universityService.getByCountryName(countryName);
    }

    @GetMapping(params = "name")
    @ResponseBody
    public List<University> getByUniversityName(@RequestParam(name = "name") String universityName) {
        return this.universityService.getByUniversityName(universityName);
    }

    @GetMapping(params = {"name","country"})
    @ResponseBody
    public List<University> getByUniversityAndCountryName(@RequestParam(name = "name") String universityName,
                                                          @RequestParam(name = "country") String countryName) {
        return this.universityService.getByUniversityAndCountryName(universityName, countryName);
    }

    @GetMapping(value = "/all" )
    @ResponseBody
    public List<University> getAllUniversity() {
        return this.universityService.getAllUniversity();
    }

}
