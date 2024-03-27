package itpu.uz.entity;


public final class Lamp extends Furniture<Lamp> implements PowerConsumable<Lamp> {
    private double powerConsumption;

    public Lamp(String furnitureType, String furnitureName, double price, int quantity, double length) {
        super(furnitureType, furnitureName, price, quantity, length);
    }

    @Override
    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public Lamp setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", power consumption = " + powerConsumption) + " }";
    }

}
