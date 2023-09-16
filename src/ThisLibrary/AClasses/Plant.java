package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.IBreathable;

public class Plant implements IBreathable {
    public int photosynthesis(int a, int b){
        return a*a*b;
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
