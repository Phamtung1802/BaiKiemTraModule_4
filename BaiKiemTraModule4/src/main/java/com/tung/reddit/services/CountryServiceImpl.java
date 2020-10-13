package com.tung.reddit.services;

import com.tung.reddit.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    @Override
    public Country findByName(String name) {
        return countryRepository.findByName(name);
    }

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country save(Country country) {
        countryRepository.save(country);
        return country;
    }

    @Override
    public void delete(Country country) {
        countryRepository.delete(country);
    }

    @Override
    public Country findFirstById(long l) {
        return countryRepository.findFirstById(l);
    }


}
