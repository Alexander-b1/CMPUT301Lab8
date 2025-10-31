package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {


    @Test
    public void testHasCity(){
        CustomList list = new CustomList();

        City calgary = new City("Calgary","AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();

        // Ensures a city has been added to the CustomList
        City calgary = new City("Calgary","AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));

        // Removes city from the list, and ensures it has been deleted
        list.delete(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCitys(){
        CustomList list = new CustomList();

        // Ensures list starts empty
        assertEquals(0,list.countCities());

        // Ensures a city is counted once added to the list.
        City calgary = new City("Calgary","AB");
        list.addCity(calgary);
        assertEquals(1, list.countCities());
    }
}
