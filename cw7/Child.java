package Final;

public class Child extends Character {

    private String name;
    private Location location;

    public Child(String name, Location location) {
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

    @Override
    public String introduce() {
        return "Hello, I am " + name;
    }
}
