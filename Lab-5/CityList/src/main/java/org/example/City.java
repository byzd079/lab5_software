package org.example;

public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City otherCity) {
        // First, compare by city name
        int compareResult = this.city.compareTo(otherCity.getCityName());

        // If city names are the same, compare by province name
        if (compareResult == 0) {
            compareResult = this.province.compareTo(otherCity.getProvinceName());
        }

        return compareResult;
    }
}
