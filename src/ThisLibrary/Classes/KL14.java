package ThisLibrary.Classes;

import ThisLibrary.AClasses.AKL11;
import ThisLibrary.Interfaces.I10;

public class KL14 extends AKL11 implements I10 {

    public void f14(String s){
        System.out.println(s+ " another string function (f14)");
    }

    @Override
    public void f10(String s) {
        System.out.println(s+ " another string function (f10)");
    }

    @Override
    public String f3(String s) {
        return "Hello World and "+ s;
    }
}
