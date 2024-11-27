package com.dadytech.testeautomatizado.br.com.dadytech.math;

import com.dadytech.testeautomatizado.math.SimpleMath;
import org.junit.jupiter.api.*;

public class SimpleMathTest {

// test[System Under Test]_[Condition or State Change]_[Expented Result]
SimpleMath xa ;

    @BeforeAll
   static  void setup(){
      System.out.println("Running @BeforeAll method!");
   }
   @BeforeEach
   void beforeEachMethod(){
       xa = new SimpleMath();
      System.out.println("Running @BeforeEach method!");
   }
   @AfterEach
   void afterEachMethod(){
      System.out.println("Running @AfterEach method!");
   }
   @AfterAll
   static  void cleanup(){
      System.out.println("Running @AfterAll method!");
   }

   @Test
   @DisplayName("test 6.2 + 2 = 8.2")
    void  testSum_when_SixDotTwoIsAddByTwo_ShouldReturnEigthDotTwo(){
      System.out.println("est 6.2 + 2 = 8.2");

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
      System.out.println("est 5 - 2 = 3");

      double primeiroNumero = 5;
      double segundoNumero = 2;
      double atual = xa.subtraction(primeiroNumero,segundoNumero);
      double expected = 3;
      Assertions.assertEquals(expected,atual,
              ()-> primeiroNumero + "+" + segundoNumero + " + did not produce "+ expected);
      Assertions.assertNotNull(atual);

   }
   @Test
   void testMultiplication(){
      System.out.println("est 5 * 2 = 10");
      double primeiroNumero = 5;
      double segundoNumero = 2;
      double atual = xa.multiplication(primeiroNumero,segundoNumero);
      double expected = 10;
      Assertions.assertEquals(expected,atual,
              ()-> primeiroNumero + " - "+ segundoNumero + "did not produce "+ expected);
      Assertions.assertNotNull(atual);

   }
   @Test
   @Disabled("Todo: we need still work on it!")
   void testDivision(){

      double primeiroNumero = 10;
      double segundoNumero = 2;
      double atual = xa.division(primeiroNumero,segundoNumero);
      double expected = 5;
      Assertions.assertEquals(expected,atual,
              ()-> primeiroNumero + " / "+ segundoNumero + "did not produce "+ expected);
      Assertions.assertNotNull(atual);

   }




}



