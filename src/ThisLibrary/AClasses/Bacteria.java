package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.IFeadable;

public class Bacteria implements IFeadable {

    public void multiply(boolean flag) {
        if (flag) {
            System.out.println("lol");
        } else {
            System.out.println("kek");
        }
    }

    @Override
    public int live(int a, int b) {
        return b/a;
    }

    @Override
    public String Eat(String a) {
        return "new String" + a;
    }
}
