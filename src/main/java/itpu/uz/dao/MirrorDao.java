package itpu.uz.dao;


import itpu.uz.entity.Mirror;
import itpu.uz.entity.Table;

public class MirrorDao extends AbstractFurnitureDao<Mirror> {


    public MirrorDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}