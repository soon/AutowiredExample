package com.springapp.mvc.services;

import com.springapp.mvc.entities.City;


public interface CityService {
    Iterable<City> getAll();
}