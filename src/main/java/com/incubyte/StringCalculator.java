package com.incubyte;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {
    public static void main(String[] args) {

    }

    int add(String number) {
        if (number.isEmpty()) return 0;

        String delimiter = "[,\n]";
        ArrayList<Integer> negatives = new ArrayList<>();

        // Check for custom delimiter
        if (number.startsWith("//")) {
            int delimiterIndex = number.indexOf("\n");
            String customDelimiter = number.substring(2, delimiterIndex);
            delimiter = Pattern.quote(customDelimiter);  // Escape special regex chars
            number = number.substring(delimiterIndex + 1);
        }

        // Split numbers using the delimiter regex
        String[] numbers = number.split(delimiter);

        int sum = 0;
        for (String num : numbers) {
            if (!num.isEmpty()) {
                int numberAtEachIndex =  Integer.parseInt(num.trim());
                if(numberAtEachIndex < 0){
                    negatives.add(numberAtEachIndex) ;
                }
                sum += numberAtEachIndex;
            }
        }

        if(!negatives.isEmpty()){
            throw new IllegalArgumentException("negative numbers are not allowed: " + negatives);
        }
        return sum;
    }
}