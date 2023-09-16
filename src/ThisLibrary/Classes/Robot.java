package ThisLibrary.Classes;

import ThisLibrary.AClasses.AI;
import ThisLibrary.Interfaces.IFeelable;

public class Robot extends AI implements IFeelable {

    public String wroteSymphony(){
        return " Robot can not write Symphony";
    }

    @Override
    public void feel(String food) {
        System.out.println("Жестко чувствую: " + food);
    }

    @Override
    public String eat(String food) {
        return "convert "+ food+ " to energy";
    }
}
