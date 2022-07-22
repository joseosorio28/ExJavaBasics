package main;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExercisesTest {

    private final Exercises obj = new Exercises();
    private final Exercises.Calculator calculator = new Exercises.Calculator();

    @Test
    void canFindMinAndMaxNumbers() {
        //Arrange
        int a = 5;
        int b = 10;
        int c = 15;

        //Act
        int[] minAndMaxNumbers = obj.minAndMaxNumbers(a, b, c);

        //Assert
        assertEquals(a, minAndMaxNumbers[0]);
        assertEquals(c, minAndMaxNumbers[1]);
    }

    @Test
    void wontFindMinAndMaxNumbers() {
        //Arrange
        int a = 5;
        int b = -10;
        int c = 15;

        //Act
        int[] minAndMaxNumbers = obj.minAndMaxNumbers(a, b, c);

        //Assert
        assertEquals(0, minAndMaxNumbers.length);
    }

    @Test
    void canCreateRandomVector() {
        //Arrange

        //Act
        int[] randoms = obj.randomVector();

        //Assert
        assertTrue(Arrays.stream(randoms).allMatch(number -> number >= 5));
    }

    @Test
    void canCalculatorSum() {
        //Arrange
        int a = 5;
        int b = 10;

        //Act
        var result = calculator.sum(a, b);

        //Assert
        assertEquals(15, result);
    }

    @Test
    void canCalculatorSubtract() {
        //Arrange
        int a = 5;
        int b = 10;

        //Act
        var result = calculator.subtract(a, b);

        //Assert
        assertEquals(-5, result);
    }

    @Test
    void canCalculatorMultiply() {
        //Arrange
        int a = 10;
        int b = 5;

        //Act
        var result = calculator.multiply(a, b);

        //Assert
        assertEquals(50, result);
    }

    @Test
    void canCalculatorDivide() {
        //Arrange
        int a = 10;
        int b = 5;

        //Act
        var result = calculator.divide(a, b);

        //Assert
        assertEquals(2, result);
    }

    @Test
    void wontCalculatorDivide() {
        //Arrange
        int a = 10;
        int b = 0;

        //Act
        var result = calculator.divide(a, b);

        //Assert
        assertEquals(Integer.MAX_VALUE, result);
    }

}