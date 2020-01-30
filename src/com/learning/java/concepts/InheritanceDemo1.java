package com.learning.java.concepts;
/*
Purpose: This program is to demonstrate the method overriding in Inheritance.
Author: Bhuvi
Date: 1/26
 */

    class Animal {

        void emitSound() {
            System.out.println("The animal emitted a sound");
        }

    }
//cat "is an " animal
    class Cat extends Animal {

        @Override
        void emitSound() {
            System.out.println("Meow");
        }
    }
//dog "is an " animal
    class Dog extends Animal {
    }
public class InheritanceDemo1 {
        public static void main(String... doYourBest) {
            //object can be made by Animal cat or Cat cat
            Animal cat = new Cat(); // Meow
            //object can be made by Animal dog or Dog dog
            Animal dog = new Dog(); // The animal emitted a sound
            Cat cat1 = new Cat(); // Meow
            Dog dog1 = new Dog(); // The animal emitted a sound
            Animal animal = new Animal(); // The animal emitted a sound

            cat.emitSound();
            dog.emitSound();
            animal.emitSound();
            //same result as cat.emitsound
            cat1.emitSound();
            dog1.emitSound();
        }

    }
