package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void fiftyNineShouldReturnF(){
        var calculator = new Calculator();
        Assertions.assertEquals('F', calculator.determineLetterGrade(59));

    }
    @Test
    void sixtyNineShouldReturnD(){
        var calculator = new Calculator();
        Assertions.assertEquals('D', calculator.determineLetterGrade(69));

    }
    @Test
    void seventyNineShouldReturnC(){
        var calculator  = new Calculator();
        Assertions.assertEquals('C', calculator.determineLetterGrade(79));

    }
    @Test
    void eightNineShouldReturnB(){
        var calculator = new Calculator();
        Assertions.assertEquals('B', calculator.determineLetterGrade(89));

    }
    @Test
    void nightNineShouldReturnA(){
        var calculator = new Calculator();
        Assertions.assertEquals('A', calculator.determineLetterGrade(90));

    }
    
}
