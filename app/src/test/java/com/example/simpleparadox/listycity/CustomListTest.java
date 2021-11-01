package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        createList();
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        createList();
        City testC = new City("Halifax", "NS");
        list.addCity(testC);
        assertEquals(list.hasCity(testC), true);

    }

    @Test
    public void deleteCityTest(){
        createList();
        City testC = new City("Halifax", "NS");
        list.addCity(testC);
        assertEquals(list.hasCity(testC), true);
        list.deleteCity(testC);
        assertEquals(list.hasCity(testC), false);

    }

    @Test
    public void countCitiesTest(){
        createList();
        assertEquals(list.countCities(), 0);
        
        City test1 = new City("Halifax", "NS");
        City test2 = new City("Edmonton", "AB");
        City test3 = new City("Vancouver", "BC");

        list.addCity(test1);
        assertEquals(list.countCities(), 1);
        list.addCity(test2);
        assertEquals(list.countCities(), 2);
        list.addCity(test3);
        assertEquals(list.countCities(), 3);
        list.deleteCity(test1);
        assertEquals(list.countCities(), 2);




    }

}
