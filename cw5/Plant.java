package PGO_12c.cw5;

public class Plant extends Ingredient {

    private int toxity;

    @Override
    public int getReagent() {
        return getBaseReagent()*toxity;
    }
}

class Flower extends Plant {

    @Override
    public int getReagent() {
        return getReagent()*2;
    }
}

class Root extends Plant {

    @Override
    public int getReagent() {
        return getReagent()/2;
    }
}
