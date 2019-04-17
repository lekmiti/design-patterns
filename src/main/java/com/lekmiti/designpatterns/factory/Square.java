package com.lekmiti.designpatterns.factory;

public class Square implements Polygon {

    @Override
    public void whoIam() {
        System.out.println("I'm a square");
    }
}
