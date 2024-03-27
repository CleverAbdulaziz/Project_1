package itpu.uz.dao;

import itpu.uz.entity.ComputerDesk;
import itpu.uz.entity.Table;

public class ComputerDeskDao extends AbstractFurnitureDao<ComputerDesk> {

    public ComputerDeskDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}