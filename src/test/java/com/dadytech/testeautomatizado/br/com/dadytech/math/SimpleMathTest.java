package com.dadytech.testeautomatizado.br.com.dadytech.math;

import com.dadytech.testeautomatizado.math.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

   @Test
    void  testSum(){
       SimpleMath xa = new SimpleMath();
       Double actual = xa.sum(6.2D,2D);
       double expected = 8.2D;
       Assertions.assertEquals(expected,actual,"6.2 + 2 did not produce expected 8.2!");
       Assertions.assertNotEquals(9.2,actual);
       Assertions.assertNotNull(actual);
   }

}
