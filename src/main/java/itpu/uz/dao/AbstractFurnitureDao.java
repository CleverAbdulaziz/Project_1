package itpu.uz.dao;


import itpu.uz.entity.Furniture;
import itpu.uz.entity.Table;

public abstract class AbstractFurnitureDao<F extends Furniture<F>> implements FurnitureDao<F> {

    public AbstractFurnitureDao(String path) {
    }

    protected abstract Table parseValues(String[] values);
}