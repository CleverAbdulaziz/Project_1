package itpu.uz.entity;


public final class Mattress extends Furniture<Mattress> {
    private String comfortLevel;

    public Mattress(String furnitureType, String furnitureName, double price, int quantity, double length) {
        super(furnitureType, furnitureName, price, quantity, length);
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", comfort level = " + comfortLevel) + " }";
    }
}