package Final;

import java.util.ArrayList;

public class Character {

    private String name;
    private Location location;
    private static ArrayList<Character> characters = new ArrayList<>();
    private int health = 100;

    public Character(String name, Location location) {
        this.name = name;
        this.location = location;
        characters.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            throw new StoryViolationException("Name cannot be blank.");
        } else
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if (location == null) {
            throw new StoryViolationException("Location cannot be null.");
        } else
        this.location = location;
    }

    public static ArrayList<Character> getCharacters() {
        return characters;
    }

    public static void setCharacters(ArrayList<Character> characters) {
        Character.characters = characters;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 || health > 100) {
            throw new StoryViolationException("Invalid health value.");
        } else
        this.health = health;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name);
    }

    public void say(String line, Character character) {
        System.out.println(name + " to " + character.getName() + "\n\t" + line);
    }

    public void moveTo(Orphanage woolsOrphanage) {
        this.location = woolsOrphanage.getLocation();
    }

    public void moveTo(Location location) {
        if (location == null) {
            throw new StoryViolationException("Invalid location.");
        } else
        this.location = location;
    }

    public static void MoveAllTo(Location location, Character one, Character two) {
        if (location == null) {
            throw new StoryViolationException("Invalid location.");
        } else
        one.location = location;
        two.location = location;
    }

    public void doSth(String doWhat) {
        System.out.println("I am " + name + ", I am " + doWhat);
    }

    public static void doSth(String doWhat, Character one, Character two, Character three) {
        System.out.println("I am " + one.getName() + ", I am " + doWhat);
        System.out.println("I am " + two.getName() + ", I am " + doWhat);
        System.out.println("I am " + three.getName() + ", I am " + doWhat);
    }

    public static void status() {
        System.out.println("====Status====");
        for (Character character : characters) {
            System.out.println(character.getName() + " : " + character.getHealth());
        }
        System.out.println("==============");
    }
}