package com.example;

/**
 * @author Prem Agarwal
 * @version 1.0.0
 * @since 10/19/2022
 */

public  class Person
{

    private String name;
    private int age;

    public Person(String name2, int age2)
    {
        name = name2;
        age = age2;
    }
    public void setName(String nameSet)
    {
        name = nameSet;
    }
    public void setAge(int ageSet)
    {
        age = ageSet;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        String personInfo = "Person Info:  " + name + ", " + age + "years old.";
        return personInfo;
    }
}