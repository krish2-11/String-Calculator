package com.incubyte;


import java.util.regex.Pattern;

public class StringCalculator {
    public static void main(String[] args) {

    }

    int add(String number){
        if (number.isEmpty()) return 0;

        String delimiter = "[,\n]";

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
                sum += Integer.parseInt(num.trim());
            }
        }

        return sum;
    }
}