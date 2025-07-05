package com.incubyte;


public class StringCalculator {
    public static void main(String[] args) {

    }

    int add(String number){
        if(number.isEmpty()) return 0;              // Handling cases for empty string

        int sum = 0;               // Variable to accumulate the sum of numbers
        StringBuilder currentNumber = new StringBuilder();    // String to accumulate characters for the current number

        // Loop through each character in the input string
        for (int i = 0; i < number.length(); i++) {
            char character = number.charAt(i);

            // If the current character is a comma, process the current number
            if (character == ',' || character == '\n') {
                if (!currentNumber.isEmpty()) {
                    // Convert the accumulated string to an integer, trim whitespace, and add to the sum
                    sum += Integer.parseInt(currentNumber.toString().trim());
                    currentNumber = new StringBuilder();  // Reset currentNumber for the next number
                }
            } else {
                // Accumulate characters to form the current number
                currentNumber.append(character);
            }
        }

        // After the loop, handle the last number (if there's any left)
        if (!currentNumber.isEmpty()) {
            sum += Integer.parseInt(currentNumber.toString().trim(), 10);
        }

        // Return the final sum of all numbers
        return sum;
    }
}