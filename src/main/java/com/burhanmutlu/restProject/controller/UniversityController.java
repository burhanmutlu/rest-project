package com.burhanmutlu.restProject.controller;

import com.burhanmutlu.restProject.service.UniversityService;
import com.burhanmutlu.restProject.dtos.UniversityResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/search")
public class UniversityController {

    private UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping(params = "country")
    public List<UniversityResponseDto> getByCountryName(@RequestParam(name = "country") String countryName) {
        return universityService.getByCountryName(countryName);
    }

    @GetMapping(params = "name")
    public List<UniversityResponseDto> getByUniversityName(@RequestParam(name = "name") String universityName) {
        return universityService.getByUniversityName(universityName);
    }

    @GetMapping(params = {"name","country"})
    public List<UniversityResponseDto> getByUniversityAndCountryName(@RequestParam(name = "name") String universityName,
                                                                     @RequestParam(name = "country") String countryName) {
        return universityService.getByUniversityAndCountryName(universityName, countryName);
    }

    @GetMapping("/all" )
    public List<UniversityResponseDto> getAllUniversity() {
        return universityService.getAllUniversity();
    }

}
