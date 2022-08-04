package com.company;

import com.company.Laptop;

public class Person {
    public String name;
    public double weight;
    public String citizenship;
    public int age;
    public Laptop laptop = new Laptop();

    @Override
    public String toString() {
        return "com.company.Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", citizenship='" + citizenship + '\'' +
                ", age=" + age +
                ", laptop=" + laptop +
                '}';
    }
}
