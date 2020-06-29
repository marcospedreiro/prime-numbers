package org.example.prime_numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {

    private static final int firstPrime = 2;

    /// returns the first n prime numbers
    public static ArrayList<Integer> generate(int n) throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException(String.format("input to PrimeNumberGenerator.generate(n) must be greater than or equal to 1, got: %d", n));
        }

        ArrayList<Integer> primes = new ArrayList<>(Arrays.asList(new Integer[n]));

        int candidate = firstPrime;
        int numberFound = 0;
        while (numberFound < n) {

            if (PrimeNumbers.isPrime(candidate)) {
                primes.set(numberFound, candidate);
                numberFound += 1;
            }

            candidate += 1;
        }

        return primes;
    }

    public static boolean isPrime(int n) {
        if (n < firstPrime) {
            return false;
        }

        for (int i = firstPrime; i <= n/2; i++ )
        {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
