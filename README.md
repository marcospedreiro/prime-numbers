# Prime Number Generator

Just adding my two cents to a [reddit thread](https://www.reddit.com/r/programming/comments/hhlvqq/its_probably_time_to_stop_recommending_clean_code/fwawv2x?utm_source=share&utm_medium=web2x), 
will most likely delete soon

A simply (and non optimized) prime number generator

## Resources

- `java -version`: java version "14" 2020-03-17
- `mvn --version`: Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)

## Building Locally

Build and run unit tests
```
mvn clean install
```

## Running Locally

After building you may run the jar on the command line

```
$ java -jar target/PrimeNumbers-1.0-SNAPSHOT.jar
The first 10 prime numbers are:
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
```

or with a command line flag: 

```
java -jar target/PrimeNumbers-1.0-SNAPSHOT.jar
The first 12 prime numbers are:
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37]
```

