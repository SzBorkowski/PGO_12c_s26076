package PGO_12c.cw3;

public class Storage {

    private int deliveryTime;

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if (deliveryTime > 0) {
            this.deliveryTime = deliveryTime;
        } else {
            throw new RuntimeException("Delivery time cannot be 0");
        }
    }
}
