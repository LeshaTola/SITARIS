package Main;

import ThisLibrary.Classes.*;

public class MyClass {

    public static void main(String[] args) {
        KL6 firstClass = new KL6();
        System.out.println("KL6 Ability: ");
        firstClass.f1(1,2);
        firstClass.f2(2,2);
        firstClass.f6(true);
        firstClass.f6(false);

        KL12 secondClass = new KL12();
        System.out.println("KL12 Ability: ");
        secondClass.f1(10,20);
        secondClass.f2(20,10);
        secondClass.f7(13,13);
        secondClass.f12(45.24f);

        KL13 thirdClass = new KL13();
        System.out.println("KL13 Ability: ");
        thirdClass.f1(20,10);
        thirdClass.f2(123,333);
        thirdClass.f7(1212,222);
        thirdClass.f13();

        KL14 forthClass = new KL14();
        System.out.println("KL14 Ability: ");
        forthClass.f1(543,234);
        forthClass.f3("My name is Gus");
        forthClass.f4("Welcome to the los poels hermanos family");
        forthClass.f5(243,543);
        forthClass.f10("Goo gaa gao");
        forthClass.f11("He-Hi-HI-Ha");
        forthClass.f14("another one");

        KL15 fifthClass = new KL15();
        System.out.println("KL15 Ability: ");
        fifthClass.f1(54543,23432);
        fifthClass.f2(2,5434);
        fifthClass.f3("Koala");
        fifthClass.f4("Mario");
        fifthClass.f5(243,543);
        fifthClass.f8();
        fifthClass.f9(false);
        fifthClass.f10("look at me");
        fifthClass.f15("aloha miky");
    }
}
