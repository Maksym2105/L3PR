package app.models;

import app.service.Participant;

public class Human implements Participant {

    private String name;
    private int maxRunDistance;
    private int maxJumpDistance;

    public Human(String name, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public boolean run(int distance) {
        if(distance <= maxRunDistance){
            System.out.println(name + " пробіг " + distance + " м. ");
            return true;
        }else{
            System.out.println(name + " не зміг пробігти " + distance + " м. ");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if(height <= maxJumpDistance){
            System.out.println(name + " перестрибнув " + height + " м. ");
            return true;
        }else{
            System.out.println(name + " не зміг перестрибнути" + height + " м. ");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}