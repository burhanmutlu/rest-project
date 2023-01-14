package com.burhanmutlu.restProject.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {

    private String name;
    private List<String> web_pages;
    private String country;
    private String alpha_two_code;

}
