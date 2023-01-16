package com.burhanmutlu.restProject.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UniversityResponseDto {

    private String name;
    @JsonProperty("web_pages")
    private List<String> webPages;
    private String country;
    @JsonProperty("alpha_two_code")
    private String alphaTwoCode;

}
