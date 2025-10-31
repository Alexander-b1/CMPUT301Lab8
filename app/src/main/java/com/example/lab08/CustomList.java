package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)

    /**
     * Checks if a CustomList has a city
     * @param city The city being searched for
     * @return A boolean of whether the city list contains the city.
     */
    public boolean hasCity(City city) { return cities.contains(city);}

    /**
     * Deletes a city from the list
     * @param city the city being removed from the list
     */
    public void delete (City city) {
        cities.remove(city);
    }
}
