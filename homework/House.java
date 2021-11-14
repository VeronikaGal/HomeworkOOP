package com.galeeva.oop.homework;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
 * (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
 * и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class House {

    private int houseNumber;
    private int[] floors;

    public House(int houseNumber, int[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getFloors() {
        return this.floors.length;
    }

    public void print() {
        System.out.println("Дом " + getHouseNumber() + ", количество этажей " + getFloors());
    }
}
