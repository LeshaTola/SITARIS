package Main;

import ThisLibrary.Classes.*;

public class MyClass {

    public static void main(String[] args) {
        Lungs firstClass = new Lungs();
        System.out.println();
        System.out.println("KL6 Ability): ");
        System.out.println(firstClass.live(1, 20));
        System.out.println(firstClass.breath(2, 2));
        System.out.println(firstClass.cough(true));
        System.out.println(firstClass.cough(false));

        Oak secondClass = new Oak();
        System.out.println();
        System.out.println("KL12 Ability: ");
        System.out.println(secondClass.live(10, 20));
        System.out.println(secondClass.breath(20, 10));
        System.out.println(secondClass.photosynthesis(13, 13));
        System.out.println(secondClass.getAcorn(45.24f));

        Maple thirdClass = new Maple();
        System.out.println();
        System.out.println("KL13 Ability: ");
        System.out.println(thirdClass.live(20, 10));
        System.out.println(thirdClass.breath(123, 333));
        System.out.println(thirdClass.photosynthesis(1212, 222));
        System.out.println(thirdClass.getSyrup());

        Robot forthClass = new Robot();
        System.out.println();
        System.out.println("KL14 Ability: ");
        System.out.println(forthClass.live(543, 234));
        System.out.println(forthClass.Eat("My name is Gus"));
        forthClass.see("Welcome to the los poels hermanos family");
        System.out.println(forthClass.hear(243, 543));
        forthClass.feel("Goo gaa gao");
        System.out.println(forthClass.f11("He-Hi-HI-Ha"));
        forthClass.wroteSymphony("another one");

        Staphylococcus fifthClass = new Staphylococcus();
        System.out.println();

        System.out.println("KL15 Ability: ");
        System.out.println(fifthClass.live(54543, 23432));
        System.out.println(fifthClass.breath(2, 5434));
        System.out.println(fifthClass.Eat("Koala"));
        fifthClass.see("Mario");
        System.out.println(fifthClass.hear(243, 543));
        fifthClass.grow();
        fifthClass.multiply(false);
        fifthClass.feel("look at me");
        System.out.println(fifthClass.victim("aloha miky"));
    }
}
