package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.IBreathable;

public class Plant implements IBreathable {
    public int photosynthesis(int efficiency, int speed){
        return efficiency*speed;
    }

    @Override
    public void live() {
        System.out.println("I love sun");
    }

    @Override
    public void breath(int time) {
        System.out.println("I generate oxygen every " + time + " seconds");
    }
}
