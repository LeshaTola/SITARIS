package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.I4;
import ThisLibrary.Interfaces.I5;

public class AKL11 implements I4, I5 {

    public boolean f11(String s){
        if(s.equals("Yes")){
        return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int f1(int a, int b) {
        return a*2+b/2;
    }

    @Override
    public void f4(String s1) {

    }

    @Override
    public int f5(int a, int b) {
        return 1000 + a+b;
    }
}
