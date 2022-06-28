package Final;

import java.util.ArrayList;

public class Voldemort extends Character {

    ArrayList<Integer> horcruxes = new ArrayList<>();
    ArrayList<Character> targets = new ArrayList<>();

    public Voldemort(Riddle tom) {
        super("Lord Voldemort", tom.getLocation());
        Character.getCharacters().remove(tom);
    }

    public void createHorcruxes(int howMany) {
        if (howMany <= 0) {
            throw new StoryViolationException("Wrong number.");
        } else
        for (int i = 1; i <= howMany; i++) {
            horcruxes.add(i);
        }
    }

    public void printHorcruxes() {
        if (horcruxes.isEmpty()) {
            throw new StoryViolationException("There are no horcruxes to print.");
        } else
        System.out.println("Created horcruxes:");
        for (int i = 1; i <= horcruxes.size(); i++) {
            System.out.println("\thorcrux " + i);
        }
    }

    public void target(Character character) {
        targets.add(character);
    }

    public void castSpell(Spell spell) {
        if (targets.isEmpty()) {
            throw new StoryViolationException("Select your targets.");
        } else
        for (Character victim : targets) {
            if (victim.getName() == "Harry") {
                this.setHealth(0);
                System.out.println("Harry goes LOL...");
                System.out.println("Lord Voldemort died.");
            } else {
                victim.setHealth(0);
                System.out.println(victim.getName() + " died.");
            }
        }
    }
}
