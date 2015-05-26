package com.springapp.mvc.services.impl;

import com.springapp.mvc.entities.City;
import com.springapp.mvc.repositories.CityRepository;
import com.springapp.mvc.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public Iterable<City> getAll() {
        return cityRepository.findAll();
    }
}
