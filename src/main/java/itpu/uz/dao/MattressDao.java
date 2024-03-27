package itpu.uz.dao;


import itpu.uz.entity.Mattress;
import itpu.uz.entity.Table;

public class MattressDao extends AbstractFurnitureDao<Mattress> {

    public MattressDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}