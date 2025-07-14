package com.dncognizant.spring_exercise_5.service;

import com.dncognizant.spring_exercise_5.model.Country;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountryService {

    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        Country india = new Country();
        india.setCode("IN");
        india.setName("India");

        Country usa = new Country();
        usa.setCode("US");
        usa.setName("United States");

        Country japan = new Country();
        japan.setCode("JP");
        japan.setName("Japan");

        countryMap.put(india.getCode(), india);
        countryMap.put(usa.getCode(), usa);
        countryMap.put(japan.getCode(), japan);
    }

    public Country getCountryByCode(String code) {
        return countryMap.getOrDefault(code, null);
    }
}
