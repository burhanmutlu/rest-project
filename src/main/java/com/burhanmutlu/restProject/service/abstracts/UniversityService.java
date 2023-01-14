package com.burhanmutlu.restProject.service.abstracts;

import com.burhanmutlu.restProject.dtos.University;

import java.util.List;

public interface UniversityService {
    List<University> getByCountryName(String countryName);
}
