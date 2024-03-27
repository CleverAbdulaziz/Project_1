package itpu.uz.entity;


public final class ComputerDesk extends Furniture<ComputerDesk> implements PowerConsumable<ComputerDesk> {
    private double powerConsumption;

    @Override
    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public ComputerDesk setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", power consumption = " + powerConsumption) + " }";
    }

}
