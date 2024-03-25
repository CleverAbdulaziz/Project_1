package org.example.dao;

import org.example.entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractDao<A extends Product> implements ApplianceDAO<A> {
    private final String filePath;

    public AbstractDao(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<A> findAll() {
        return readFromFile();
    }

    @Override
    public List<A> findByParameter(String parameter, String value) {
        return readFromFile().stream().filter(product -> {
            switch (parameter.toLowerCase()) {
                case "name": return product.getName().equalsIgnoreCase(value);
                case "category": return product.getCategory().equalsIgnoreCase(value);
                // Additional case checks for other parameters
                default: return false;
            }
        }).collect(Collectors.toList());
    }

    protected List<A> readFromFile() {
        List<A> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                A product = (A) new Product(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        Double.parseDouble(parts[3]),
                        Integer.parseInt(parts[4]));
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return products;
    }
}
