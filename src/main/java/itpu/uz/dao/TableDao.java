package itpu.uz.dao;


import itpu.uz.entity.Table;

public class TableDao extends AbstractFurnitureDao<Table> {

    public TableDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}