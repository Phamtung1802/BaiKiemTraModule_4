package com.tung.reddit.services;
import com.tung.reddit.models.City;

import org.springframework.stereotype.Service;

@Service
public interface CityService {
    public City findByName(String name);
    public Iterable<City> findAll();
    City save(City city);
    public void delete(City city);
    City findFirstById(long l);

}
