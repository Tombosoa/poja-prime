package com.company.prime.endpoint.rest.controller;

import com.company.prime.endpoint.event.PojaPrime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class PojaPrimeController {
    @GetMapping("/new-prime")
    public BigInteger getPrimeNumber(){
        return PojaPrime.getPrime();
    }
}
