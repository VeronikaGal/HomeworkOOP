package com.galeeva.oop.homework;

public class Floor {

    private int floorNumber;
    private int[] apartments;

    public Floor(int floorNumber, int[] apartments) {
        this.floorNumber = floorNumber;
        this.apartments = apartments;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getApartments() {
        return apartments.length;
    }

    public void print() {
        System.out.println("Этаж " + getFloorNumber() + ", количество квартир " + getApartments());
    }
}
