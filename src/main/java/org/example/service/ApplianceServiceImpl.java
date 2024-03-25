package org.example.service;

import org.example.dao.ApplianceDAO;
import org.example.entities.Product;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    private final ApplianceDAO<Product> dao;

    public ApplianceServiceImpl(ApplianceDAO<Product> dao) {
        this.dao = dao;
    }

    @Override
    public List<Product> findAllProducts() {
        return dao.findAll();
    }

    @Override
    public List<Product> searchProducts(String parameter, String value) {
        return dao.findByParameter(parameter, value);
    }
}