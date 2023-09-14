package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.I2;

public class AKL7 implements I2 {
    public int f7(int a,int b){
        return a*a*b;
    }

    @Override
    public int f1(int a, int b) {
        return (int)(Math.pow(a,b));
    }

    @Override
    public int f2(int a, int b) {
        return a-b;
    }
}
