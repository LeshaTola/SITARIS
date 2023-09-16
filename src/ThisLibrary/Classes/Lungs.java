package ThisLibrary.Classes;

import ThisLibrary.Interfaces.IBreathable;

public class Lungs implements IBreathable {

    public float cough(boolean flag){
        return flag == true?1f:0f;
    }

    @Override
    public int live(int a, int b) {
        return a+b;
    }

    @Override
    public int breath(int a, int b) {
        return a*b;
    }
}
