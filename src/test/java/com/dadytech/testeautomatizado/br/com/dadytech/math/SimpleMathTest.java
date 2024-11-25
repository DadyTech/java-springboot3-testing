package com.dadytech.testeautomatizado.br.com.dadytech.math;

import com.dadytech.testeautomatizado.math.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

// test[System Under Test]_[Condition or State Change]_[Expented Result]

   @Test
   @DisplayName("test 6.2 + 2 = 8.2")
    void  testSum_when_SixDotTwoIsAddByTwo_ShouldReturnEigthDotTwo(){

      //Given / Arrange
       SimpleMath xa = new SimpleMath();
       Double firstNumber = 6.2D;
       double secondNumber = 2D;

      //When / Act
       double actual = xa.sum(firstNumber,secondNumber);
       double expected = 8.2D;

      //Then / Assert
       Assertions.assertEquals(expected,actual,
               ()-> firstNumber + "+" + secondNumber +"did not produce " + expected);
       Assertions.assertNotEquals(9.2,actual);
       Assertions.assertNotNull(actual);
   }

   @Test
   void testSubtraction(){
      SimpleMath math = new SimpleMath();
      double primeiroNumero = 5;
      double segundoNumero = 2;
      double atual = math.subtraction(primeiroNumero,segundoNumero);
      double expected = 3;
      Assertions.assertEquals(expected,atual,
              ()-> primeiroNumero + "+" + segundoNumero + " + did not produce "+ expected);
      Assertions.assertNotNull(atual);

   }
   @Test
   void testMultiplication(){
      SimpleMath math = new SimpleMath();
      double primeiroNumero = 5;
      double segundoNumero = 2;
      double atual = math.multiplication(primeiroNumero,segundoNumero);
      double expected = 10;
      Assertions.assertEquals(expected,atual,
              ()-> primeiroNumero + " - "+ segundoNumero + "did not produce "+ expected);
      Assertions.assertNotNull(atual);

   }
   @Test
   @Disabled("Todo: we need still work on it!")
   void testDivision(){
      SimpleMath math = new SimpleMath();
      double primeiroNumero = 10;
      double segundoNumero = 2;
      double atual = math.division(primeiroNumero,segundoNumero);
      double expected = 5;
      Assertions.assertEquals(expected,atual,
              ()-> primeiroNumero + " / "+ segundoNumero + "did not produce "+ expected);
      Assertions.assertNotNull(atual);

   }




}



