package itpu.uz.dao;


import itpu.uz.entity.Sofa;
import itpu.uz.entity.Table;

public class SofaDao extends AbstractFurnitureDao<Sofa> {

    public SofaDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}