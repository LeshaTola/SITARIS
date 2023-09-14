package Main;

import ThisLibrary.Classes.*;

public class MyClass {

    public static void main(String[] args) {
        KL6 firstClass = new KL6();
        System.out.println();
        System.out.println("KL6 Ability): ");
        System.out.println(firstClass.f1(1, 20));
        System.out.println(firstClass.f2(2, 2));
        System.out.println(firstClass.f6(true));
        System.out.println(firstClass.f6(false));

        KL12 secondClass = new KL12();
        System.out.println();
        System.out.println("KL12 Ability: ");
        System.out.println(secondClass.f1(10, 20));
        System.out.println(secondClass.f2(20, 10));
        System.out.println(secondClass.f7(13, 13));
        System.out.println(secondClass.f12(45.24f));

        KL13 thirdClass = new KL13();
        System.out.println();
        System.out.println("KL13 Ability: ");
        System.out.println(thirdClass.f1(20, 10));
        System.out.println(thirdClass.f2(123, 333));
        System.out.println(thirdClass.f7(1212, 222));
        System.out.println(thirdClass.f13());

        KL14 forthClass = new KL14();
        System.out.println();
        System.out.println("KL14 Ability: ");
        System.out.println(forthClass.f1(543, 234));
        System.out.println(forthClass.f3("My name is Gus"));
        forthClass.f4("Welcome to the los poels hermanos family");
        System.out.println(forthClass.f5(243, 543));
        forthClass.f10("Goo gaa gao");
        System.out.println(forthClass.f11("He-Hi-HI-Ha"));
        forthClass.f14("another one");

        KL15 fifthClass = new KL15();
        System.out.println();

        System.out.println("KL15 Ability: ");
        System.out.println(fifthClass.f1(54543, 23432));
        System.out.println(fifthClass.f2(2, 5434));
        System.out.println(fifthClass.f3("Koala"));
        fifthClass.f4("Mario");
        System.out.println(fifthClass.f5(243, 543));
        fifthClass.f8();
        fifthClass.f9(false);
        fifthClass.f10("look at me");
        System.out.println(fifthClass.f15("aloha miky"));
    }
}
