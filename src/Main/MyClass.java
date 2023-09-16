package Main;

import ThisLibrary.Classes.*;

public class MyClass {

    public static void main(String[] args) {
        Lungs lungs = new Lungs();
        System.out.println();
        System.out.println("lungs Ability): ");
        lungs.breath(10);
        lungs.cough(true);
        lungs.cough(false);
        lungs.live();

        Oak oak = new Oak();
        System.out.println();
        System.out.println("oak Ability: ");
        System.out.println(oak.photosynthesis(12, 21));
        oak.getAcorn(80);
        oak.breath(12);
        oak.live();

        Maple maple = new Maple();
        System.out.println();
        System.out.println("maple Ability: ");
        System.out.println(maple.photosynthesis(122, 11));
        System.out.println(maple.getSyrup());
        maple.breath(12);
        maple.live();

        Robot gpt = new Robot();
        System.out.println();
        System.out.println("gpt Ability: ");
        gpt.eat("hamburger");
        gpt.feel("sequence");
        gpt.wroteSymphony();
        gpt.live();
        gpt.see("Furie Vova");
        gpt.hear("Furie Vova");
        gpt.TellTruth("am i alive");

        Staphylococcus staphylococcus = new Staphylococcus();
        System.out.println();
        System.out.println("staphylococcus Ability: ");
        staphylococcus.breath(22);
        staphylococcus.feel("good");
        staphylococcus.see("virus");
        staphylococcus.grow();
        staphylococcus.hear("bacteria");
        staphylococcus.victim();
        staphylococcus.eat("brother");
        staphylococcus.live();
    }
}
