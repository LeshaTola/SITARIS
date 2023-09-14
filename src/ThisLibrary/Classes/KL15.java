package ThisLibrary.Classes;

import ThisLibrary.AClasses.AKL9;
import ThisLibrary.Interfaces.I10;
import ThisLibrary.Interfaces.I8;

public class KL15 extends AKL9 implements I8, I10 {

    public String f15(String s){

        return "F15 is create this string: "+ s;
    }
    @Override
    public void f10(String s) {
        f4(s+" Этот метод состоит из вызова метода f4");
    }

    @Override
    public int f2(int a, int b) {
        return a*b;
    }

    @Override
    public void f4(String s1) {
        System.out.println(s1);
    }

    @Override
    public int f5(int a, int b) {
        return 0;
    }

    @Override
    public void f8() {
        System.out.println("Booo");
    }
}
