package app;

import app.models.Circle;
import app.models.Square;
import app.models.Triangle;
import app.service.Area;

public class L3PR {
    public static void main(String[] args) {

        Area[] figures = new Area[]{
                new Circle(3),
                new Triangle(5, 9),
                new Square(6)
        };

        double totalArea = getTotalArea(figures);
        System.out.println("Сумарна площа всіх фігур " + totalArea);
    }
    public static double getTotalArea(Area [] figures) {
        double total = 0;
        for(Area figure : figures){
            total += figure.getArea();
        }
        return total;
        }

    }
