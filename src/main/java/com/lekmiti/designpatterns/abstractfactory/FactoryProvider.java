package com.lekmiti.designpatterns.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) throws Exception {
        switch (choice) {
            case "Animal": return new AnimalFactory();
            case "Color": return new ColorFactory();
            default: throw new Exception("unknown factory");
        }
    }
}
