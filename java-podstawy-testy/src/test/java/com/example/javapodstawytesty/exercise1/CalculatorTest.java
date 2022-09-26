package com.example.javapodstawytesty.exercise1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {

    private Calculator calculator;

    //METODY UŻYWANE DODATKOWO - wykonywana w tle ---------------------------------------------------------------------
    @BeforeAll // wykona sie przed wszystkimi testami i musi być statyczna!
    static void init(){
        System.out.println("@BeforeAll invoked");
    }

    @BeforeEach //wykonuje sie przed każdym testem!
    void setUp(){
        System.out.println("@BeaforeEach invoked");
        calculator = new Calculator();
    }

    @AfterEach //wykonuje sie po każdym teście!
    void tearDown() {
        System.out.println("@AfterEach invoked");
    }

    @AfterAll // wykona sie po wszystkich testach i musi być statyczna!
    static void reset(){
        System.out.println("@AfterAll invoked");
    }
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void testSumHappyPath(){
        //GIVEN
        double a = 2.0;
        double b = 2.0;
        double expectedResult = 4.0;

        //WHEN
        double actualResult = calculator.sum(a,b);

        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDivision2EdgeCaseDivisionByZero() {

        // GIVEN
        int a = 2;
        int b = 0;
        int expectedResult = 0;

        // WHEN
        int actualResult = calculator.division2(a, b);

        // THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSubtract(){
        //GIVEN
        int a = 6;
        int b = 4;
        int expectedSubResult = 2;

        //WHEN
        int actualSubResult = calculator.subtract(a, b);
        
        //THEN
        Assertions.assertEquals(expectedSubResult, actualSubResult);
    }
    
    @Test
    void testMultiply(){
        //GIVEN
        int a = 5;
        int b = 5;
        int expectedMulResult = 25;

        //WHEN
        int actualResult = calculator.multiply(a, b);

        //THEN
        Assertions.assertEquals(expectedMulResult, actualResult);
    }

    @Test
    void testNumberIsEven(){
        // GIVEN
        int a = 6;
        boolean expectedResult = true;

        // WHEN
        boolean actualResult = Calculator.isEven(a);

        // THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6}) // value przyjmuje zawsze tablice
    void testNumberIsEven2(int a){
        // GIVEN
        boolean expectedResult = true;

        // WHEN
        boolean actualResult = Calculator.isEven(a);

        // THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

}