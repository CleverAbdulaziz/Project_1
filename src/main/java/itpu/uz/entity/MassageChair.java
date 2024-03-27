package itpu.uz.entity;

public final class MassageChair extends Furniture<MassageChair> implements PowerConsumable<MassageChair> {
    private double powerConsumption;

    public MassageChair(String furnitureType, String furnitureName, double price, int quantity, double length) {
        super(furnitureType, furnitureName, price, quantity, length);
    }

    @Override
    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public MassageChair setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", power consumption = " + powerConsumption) + " }";
    }

}
