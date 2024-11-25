package com.dadytech.testeautomatizado.br.com.dadytech.math;

import com.dadytech.testeautomatizado.math.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

   @Test
    void  testSum(){
       SimpleMath xa = new SimpleMath();
       Double firstNumber = 6.2D;
       double secondNumber = 2D;
       double actual = xa.sum(firstNumber,secondNumber);
       double expected = 8.2D;
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
              ()-> primeiroNumero + "+ "+ segundoNumero + "did not produce "+ expected);
      Assertions.assertNotNull(atual);

   }
   @Test
   void testDivision(){
      SimpleMath math = new SimpleMath();
      double primeiroNumero = 10;
      double segundoNumero = 2;
      double atual = math.division(primeiroNumero,segundoNumero);
      double expected = 5;
      Assertions.assertEquals(expected,atual,
              ()-> primeiroNumero + "+ "+ segundoNumero + "did not produce "+ expected);
      Assertions.assertNotNull(atual);

   }

}
