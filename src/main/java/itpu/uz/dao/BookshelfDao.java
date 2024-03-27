package itpu.uz.dao;


import itpu.uz.entity.Bookshelf;
import itpu.uz.entity.Table;

public class BookshelfDao extends AbstractFurnitureDao<Bookshelf> {


    public BookshelfDao(String path) {
        super(path);
    }

    @Override
    protected Table parseValues(String[] values) {
        return null;
    }
}