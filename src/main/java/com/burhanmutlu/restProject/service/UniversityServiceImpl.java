package com.burhanmutlu.restProject.service;

import com.burhanmutlu.restProject.dtos.UniversityResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Value("${service-url}")
    private String url;

    private RestTemplate restTemplate;

    public UniversityServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        System.out.println("Servis başlatıldı.");
    }

    @Override
    public List<UniversityResponseDto> getByCountryName(String countryName) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<List<UniversityResponseDto>> entity = new HttpEntity <List<UniversityResponseDto>>(headers);

        ResponseEntity<List<UniversityResponseDto>> response =
                restTemplate.exchange(
                    url+"?country="+countryName,
                    HttpMethod.GET,
                    entity,
                    new ParameterizedTypeReference<List<UniversityResponseDto>>() {}
                );

        return response.getBody();
    }

    @Override
    public List<UniversityResponseDto> getByUniversityName(String universityName) {

        ResponseEntity<List<UniversityResponseDto>> response =
                restTemplate.exchange(
                    url + "?name=" + universityName,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<UniversityResponseDto>>() {}
                );

        return response.getBody();
    }

    @Override
    public List<UniversityResponseDto> getByUniversityAndCountryName(String universityName, String countryName) {

        ResponseEntity<List<UniversityResponseDto>> response =
                restTemplate.exchange(
                    url + "?name=" + universityName + "&country=" + countryName,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<UniversityResponseDto>>() {}
                );

        return response.getBody();
    }

    @Override
    public List<UniversityResponseDto> getAllUniversity() {

        ResponseEntity<List<UniversityResponseDto>> response =
                restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<UniversityResponseDto>>() {}
                );

        return response.getBody();
    }


}
