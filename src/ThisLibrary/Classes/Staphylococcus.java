package ThisLibrary.Classes;

import ThisLibrary.AClasses.Bacteria;
import ThisLibrary.Interfaces.IFeelable;
import ThisLibrary.Interfaces.IGrowable;

public class Staphylococcus extends Bacteria implements IGrowable, IFeelable {

    public String victim(String s){

        return "F15 is create this string: "+ s;
    }
    @Override
    public void feel(String s) {
        see(s+" Этот метод состоит из вызова метода f4");
    }

    @Override
    public int breath(int a, int b) {
        return a*b;
    }

    @Override
    public void see(String s1) {
        System.out.println(s1);
    }

    @Override
    public int hear(int a, int b) {
        return 0;
    }

    @Override
    public void grow() {
        System.out.println("Booo");
    }
}
