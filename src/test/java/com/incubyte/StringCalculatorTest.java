package com.incubyte;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up a new StringCalculator instance...");
        calculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test finished. Cleaning up...");
        calculator = null;
    }

    @Test
    public void should_returnZero_when_inputIsEmpty() {

        // Getting result from add() method with empty string
        int result = calculator.add("");

        // Test for empty string output
        assertEquals(0, result, "Empty string should return 0");
    }

    @Test
    public void should_returnSameNumber_when_singleNumberGiven() {

        // Getting result from add() method with one number
        int result = calculator.add("1");

        // Test for one number output
        assertEquals(1, result, "one number string should return same number");
    }

    @Test
    public void should_returnSum_when_twoCommaSeparatedNumbers() {

        // Getting result from add() method with two number
        int result = calculator.add("1,20");

        // Test for two number output
        assertEquals(21, result, "two number string should return sum of two number");
    }

    @Test
    public void should_returnSum_when_multipleNumbersGiven() {

        // Getting result from add() method with unknown number
        int result = calculator.add("0 ,20, 13,7");

        // Test for unknown number output
        assertEquals(40, result, "It should return sum of multiple number");
    }

    @Test
    public void should_handleNewlinesAsDelimiters() {

        // Getting result from add() method with \n deliminator number
        int result = calculator.add("21\n,20, 13,7");

        // Test for unknown number output
        assertEquals(61, result, "It should return sum of multiple number");
    }
}
