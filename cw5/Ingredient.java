package PGO_12c.cw5;

public abstract class Ingredient {

    private String name;
    private int baseReagent;

    public Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
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

    public int getBaseReagent() {
        return baseReagent;
    }

    public void setBaseReagent(int baseReagent) {
        this.baseReagent = baseReagent;
    }

    public int getReagent() {
        return baseReagent;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
