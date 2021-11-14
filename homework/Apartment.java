package com.galeeva.oop.homework;

public class Apartment {

    private int apartmentNumber;
    private int[] rooms;

    public Apartment(int apartmentNumber, int[] rooms) {
        this.apartmentNumber = apartmentNumber;
        this.rooms = rooms;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getRooms() {
        return rooms.length;
    }

    public void print() {
        System.out.println("Квартира " + getApartmentNumber() + ", количество комнат " + getRooms());
    }
}
