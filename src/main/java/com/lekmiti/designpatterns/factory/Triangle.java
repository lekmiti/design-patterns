package com.lekmiti.designpatterns.factory;

public class Triangle implements Polygon {

    @Override
    public void whoIam() {
        System.out.println("I'm a triangle");
    }
}
