package com.sparta.clf.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTests {

    @Test
    @DisplayName("Given 1 and return 1")
    public void FizzBuzzTest(){
        Assertions.assertEquals("1",FizzBuzzExample.fizzBuzz(1));
    }
    @ParameterizedTest
    @CsvSource({"1, 1"})
    @DisplayName("Given numbers, return them as a String")
    public void given_num_returns_num_asString(int num, String expected) {
        Assertions.assertEquals(expected, FizzBuzzExample.fizzBuzz(num));
    }
    /*
    givenThree_Return_Fizz()
givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input)
givenFive_Return_Buzz()
givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input)
givenFifteen_Return_FizzBuzz()
givenANumberDivisibleByFifteen_Return_FizzBuzz(int input)
     */


    @Test
    @DisplayName("Given 3 return fizz ")
    public void givenThree_Return_Fizz() {
        Assertions.assertEquals("Fizz", FizzBuzzExample.fizzBuzz(3));
    }
    @ParameterizedTest
    @CsvSource({"6", "9","12"})
    @DisplayName("DivisibleBy 3 not 5 ")
    public void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input) {
        Assertions.assertEquals("Fizz", FizzBuzzExample.fizzBuzz(input));
    }
    @Test
    @DisplayName("Given 5 return Buzz ")
    public void givenFive_Return_Buzz() {
        Assertions.assertEquals("Buzz", FizzBuzzExample.fizzBuzz(5));
    }
    @ParameterizedTest
    @CsvSource({"5","10","20"})
    public void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input){
        Assertions.assertEquals("Buzz", FizzBuzzExample.fizzBuzz(input));
    }
    @Test
    @DisplayName("Given 15 Return FizzBuzz")
    public void givenFifteen_Return_FizzBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzzExample.fizzBuzz(15));
    }
    @ParameterizedTest
    @CsvSource({"30"})
    public void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input){
        Assertions.assertEquals("FizzBuzz", FizzBuzzExample.fizzBuzz(input));
    }

}
