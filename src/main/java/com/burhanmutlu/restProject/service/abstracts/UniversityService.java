package com.burhanmutlu.restProject.service.abstracts;

import com.burhanmutlu.restProject.dtos.University;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UniversityService {
    List<University> getByCountryName(String countryName);
    List<University> getByUniversityName(String universityName);
    List<University> getByUniversityAndCountryName(String universityName, String countryName);
    List<University> getAllUniversity();

}
