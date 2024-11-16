package com.gmalheiro.spring.boot.test.car;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Corolla implements  Car{
    @Override
    public void accelerate() {
        System.out.println("Vroom");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }


    @Override
    public void honk() {
        System.out.println("Honking");
    }
}