package com.company.animals;

import java.util.LinkedList;
import java.util.List;

public class Animals {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Mouse();
        for (Animal animal : animals)
            animal.sound();

        List<Animal> animalList = new LinkedList<>();
        animalList.add(new Cat());
        animalList.add(new Dog());
        animalList.add(new Mouse());
        for (Animal animal : animalList) {

        }
    }
}

abstract class Animal {
    abstract public void sound();
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("woof");
    }
}

class Mouse extends Animal {
    @Override
    public void sound() {
        System.out.println("squeak");
    }
}
