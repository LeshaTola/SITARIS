package ThisLibrary.Classes;

import ThisLibrary.AClasses.AI;
import ThisLibrary.Interfaces.IFeelable;

public class Robot extends AI implements IFeelable {

    public void wroteSymphony(String s){
        System.out.println(s+ " another string function (f14)");
    }

    @Override
    public void feel(String s) {
        System.out.println(s+ " another string function (f10)");
    }

    @Override
    public String Eat(String s) {
        return "Hello World and "+ s;
    }
}
