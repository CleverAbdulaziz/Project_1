package itpu.uz.entity;

public interface PowerConsumable<T extends PowerConsumable<T>> {
    double getPowerConsumption();

    T setPowerConsumption(double powerConsumption);
}
