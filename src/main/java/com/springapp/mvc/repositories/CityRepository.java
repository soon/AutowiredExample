package com.springapp.mvc.repositories;

import com.springapp.mvc.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface CityRepository extends JpaRepository<City, Long> {

}
