package PGO_12c.cw5;

class Plant extends Ingredient {

    private int toxity;

    public Plant(String name, int baseReagent, int toxity) {
        super(name, baseReagent);
        this.toxity = toxity;
    }

    public int getToxity() {
        return toxity;
    }

    public void setToxity(int toxity) {
        this.toxity = toxity;
    }

    @Override
    public int getReagent() {
        return getBaseReagent() * toxity;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}

class Flower extends Plant {

    public Flower(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }

    @Override
    public int getReagent() {
        return super.getReagent() * 2;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}

class Root extends Plant {

    public Root(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }

    @Override
    public int getReagent() {
        return super.getReagent() / 2;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
