package itpu.uz.dao;


import itpu.uz.entity.Lamp;
import itpu.uz.entity.Table;

public class LampDao extends AbstractFurnitureDao<Lamp> {

    public LampDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}