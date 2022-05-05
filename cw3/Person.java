package PGO_12c.cw3;

public class Person {

    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart shoppingcart;

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
    }

    public void MakeOrder() {
        ShoppingCart current = shoppingcart;
    }

    public void BuyByCard() {
        if (moneyOnCard < shoppingcart.totalPrice()) {
            throw new RuntimeException("Not enough money on card");
        } else {
            shoppingcart.Sell();
        }
    }

    public void BuyInCash() {
        if (moneyInCash < shoppingcart.totalPrice()) {
            throw new RuntimeException("Not enough money in cash");
        } else {
            shoppingcart.Sell();
        }
    }
}
