package org.me.learning.springmongodb2.model;



public class Address {
    private String country;
    private String city;
    private String postCode;

    public Address(String country, String city, String postCode) {
        this.country = country;
        this.city = city;
        this.postCode = postCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }
}
