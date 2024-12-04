package app.models;

import app.service.Obstacle;
import app.service.Participant;

public class RunningTrack implements Obstacle {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        boolean success = participant.run(length);
        if (success) {
            System.out.println
                    ("Учасник " + participant.getName() + " подолав бігову доріжку довжиною " + length + " м. ");
        } else {
            System.out.println
                    ("Учасник " + participant.getName() + " не зміг подолати бігову доріжку " + length + " м. ");
        }
        return success;

    }
}