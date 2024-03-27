package itpu.uz.entity;

import java.util.Objects;

public final class Bookshelf extends Furniture<Bookshelf> {
    private int numberOfShelves;

    public Bookshelf(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }


    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", number of shelves = " + numberOfShelves) + " }";
    }

}