package com.burhanmutlu.restProject.business.abstracts;

import com.burhanmutlu.restProject.entities.concretes.University;

import java.util.List;

public interface UniversityService {
    List<University> getByCountryName(String countryName);
}
