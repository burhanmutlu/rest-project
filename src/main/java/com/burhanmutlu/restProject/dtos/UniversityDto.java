package com.burhanmutlu.restProject.dtos;

import com.burhanmutlu.restProject.entities.concretes.University;

import java.util.List;

public interface UniversityDto {
    List<University> getByCountryName(String countryName);

}
