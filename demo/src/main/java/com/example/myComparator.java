package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/**
 * @author Prem Agarwal
 * @version 1.0.0
 * @since 10/19/2022
 */
public final class myComparator
{
    
    public static void main(String[] args) {
		
		Comparator<String> myComparator = new Comparator<String>() 
        {
			@Override
			public int compare(String string1, String string2) 
            {
				return string1.length() - string2.length();
			}
        };

		// examples
		ArrayList<String> stringList = new ArrayList<String>(
				
        Arrays.asList("Hi", "hello", "how", "horse", "home"));
		
        //prints list
		System.out.println(stringList);
        //sorts list
		Collections.sort(stringList, myComparator);
        //prints sorted list
		System.out.println(stringList);
	}
}



