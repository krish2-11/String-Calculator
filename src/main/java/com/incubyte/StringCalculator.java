package com.incubyte;

public class StringCalculator {
    public static void main(String[] args) {

    }

    int add(String number){
        if(number.isEmpty()) return 0;              // Handling cases for empty string

        // For handling one number
        return Integer.parseInt(number);
    }
}