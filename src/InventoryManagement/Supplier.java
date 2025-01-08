package InventoryManagement;

import java.util.*;

public class Supplier {
    private String name;
    private int supplierId;
    private Product product;

    public Supplier(String name, int supplierId, Product product) {
        this.name = name;
        this.supplierId = supplierId;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public String getProductName() {
        return product.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductDetails() {
        return name + " supplies the product: " + product;
    }

    public void isOlderThan(Supplier supplier) {
        if (this.supplierId < supplier.getSupplierId()) {
            System.out.println(this.name + " has been in business longer than " + supplier.getName());
        } else {
            System.out.println(this.name + " has not been in business longer than " + supplier.getName());
        }
    }

    @Override
    public String toString() {
        return "Supplier{name='" + name + "', supplierId=" + supplierId + ", product=" + product + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return supplierId == supplier.supplierId && Objects.equals(name, supplier.name) && Objects.equals(product, supplier.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, supplierId, product);
    }
}
