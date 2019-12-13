package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {1, 2, 3, 3, 6, 6, 2};
        theDice(a);
    }

    //function to check if the array is valid (last element shuould not be 6 and elements should be > 0 and <= 6)
    public static boolean isValid(int [] theArray){
        for(int i = 0; i < theArray.length; i++){
            if(theArray[i] < 1 || theArray[i] > 6)
                return false;
        }
        if (theArray[theArray.length - 1] == 6)
            return false;
        return true;
    }

    //function to find number of girls who roll the dice; when dice shows 6, we do not take the roll into account
    public static int findNumber(int [] theArray){
        int theNumber = 0;
        for (int i = 0; i < theArray.length; i++){
            if (theArray[i] != 6)
                theNumber++;
        }
        return theNumber;
    }

    //function to call in main, for result diplay
    public static void theDice(int [] theArray){
        if (!isValid(theArray))
            System.out.println("-1");
        else System.out.println(findNumber(theArray));
    }
}
