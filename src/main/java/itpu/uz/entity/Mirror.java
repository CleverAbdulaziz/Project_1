package itpu.uz.entity;


public final class Mirror extends Furniture<Mirror> implements PowerConsumable<Mirror> {
    private double powerConsumption;

    public Mirror(String furnitureType, String furnitureName, double price, int quantity, double length) {
        super(furnitureType, furnitureName, price, quantity, length);
    }

    @Override
    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public Mirror setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", power consumption = " + powerConsumption) + " }";
    }

}
