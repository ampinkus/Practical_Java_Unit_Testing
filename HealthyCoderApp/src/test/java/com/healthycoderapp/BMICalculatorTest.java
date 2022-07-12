package com.healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
    @Test // if you don't put the @Test the method IS NOT tested!
    void should_return_true_when_diet_recommended() { // use a meaningfull name for the method
        // brake the test in parts to help to understand what happens
        // given:  Where we input the test data
        double weight = 89;
        double height = 1.72;

        // when:  where we invoque the method under test and store the result on a variable.
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        // then:  we assert  the result
        assertTrue(recommended); // this case diet is recommended assertTrue need to be true (1)
    }
    
    @Test
    void should_return_false_when_diet_not_recommended() { // use a meaningfull name for the method
        // brake the test in parts to help to understand what happens
        // given:  Where we input the test data
        double weight = 50;
        double height = 1.92;

        // when:  where we invoque the method under test and store the result on a variable.
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        // then:  we assert  the result
        assertFalse(recommended); // this case diet is not recommended assertFalse need to be false (0)
    }

    @Test
    void should_throw_aritmethic_exception_when_high_zero() { // use a meaningfull name for the method
        // brake the test in parts to help to understand what happens
        // given:  Where we input the test data
        double weight = 50;
        double height = 0.0; // put high on zero

        // when:  where we invoque the method under test and store the result on a variable.
        // we need an Executable variable from Juniper.  It will not be executed inmediately, we pause the executable to assert Throws
        // so it executes de Lambda and checks if it throws and exception
        Executable executable = () -> BMICalculator.isDietRecommended(weight,height); // a Lambda expression

        // then:  we assert  the result
        // ArithmeticException.class is the expected exception. We need an executable to catch the throw exception
        assertThrows(ArithmeticException.class,executable);
    }

}