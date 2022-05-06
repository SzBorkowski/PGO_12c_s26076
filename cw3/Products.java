package PGO_12c.cw3;

public class Products {

    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Storage storage;
    private boolean isAvailable;

    public Products(String name, ProductType productType, double price, int quantity, Storage storage) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        setQuantity(quantity);
        setStorage(storage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Product must have a name");
        } else {
            this.name = name;
        }
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price cannot be negative");
        } else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        } else {
            this.quantity = quantity;
        }
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public boolean isAvailable() {
        if (quantity > 0 || storage.getStorageProducts().contains(this)) {
            isAvailable = true;
        } else {
            isAvailable = false;
        }
        return isAvailable();
    }

    public void Sell() {
        if (quantity > 0) {
            quantity--;
        } else {
            throw new RuntimeException("This product is out of stock.");
        }
    }

    public void IncreaseQuantity(int increase) {
        if (increase < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        }
        this.quantity += increase;
    }
}
