package com.tung.reddit.services;

import com.tung.reddit.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CityRepository;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;

    @Override
    public City findByName(String name) {
        return cityRepository.findByName(name);
    }

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City save(City city) {
        cityRepository.save(city);
        return city;
    }

    @Override
    public void delete(City city) {
        cityRepository.delete(city);
    }

    @Override
    public City findFirstById(long l) {
        return cityRepository.findFirstById(l);
    }


}
