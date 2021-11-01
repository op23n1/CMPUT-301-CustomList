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

}
