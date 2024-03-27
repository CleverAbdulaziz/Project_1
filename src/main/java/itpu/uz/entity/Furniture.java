package itpu.uz.entity;


import java.util.Objects;

public abstract class Furniture<T extends Furniture<T>> {
    private String furnitureType;
    private String furnitureName;
    private double price;
    private int quantity;
    private double length;

    public Furniture(String furnitureType, String furnitureName, double price, int quantity, double length) {
        this.furnitureType = furnitureType;
        this.furnitureName = furnitureName;
        this.price = price;
        this.quantity = quantity;
        this.length = length;
    }

    protected Furniture() {
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getFurnitureName() {
        return furnitureName;
    }

    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture<?> furniture = (Furniture<?>) o;
        return Double.compare(price, furniture.price) == 0 && quantity == furniture.quantity && Double.compare(length, furniture.length) == 0 && Objects.equals(furnitureType, furniture.furnitureType) && Objects.equals(furnitureName, furniture.furnitureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(furnitureType, furnitureName, price, quantity, length);
    }

    @Override
    public String toString() {
        return "Furniture { " +
                "furniture type = '" + furnitureType + '\'' +
                ", furniture name = '" + furnitureName + '\'' +
                ", price = " + price +
                ", quantity = " + quantity +
                ", length = " + length + '}';
    }

}