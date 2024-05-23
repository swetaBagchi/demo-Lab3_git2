package com.example.demo_Lab3_git2;

import org.junit.jupiter.api.*;

public class CalculatorTests {
    Calculator calculator;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("****TEST RUN BEGINS NOW******");

    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("----A new test----");
        calculator = new Calculator();
    }

    //1
    @Test
    @DisplayName("Multiplying 2 numbers will return product ")
    void multiplyingTwoNumbers_equatingWithActualProduct_shouldReturnTrue() {
        Assertions.assertEquals(200,calculator.multiply(10,20));
    }

    //2
    @Test
    @DisplayName("Multiplying 2 numbers will not return product ")
    void multiplyingTwoNumbers_notEqualsDifferentProduct_shouldReturnTrue() {
        Assertions.assertNotEquals(300, calculator.multiply(10,60));
    }

    //3
    @Test
    @DisplayName("Dividing 2 numbers will return quotient ")
    void dividingTwoNumbers_equalsToQuotient_shouldReturnTrue() {
        Assertions.assertEquals(2, calculator.divide(20,10));
    }

    //5
    @Test
    @DisplayName("Divisor is greater than dividend")
    void dividingTwoNumbers_divisorGreaterThanDividend_equalsToQuotient_shouldReturnTrue() {
        Assertions.assertEquals(0.4, calculator.divide(2,5));

    }

    //6
    @Test
    @DisplayName("Square root of a perfect square")
    void squareRoot_ofAPerfectSquare() {
        Assertions.assertEquals(10, calculator.squareRootOf(100));

    }

    //8
    @Test
    @DisplayName("Square root of a non-square number")
    void squareRoot_ofANonSquareNumber_typecastedResultToIntValue() {
        Assertions.assertEquals(9, (int)calculator.squareRootOf(99));

    }

    //9
    @Test
    @DisplayName("Area of a circle with valid radius")
    void getAreaOfACircle_withPositiveRadius_roundedOff() {
        Assertions.assertEquals(314,Math.round(calculator.getArea(10)));
    }

    //10
    @Test
    @DisplayName("Area of a circle with Negative Radius")
    void areaOfACircle_withNegativeRadius_shouldReturnNotANumber() {
        Assertions.assertEquals(Double.NaN,calculator.getArea(-10));
    }

    //11
    @Test
    @DisplayName("Circumference with positive radius")
    void getCircumference_withPositiveRadius_roundedOff() {
        Assertions.assertEquals(63,Math.round(calculator.getCircumference(10)));
    }

    //12
    @Test
    @DisplayName("Circumference with negative radius")
    void getCircumference_withNegativeRadius_shouldReturnNotANumber() {
        Assertions.assertEquals(Double.NaN,calculator.getCircumference(-10));
    }


    @AfterAll
    static void afterAllTests() {
        System.out.println("****TEST RUN ENDS NOW******");
    }
}
