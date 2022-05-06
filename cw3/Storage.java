package PGO_12c.cw3;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private int deliveryTime;
    private List<Products> storageProducts=new ArrayList<>();

    public Storage(int deliveryTime, ArrayList<Products> storageProducts) {
        setDeliveryTime(deliveryTime);
        setStorageProducts(storageProducts);
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if (deliveryTime >= 0) {
            this.deliveryTime = deliveryTime;
        } else {
            throw new RuntimeException("Delivery time cannot be negative");
        }
    }

    public List<Products> getStorageProducts() {
        return storageProducts;
    }

    public void setStorageProducts(List<Products> storageProducts) {
        this.storageProducts = storageProducts;
    }
}
