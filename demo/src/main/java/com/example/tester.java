package com.example;

import java.util.ArrayList;

/**
 * @author Prem Agarwal
 * @version 1.0.0
 * @since 10/19/2022
 */

public  class tester
{

    public static void main (String[] args)
    {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("watermelon");
        fruits.add("orange");
        fruits.add("lemon");

        for(String fruit: fruits)
        {
            System.out.println(fruit);
        }
        
    }
}