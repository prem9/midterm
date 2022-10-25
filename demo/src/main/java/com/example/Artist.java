package com.example;

/**
 * @author Prem Agarwal
 * @version 1.0.0
 * @since 10/19/2022
 */

public  class Artist extends Person
{

    private String specialty;
    public Artist(String name2, int age2, String specialty2)
    {
        super(name2, age2);
        specialty = specialty2;
        
        
    }
    public void setSpecialty(String specSet)
    {
        specialty = specSet;
    }
   
    public String getSpec()
    {
        return specialty;
    }

    public String toString()
    {
        String ArtistInfo = "Artist Info:  " + super.getName() + ", " + super.getAge() + "years old, Specialty: " + specialty;
        return ArtistInfo;
    }
}