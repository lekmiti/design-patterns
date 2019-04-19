package com.lekmiti.designpatterns.abstractfactory;


public class ColorFactory implements AbstractFactory<Color, String>{

    @Override
    public Color create(String target) throws Exception {
        switch (target) {
            case "Red" :  return  new Red();
            case "Blue" :  return  new Blue();
            case "Green" :  return  new Green();
            default: throw new Exception("unknown object");
        }
    }
}
