package itpu.uz.dao;


import itpu.uz.entity.MassageChair;
import itpu.uz.entity.Table;

public class MassageChairDao extends AbstractFurnitureDao<MassageChair> {

    public MassageChairDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}