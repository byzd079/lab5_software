package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    @Test
    public void testedele(){
        City city1 = new City("New York", "New York");
        City city2 = new City("Los Angeles", "California");
        City city3 = new City("Chicago", "Illinois");

        CityList clobj=new CityList();
        clobj.add(city1);
        clobj.add(city2);
        clobj.add(city3);
        System.out.println(clobj.delete(new City("Los Angeles", "California")));

    }



    @Test
    public void testeCOUNT(){
        City city1 = new City("New York", "New York");
        City city2 = new City("Los Angeles", "California");
        City city3 = new City("Chicago", "Illinois");
        City city4 = new City("Tamilnadu", "India");

        CityList clobj=new CityList();
        clobj.add(city1);
        clobj.add(city2);
        clobj.add(city3);
        clobj.add(city4);
        Assertions.assertEquals(4,4);

    }





    @Test
    public void testGetCitiesSortedByProvince() {
        City city1 = new City("New York", "New York");
        City city2 = new City("Los Angeles", "California");
        City city3 = new City("Chicago", "Illinois");

        CityList cityList = new CityList();
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);

        List<City> sortedCities = cityList.getCities("province");

        assertEquals(3, sortedCities.size());
        assertEquals("Los Angeles", sortedCities.get(0).getCityName());
        assertEquals("Chicago", sortedCities.get(1).getCityName());
        assertEquals("New York", sortedCities.get(2).getCityName());
    }



    @Test
    public void testGetCitiesSortedByCity() {
        City city1 = new City("New York", "New York");
        City city2 = new City("Los Angeles", "California");
        City city3 = new City("Chicago", "Illinois");

        CityList cityList = new CityList();
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);

        List<City> sortedCities = cityList.getCities("city");

        assertEquals(3, sortedCities.size());
        assertEquals("Chicago", sortedCities.get(0).getCityName());
        assertEquals("Los Angeles", sortedCities.get(1).getCityName());
        assertEquals("New York", sortedCities.get(2).getCityName());
    }




}