package Final;

import java.util.ArrayList;

public class Voldemort extends Character {

    ArrayList<Integer> horcruxes = new ArrayList<>();
    public Voldemort(String name, Location location) {
        super(name, location);
    }

    public Voldemort(Riddle tom) {
        super();
    }

    public void createHorcruxes(int howMany) {
        for (int i = 1; i <= howMany; i++) {
            horcruxes.add(i);
        }
    }

    public void printHorcruxes() {
        System.out.println("Created horcruxes:");
        for (int i = 1; i <= horcruxes.size(); i++) {
            System.out.println("horcrux " + i);
        }
    }
}
