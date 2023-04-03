package com.project.blog.service;

import com.project.blog.model.City;
import com.project.blog.repository.CityRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class CityService {

    private final CityRepository cityRepository;

    public City getObjectById(Integer id) {
        return cityRepository.findById(id).orElseThrow();
    }
}
