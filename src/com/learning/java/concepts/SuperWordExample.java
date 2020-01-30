package com.learning.java.concepts;
/*
Purpose: Demonstrate the super keyword in java. The constructor is by default inherited
without the use of super.But he methods need the super keyword.
 */

        class Character {

            Character() {
                System.out.println("A Character has been created");
            }

            void move() {
                System.out.println("Character walking...");
            }

        }

        class Moe extends Character {

            Moe() {
                super();
            }
            void giveBeer() {
                super.move();
                System.out.println("Give beer");
            }
        }
public class SuperWordExample {
            public static void main(String[] args)
            {
                Moe moeobj = new Moe();
                moeobj.giveBeer();
            }
    }

