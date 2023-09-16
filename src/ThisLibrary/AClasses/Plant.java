package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.IBreathable;

public class Plant implements IBreathable {
    public int photosynthesis(int a, int b){
        return a*a*b;
    }

    @Override
    public int live(int a, int b) {
        return (int)(Math.pow(a,b));
    }

    @Override
    public int breath(int a, int b) {
        return a-b;
    }
}
