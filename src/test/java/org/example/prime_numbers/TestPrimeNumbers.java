package org.example.prime_numbers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPrimeNumbers {

    @Test
    public void NumbersLessThanTwoAreNotPrime() {
        assertFalse(PrimeNumbers.isPrime(0));
        assertFalse(PrimeNumbers.isPrime(1));

        for (int i = -100; i < 0; i++) {
            assertFalse(PrimeNumbers.isPrime(i));
        }
    }

    @Test
    public void TwoIsPrime() {
        assertTrue(PrimeNumbers.isPrime(2));
    }

    @Test
    public void InvalidArgumentThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            PrimeNumbers.generate(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            PrimeNumbers.generate(0);
        });
    }

    @Test
    public void GeneratingFirstPrimeNumberGivesTwo() {
        ArrayList<Integer> primes = PrimeNumbers.generate(1);

        assertEquals(1, primes.size());
        assertEquals(2, primes.get(0));
    }

    @Test
    public void GeneratingFirstTenPrimeNumbers() {
        ArrayList<Integer> primes = PrimeNumbers.generate(10);

        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

        assertEquals(expected.size(), primes.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), primes.get(i));
        }

    }
}
