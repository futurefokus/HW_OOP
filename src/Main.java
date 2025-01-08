import InventoryManagement.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 101, 1200.00),
                new Product("Smartphone", 102, 800.00),
                new Product("Tablet", 103, 600.00)
        );

        List<Inventory> inventories = Arrays.asList(
                new Inventory("Kazpost", "Kazakhstan", new ArrayList<>(products)),
                new Inventory("AliExpress", "China", new ArrayList<>(products)),
                new Inventory("Ozon", "Russia", new ArrayList<>(products))
        );

        inventories.get(0).displayProducts();
        System.out.println();

        inventories.get(0).filterProducts(700);
        System.out.println();

        System.out.println("Searching for product with ID 102:");
        Product foundProduct = inventories.get(0).searchProductById(102);
        System.out.println(foundProduct != null ? foundProduct : "Product not found");
        System.out.println();

        System.out.println("Sorting products by price:");
        inventories.get(0).sortProductsByPrice();
        System.out.println();

        Supplier supplier1 = new Supplier("TechSupplier1", 201, products.get(1));
        Supplier supplier2 = new Supplier("TechSupplier2", 202, products.get(0));
        Supplier supplier3 = new Supplier("TechSupplier3", 203, products.get(2));

        System.out.println(supplier1.getProductDetails());
        System.out.println(supplier2.getProductDetails());
        System.out.println(supplier3.getProductDetails());
        System.out.println();

        supplier1.isOlderThan(supplier2);
        supplier2.isOlderThan(supplier3);
    }
}
