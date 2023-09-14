package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.I3;

public class AKL9 implements I3 {

    public void f9(boolean flag) {
        if (flag) {
            System.out.println("lol");
        } else {
            System.out.println("kek");
        }
    }

    @Override
    public int f1(int a, int b) {
        return b/a;
    }

    @Override
    public String f3(String a) {
        return "new String" + a;
    }
}
