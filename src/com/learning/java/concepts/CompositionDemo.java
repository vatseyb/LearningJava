package com.learning.java.concepts;

public class CompositionDemo {

    public static void main(String... houseComposition) {
        House houseObj = new House(new Bedroom(), new LivingRoom());
        houseObj.livingRoom.lRoomDetails();
        houseObj.bedroom.bRoomDetails();

        // The house now is composed with a Bedroom and a LivingRoom
    }

    static class House {

        Bedroom bedroom;
        LivingRoom livingRoom;

        House(Bedroom bedroom, LivingRoom livingRoom) {
            this.bedroom = bedroom;
            this.livingRoom = livingRoom;
        }

    }

    static class LivingRoom {
        public void lRoomDetails() {
            System.out.println("This is the Living Room");
        }
    }

    static class Bedroom {
        public void bRoomDetails() {
            System.out.println("This is the Bedroom");
        }
    }
}
