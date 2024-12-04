package app.models;

import app.service.Area;

public class Square implements Area {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}