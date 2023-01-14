package com.burhanmutlu.restProject.business.concretes;

import com.burhanmutlu.restProject.business.abstracts.UniversityService;
import com.burhanmutlu.restProject.entities.concretes.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@Service
public class UniversityManager implements UniversityService {

    private static final String url = "http://universities.hipolabs.com/search?";
    @Autowired
    RestTemplate restTemplate;

    public UniversityManager() {
        System.out.println("Servis başlatıldı.");
    }

    @Override
    public List<University> getByCountryName(String countryName) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<List<University>> entity = new HttpEntity <List<University>>(headers);

        ResponseEntity<List<University>> response = restTemplate.exchange(url+"country="+countryName,
                HttpMethod.GET, entity, new ParameterizedTypeReference<List<University>>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                });

        return response.getBody();
    }
}
