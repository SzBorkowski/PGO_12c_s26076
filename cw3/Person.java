package PGO_12c.cw3;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart current;
    private List<ShoppingCart>history = new ArrayList<>();

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        setName(name);
        setSurname(surname);
        setMoneyInCash(moneyInCash);
        setMoneyOnCard(moneyOnCard);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || name.isEmpty()) {
            throw new RuntimeException("Surname cannot be empty.");
        } else {
            this.surname = surname;
        }
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        if (moneyInCash < 0) {
            throw new RuntimeException("Money in cash cannot be negative.");
        } else {
            this.moneyInCash = moneyInCash;
        }
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        this.moneyOnCard = moneyOnCard;
    }

    public void MakeOrder(ArrayList<Products> i) {
        current = new ShoppingCart(i);
    }

    public void BuyByCard() {
        if (moneyOnCard < current.totalPrice()) {
            throw new RuntimeException("Not enough money on card");
        } else {
            current.Sell();
            moneyOnCard =- current.totalPrice();
            history.add(current);
        }
    }

    public void BuyInCash() {
        if (moneyInCash < current.totalPrice()) {
            throw new RuntimeException("Not enough money in cash");
        } else {
            current.Sell();
            moneyInCash =- current.totalPrice();
            history.add(current);
        }
    }
}
