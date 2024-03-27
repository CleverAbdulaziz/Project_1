package itpu.uz.dao;


import itpu.uz.entity.Chandelier;
import itpu.uz.entity.Table;

public class ChandelierDao extends AbstractFurnitureDao<Chandelier> {

    public ChandelierDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}