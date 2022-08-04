import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Manjava man = new Manjava();
        man.name = "Улук";
        man.age = 12;
        man.growth = 150;
        man.color = "сары";

        System.out.println("аты:  "+man.name);
        System.out.println("жашы: "+man.age);
        System.out.println( "бою: "+man.growth);
        System.out.println( "тусу: "+man.color);*/

        Laptop laptop = new Laptop();
        laptop.weight = 2;
        System.out.println(laptop);


        Person theMaha = new Person();
        theMaha.name = "Mahamatjan";
        theMaha.age = 18;
        theMaha.laptop = laptop;
        System.out.println(theMaha);
        method(theMaha);


    }

    public static Person method(Person person) {
        return person;
    }
}








