package com.burhanmutlu.restProject.service;

import com.burhanmutlu.restProject.dtos.UniversityResponseDto;

import java.util.List;

public interface UniversityService {
    List<UniversityResponseDto> getByCountryName(String countryName);
    List<UniversityResponseDto> getByUniversityName(String universityName);
    List<UniversityResponseDto> getByUniversityAndCountryName(String universityName, String countryName);
    List<UniversityResponseDto> getAllUniversity();

}
