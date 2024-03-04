package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     */



//    public List<City> getCities() {
//        List<City> cityList = cities;
//        Collections.sort(cityList);
//        return cityList;
//    }

    public List<City> getCities(String sortBy) {
        List<City> cityList = new ArrayList<>(cities);

        switch (sortBy.toLowerCase()) {
            case "city":
                Collections.sort(cityList, Comparator.comparing(City::getCityName));
                break;
            case "province":
                Collections.sort(cityList, Comparator.comparing(City::getProvinceName));
                break;
            default:
                throw new IllegalArgumentException("Invalid sorting option. Please specify 'city' or 'province'.");
        }

        return cityList;
    }




    public String delete(City cobj){
        try{




            for(City c:cities){
                if(c.getCityName().equalsIgnoreCase(cobj.getCityName()) && c.getProvinceName().equalsIgnoreCase(cobj.getProvinceName())){
                    cities.remove(cobj);
                   return "The City is deleted";
                }
            }

            throw new Exception("The City is not Exist");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    public int COUNT(){
        return cities.size();
    }
}