package ThisLibrary.Classes;

import ThisLibrary.Interfaces.I2;

public class KL6 implements I2 {

    public float f6(boolean flag){
        return flag == true?1f:0f;
    }

    @Override
    public int f1(int a, int b) {
        return a+b;
    }

    @Override
    public int f2(int a, int b) {
        return a*b;
    }
}
