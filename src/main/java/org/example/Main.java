package org.example;

import org.example.prime_numbers.PrimeNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main( String[] args )
    {

        int numberOfPrimes = 10;
        if (args.length >= 1) {
            try {
                numberOfPrimes = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e)
            {
                System.out.println( String.format("First argument should be an integer but got: %s", args[0] ));
                return;
            }
        }

        ArrayList<Integer> primes = PrimeNumbers.generate(numberOfPrimes);
        System.out.println(String.format("The first %d prime numbers are: ", numberOfPrimes));
        System.out.println(Arrays.toString(primes.toArray()));
    }
}
