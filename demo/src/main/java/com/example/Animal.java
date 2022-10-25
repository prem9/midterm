package com.example;

/**
 * @author Prem Agarwal
 * @version 1.0.0
 * @since 10/19/2022
 */
public final class Animal
{

    private final String type;
    private final int age;

    public Animal(String type2, int age2)
    {
        type = type2;
        age = age2;
    }
    public String getType()
    {
        return type;
    }

    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        String animalInfo = "Animal Info:  " + type + ", " + age + "years old.";
        return animalInfo;
    }
}