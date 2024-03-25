package org.example.controller;

import org.example.dao.ApplianceDAO;
import org.example.dao.AbstractDao;
import org.example.entities.Product;
import org.example.service.ApplianceService;
import org.example.service.ApplianceServiceImpl;

import java.util.List;
import java.util.Scanner;

public class NameOfProjectController {
    public static void main(String[] args) {
        ApplianceDAO<Product> productDao = new AbstractDao<>("inventory.txt") {
        };
        ApplianceService service = new ApplianceServiceImpl(productDao);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            String[] commands = input.split(" ");

            if ("exit".equalsIgnoreCase(commands[0])) {
                System.out.println("Exiting the application...");
                break;
            }

            switch (commands[0].toLowerCase()) {
                case "list":
                    List<Product> products = service.findAllProducts();
                    if (products.isEmpty()) {
                        System.out.println("No products found.");
                    } else {
                        products.forEach(product -> System.out.println(
                                "ID: " + product.getId() +
                                        ", Name: " + product.getName() +
                                        ", Category: " + product.getCategory() +
                                        ", Price: $" + product.getPrice() +
                                        ", Quantity: " + product.getQuantity()));
                    }
                    break;
                case "search":
                    if (commands.length < 3) {
                        System.out.println("Invalid search command. Use: search <parameter> <value>");
                    } else {
                        String parameter = commands[1];
                        String value = commands[2];
                        List<Product> searchResults = service.searchProducts(parameter, value);
                        if (searchResults.isEmpty()) {
                            System.out.println("No matching products found.");
                        } else {
                            searchResults.forEach(product -> System.out.println(
                                    "ID: " + product.getId() +
                                            ", Name: " + product.getName() +
                                            ", Category: " + product.getCategory() +
                                            ", Price: $" + product.getPrice() +
                                            ", Quantity: " + product.getQuantity()));
                        }
                    }
                    break;
                default:
                    System.out.println("Unknown command. Available Commands: list, search <parameter> <value>, exit");
            }
        }
        scanner.close();
    }
}
