package org.example.service;

import org.example.entities.Product;
import java.util.List;

public interface ApplianceService {
    List<Product> findAllProducts();
    List<Product> searchProducts(String parameter, String value);
}