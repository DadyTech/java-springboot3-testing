package com.dadytech.testeautomatizado.br.com.dadytech.math;

import com.dadytech.testeautomatizado.math.SimpleMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleMathTestS4 {

    // test[System Under Test]_[Condition or State Change]_[Expented Result]
    SimpleMath xa;




    @BeforeEach
   void beforeEachMethod() {
        xa = new SimpleMath();
      System.out.println("Running @BeforeEach method!");
   }

    @AfterEach
   void afterEachMethod() {
      System.out.println("Running @AfterEach method!");
   }




    @DisplayName("Test 6.2 / 2 = 3.1")
    @ParameterizedTest
   // @MethodSource("testDivisionInputParameters")
    // @MethodSource()
    @CsvSource({
            " 6.2D ,2D , 3.1D",
            "10D ,2D , 5D",
            " 20D ,2D , 10D"
    })
   void testDivision(double primeiroNumero, double segundoNumero, double expected) {

        System.out.println("Test "+ primeiroNumero + " / "+
                segundoNumero + " = " + expected + " !");
      // given
  double actual = xa.division(primeiroNumero , segundoNumero);
      // when & then
     assertEquals(expected, actual,2D,
             ()-> primeiroNumero + "/" +segundoNumero + "did not proceduce "+ expected + " !");

   }
/**
    public static Stream<Arguments> testDivisionInputParameters() {
        return Stream.of(
                Arguments.of(6.2D ,2D , 3.1D),
                Arguments.of(10D ,2D , 5D),
                Arguments.of(20D ,2D , 10D)
        );
    }
 */
}



