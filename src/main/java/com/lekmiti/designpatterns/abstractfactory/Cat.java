package com.lekmiti.designpatterns.abstractfactory;

public class Cat implements Animal {
    @Override
    public String makeSound() {
        return "Miaw Miaw";
    }
}
