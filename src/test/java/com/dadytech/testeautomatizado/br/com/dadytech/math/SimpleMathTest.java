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

}
