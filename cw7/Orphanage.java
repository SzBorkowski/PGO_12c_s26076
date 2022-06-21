package Final;

import java.util.ArrayList;

public class Orphanage {

    private String name;
    private Location location;
    private ArrayList<Child> kids = new ArrayList<Child>();

    public Orphanage(String name, Location location) {
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

    public void addChild(Child newKid) {
        kids.add(newKid);
    }
}
