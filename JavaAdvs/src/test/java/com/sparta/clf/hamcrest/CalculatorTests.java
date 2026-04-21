package com.sparta.clf.hamcrest;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class CalculatorTests {
    @Test
    void given2And6_Add_Returns8Pt0() {
        Calculator calc = new Calculator(6, 2);

        Assertions.assertEquals(8.0, calc.add());
    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);

        Assertions.assertTrue(calc.divisibleBy());
    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);

        Assertions.assertFalse(calc.divisibleBy());
    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);

        Assertions.assertTrue(calc.toString().contains("Calculator"));
    }
    @Test
    public void moreStringMatchers() {
        var testString = "The quick brown fox jumps over the lazy dog";

        assertThat(testString, Matchers.startsWith("The"));
        assertThat(testString, Matchers.endsWith("dog"));
        assertThat(testString, Matchers.containsStringIgnoringCase("The qUick"));
        assertThat(testString, Matchers.stringContainsInOrder("quick", "jumps", "lazy"));
        assertThat(testString, Matchers.not(Matchers.emptyOrNullString()));

    }
    @Test
    void collectionMatchersExercise() {
//Im working here now
        List<String> fruit = List.of(
                "apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon");
        assertThat(fruit, hasSize(7));
        assertThat(fruit, contains("apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon"));
        assertThat(fruit, hasItems("banana", "pear"));
        assertThat(fruit, containsInAnyOrder(
                "lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"
        ));
        assertThat(fruit, not(hasItem("grape")));
        assertThat(fruit, everyItem(not(endsWith("z"))));
    }
}
