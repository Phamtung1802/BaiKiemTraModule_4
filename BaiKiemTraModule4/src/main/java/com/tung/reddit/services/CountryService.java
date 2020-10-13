package com.tung.reddit.services;

import com.tung.reddit.models.Country;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {
    public Country findByName(String name);
    public Iterable<Country> findAll();
    public void delete(Country country);
    public Country save(Country country);
    Country findFirstById(long l);

}
