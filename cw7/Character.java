package Final;

public class Character {

    private String name;
    private Location location;

    public Character(String name, Location location) {
        this.name = name;
        this.location = location;
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

    public String introduce() {
        return "Hello, I am " + name;
    }

    public String say(String line, Character character) {
        return name + " to " + character + "\n" + line;
    }
}
