package app.models;

import app.service.Obstacle;
import app.service.Participant;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        boolean success = participant.jump(height);
        if(success){
            System.out.println
                    ("Учасник " + participant.getName() + " перестрибнув стіну висотою " + height + " м. ");
        }else{
            System.out.println
                    ("Учасник " + participant.getName() + " не зміг престрибнути стіну висотою " + height + " м. ");
        }
        return success;

    }
}