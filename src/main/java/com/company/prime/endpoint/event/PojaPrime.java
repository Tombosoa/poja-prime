package com.company.prime.endpoint.event;

import java.math.BigInteger;
import java.util.Random;

public class PojaPrime {
    public static BigInteger getPrime(){
        BigInteger prime = BigInteger.probablePrime(10000, new Random());
        return prime;
    }
}
