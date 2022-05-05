package PGO_12c.cw3;

public class ShoppingCart {

    private int id=hashCode();
    private Products products;

    public double totalPrice() {
        int result = 0;

        return result;
    }

    public void totalDeliveryTime() {

    }

    public void Sell() {
        Products current = products;
        while (current.getNextProducts() != null)
        {
            current.Sell();
            current = current.getNextProducts();
        }
    }
}
