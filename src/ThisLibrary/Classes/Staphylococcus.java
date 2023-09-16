package ThisLibrary.Classes;

import ThisLibrary.AClasses.Bacteria;
import ThisLibrary.Interfaces.IFeelable;
import ThisLibrary.Interfaces.IGrowable;

public class Staphylococcus extends Bacteria implements IGrowable, IFeelable {

    public void victim(){
        System.out.println("Krov matuki ybistva");
    }

    @Override
    public void breath(int time) {
        System.out.println("Breath by leather every "+ time);
    }

    @Override
    public void feel(String feel) {
        System.out.println("I eat: " + feel);
    }

    @Override
    public void grow() {
        System.out.println("Grow by eating ");
    }

    @Override
    public void hear(String message) {
        System.out.println("Hear "+ message + "by ...");
    }

    @Override
    public void see(String object) {
        System.out.println("see: " + object);
    }
}
