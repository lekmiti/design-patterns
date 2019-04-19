package com.lekmiti.designpatterns.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal, String>{

    @Override
    public Animal create(String target) throws Exception {
        switch (target) {
            case "Cat" :  return  new Cat();
            case "Dog" :  return  new Dog();
            case "Coq" :  return  new Coq();
            default: throw new Exception("unknown object");
        }
    }
}

