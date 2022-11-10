package com.company.animals;

public class AnimalSchool {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.run();
        Squirrel squirrel = new Squirrel();
        squirrel.climb();
    }
}

interface Running {// Printing
    public void run();
}

interface Swimming{// Interface vs abstract class
    public void swim();
}

interface Climbing{
    public void climb();
}

class Rabbit implements Running, Swimming{
    @Override
    public void run() {
        System.out.println("rabbit runs");
    }
    @Override
    public void swim() {
        System.out.println("rabbit swim");
    }
}

class Squirrel implements Running, Climbing{
    @Override
    public void run() {
        System.out.println("rabbit runs");
    }
    @Override
    public void climb() {
        System.out.println("rabbit climbs");
    }
}