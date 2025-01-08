package InventoryManagement;

import java.util.*;

public class Inventory {
    private String warehouseName;
    private String location;
    private List<Product> products;

    public Inventory(String warehouseName, String location, List<Product> products) {
        this.warehouseName = warehouseName;
        this.location = location;
        this.products = products;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void displayProducts() {
        System.out.println("Products in " + warehouseName + " (" + location + "):");
        products.forEach(System.out::println);
    }

    public void filterProducts(double priceThreshold) {
        System.out.println("Products priced above " + priceThreshold + ":");
        products.stream()
                .filter(product -> product.getPrice() > priceThreshold)
                .forEach(System.out::println);
    }

    public Product searchProductById(int id) {
        return products.stream()
                .filter(product -> product.getProductId() == id)
                .findFirst()
                .orElse(null);
    }

    public void sortProductsByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Products sorted by price:");
        displayProducts();
    }
}
