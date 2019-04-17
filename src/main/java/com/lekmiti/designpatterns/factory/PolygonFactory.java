package com.lekmiti.designpatterns.factory;



public class PolygonFactory {

    public Polygon getPolygon(int numberOfSides) {
        switch (numberOfSides) {
            case 3 : return new Triangle();
            case 4 : return new Square();
            case 5 : return new Pentagon();
            default: throw new RuntimeException("could not create a polygon with this number of sides");
        }
    }
}
