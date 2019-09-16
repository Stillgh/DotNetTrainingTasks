package com.epam.nettrainingtasks.fourthtask;


import java.math.BigInteger;

public class FactorialFinder {

    public BigInteger findFactorial(int num) {
        BigInteger bigInteger = BigInteger.valueOf(num);
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        } else {
            return (bigInteger.multiply(findFactorial(num - 1)));
        }
    }
}
