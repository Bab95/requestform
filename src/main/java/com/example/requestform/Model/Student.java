package com.example.requestform.Model;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class Student {

    private String firstName;
    
    @NotNull(message="can't be NULL")
    @Size(min=1,message="is required")
    private String lastName;
    
    private String country;
    
    private LinkedHashMap<String,String> countryOptions;
    public Student(){
        countryOptions = new LinkedHashMap<String,String>();
        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","Frace");
        countryOptions.put("DE","France");
        countryOptions.put("IND","India");
        countryOptions.put("PO","Poland");
        countryOptions.put("US","UnitedStates");
        countryOptions.put("AUS","Australia");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String,String> getCountryOptions(){
        return this.countryOptions;
    }
    
}
