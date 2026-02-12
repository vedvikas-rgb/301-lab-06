package com.example.code;

/**
 * This is a class that defines a City object.
 */
public class City implements Comparable<City> {
    /**
     * The name of the city.
     */
    private String name;
    /**
     * The province the city belongs to.
     */
    private String province;

    /**
     * Constructs a new City with the given name and province.
     * @param name
     *      The name of the city
     * @param province
     *      The province of the city
     */
    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     * @return
     *      The city name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the city.
     * @param name
     *      The new city name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the province of the city.
     * @return
     *      The province name
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province of the city.
     * @param province
     *      The new province name
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Compares this city to another city by name lexicographically.
     * @param city
     *      The city to compare to
     * @return
     *      A negative integer, zero, or a positive integer as this city name
     *      is less than, equal to, or greater than the specified city name
     */
    @Override
    public int compareTo(City city) {
        return this.name.compareTo(city.getName());
    }

    /**
     * Checks if two City objects are equal based on name and province.
     * @param o
     *      The object to compare to
     * @return
     *      True if the cities have the same name and province, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City cityObj = (City) o;
        return this.name.equals(cityObj.getName()) && this.province.equals(cityObj.getProvince());
    }
}
