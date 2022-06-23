package Final;

import java.util.ArrayList;

public class Character {

    private String name;
    private Location location;
    private static ArrayList<String> characters = new ArrayList<>();
    private int health;

    public Character(String name, Location location) {
        this.name = name;
        this.location = location;
        int health = 100;
        characters.add(name + " : " + health);
    }

    public Character() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getHealth() {
        return health;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name);
    }

    public void say(String line, Character character) {
        System.out.println(name + " to " + character.getName() + "\n" + line);
    }

    public void moveTo(Orphanage woolsOrphanage) {
        this.location = woolsOrphanage.getLocation();
    }

    public void moveTo(Location location) {
        this.location = location;
    }

    public static void MoveAllTo(Location location, Character one, Character two) {
        one.location = location;
        two.location = location;
    }

    public void doSth(String doWhat) {
        System.out.println("I am " + name + ", I am " + doWhat);
    }

    public static void status() {
        System.out.println("====Status====");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(characters.get(i));
        }
        System.out.println("==============");
    }
}
