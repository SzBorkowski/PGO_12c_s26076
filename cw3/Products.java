package PGO_12c.cw3;

public class Products {

    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Products nextProducts;
    private Storage storage;

    public Products(String name, ProductType productType, double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
    }

    public void isAvailable() {

    }

    public Products getNextProducts() {
        return nextProducts;
    }

    public void setNextCProducts(Products nextProducts) {
        this.nextProducts = nextProducts;
    }

    public void Sell() {
        quantity = 0;
    }
    public void IncreaseQuantity(int increase) {
        if (increase < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        }
        this.quantity += increase;
    }
}
