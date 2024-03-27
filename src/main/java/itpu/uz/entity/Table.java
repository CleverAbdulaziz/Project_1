package itpu.uz.entity;


import java.util.Objects;

public final class Table extends Furniture<Table> {
    private int numberOfPeople;

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Table() {
    }

    public Table(String furnitureType, String furnitureName, double price, int quantity, double length) {
        super(furnitureType, furnitureName, price, quantity, length);
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", number of people = " + numberOfPeople) + " }";
    }

}