package com.galeeva.oop.homework;

public class HouseRunner {

    public static void main(String[] args) {
        House house = new House(8, new int[9]);
        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.print();
        Floor floor = new Floor(6, new int[16]);
        floor.print();

        Apartment apartment = new Apartment(7, new int[3]);
        apartment.print();

        Room room = new Room(true);
        room.print();
    }
}
