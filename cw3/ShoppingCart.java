package PGO_12c.cw3;

import java.util.ArrayList;

public class ShoppingCart {

    private int id=hashCode();
    private ArrayList<Products> shoppingCartProducts = new ArrayList<>();

    public ShoppingCart(ArrayList<Products> shoppingCartProducts) {
        setShoppingCartProducts(shoppingCartProducts);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Products> getShoppingCartProducts() {
        return shoppingCartProducts;
    }

    public void setShoppingCartProducts(ArrayList<Products> shoppingCartProducts) {
        this.shoppingCartProducts = shoppingCartProducts;
    }

    public double totalPrice() {
        int result = 0;
        for (int i = 0; i < shoppingCartProducts.size(); i++) {
            result += shoppingCartProducts.get(i).getPrice();
        }
        return result;
    }

    public void totalDeliveryTime() {
        int temp = 0;
        for (int i = 0; i < shoppingCartProducts.size(); i++) {
            if (shoppingCartProducts.get(i).getStorage().getDeliveryTime() > temp) {
                temp = shoppingCartProducts.get(i).getStorage().getDeliveryTime();
            }
        }
    }

    public void Sell() {
        for (Products i: shoppingCartProducts) {
            i.Sell();
        }
    }
}
