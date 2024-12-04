package app;

import app.models.*;
import app.service.Area;
import app.service.Obstacle;
import app.service.Participant;

public class L3PR {
    public static void main(String[] args) {

        Area[] figures = new Area[]{
                new Circle(3),
                new Triangle(5, 9),
                new Square(6)
        };

        double totalArea = getTotalArea(figures);
        System.out.println("Сумарна площа всіх фігур " + totalArea);
        System.out.println();

        Participant[] participants = {
                new Human("Микола", 1000, 2),
                new Cat("Мурчик", 1500, 3),
                new Robot("Claptrap", 3000, 1)
        };

        Obstacle[] obstacles = {
                new RunningTrack(500),
                new Wall(2),
                new RunningTrack(700),
                new Wall(3),
        };

        for (Participant participant : participants) {
            boolean passedAll = true;
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    System.out.println("Учасник " + participant.getName() + " вибув із змагання.");
                    passedAll = false;
                    break;
                }
            }
                if (passedAll) {
                    System.out.println("Учасник " + participant.getName() + " пройшов всі перешкоди!");
                }
            }
        }
        public static double getTotalArea (Area[]figures){
            double total = 0;
            for (Area figure : figures) {
                total += figure.getArea();
            }
            return total;
        }
    }
