package com.galeeva.oop.homework;

public class Room {

    private boolean walkThroughRoom;

    public Room(boolean walkThroughRoom) {
        this.walkThroughRoom = walkThroughRoom;
    }

    public boolean isWalkThroughRoom() {
        return walkThroughRoom;
    }

    public void print() {
        if (isWalkThroughRoom()) {
            System.out.println("Это проходная комната.");
        } else {
            System.out.println("Это не проходная комната.");
        }
    }
}
