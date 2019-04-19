package com.lekmiti.designpatterns.abstractfactory;

public class Dog implements Animal{
    @Override
    public String makeSound() {
        return "Haw Haw";
    }
}
