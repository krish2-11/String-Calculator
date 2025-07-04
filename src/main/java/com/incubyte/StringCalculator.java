package com.incubyte;

import java.util.Arrays;

public class StringCalculator {
    public static void main(String[] args) {

    }

    int add(String number){
        if(number.isEmpty()) return 0;              // Handling cases for empty string

        String[] numbers = number.split(","); // Handling for one or two number

        // Return sum of all , separated number
        return Arrays.stream(numbers).map(Integer::parseInt).reduce(0 , Integer::sum);
    }
}