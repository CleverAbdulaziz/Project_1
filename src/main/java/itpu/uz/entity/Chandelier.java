package itpu.uz.entity;


public final class Chandelier extends Furniture<Chandelier> implements PowerConsumable<Chandelier> {
    private double powerConsumption;

    @Override
    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public Chandelier setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", power consumption = " + powerConsumption) + " }";
    }

}
