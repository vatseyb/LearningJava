package com.learning.java.concepts;

public class InheritanceCasting {
        private static int result;
        public static void main(String... doYourBest) {
            Character homer = new Homer();
            homer.drink();
            new Character().drink();
            //((Homer)homer).strangleBart();
            //Character character = new Character();
            System.out.println(result);
            //The below statement if commented then will give Classcastexception because we can not type cast
            //character object of Character type with subclass object because Character doesn't have information
            //about
            //((Homer)character).strangleBart();
        }

        static class Character {
            Character() {
                result++;
                System.out.println("I am the Character class constructor");
            }
            void drink() {
                System.out.println("Drink");
            }
        }

        static class Homer extends Character {
            Lung lung = new Lung();

            void strangleBart() {
                System.out.println("Why you little!");
            }
            void drink() {
                System.out.println("Drink beer");
                lung.damageLungs();
            }
        }

        static class Lung {
            void damageLungs() {
                System.out.println("Soon you will need a transplant");
            }
        }

    }
