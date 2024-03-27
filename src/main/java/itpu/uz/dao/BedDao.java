package itpu.uz.dao;


import itpu.uz.entity.Bed;
import itpu.uz.entity.Table;

public class BedDao extends AbstractFurnitureDao<Bed> {

    public BedDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}