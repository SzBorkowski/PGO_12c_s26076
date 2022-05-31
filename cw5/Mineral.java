package PGO_12c.cw5;

public class Mineral extends Ingredient {

    private int power;

    @Override
    public int getReagent() {
        return getBaseReagent()+power;
    }
}

 class Ore extends Mineral {

    private boolean metallic;

    @Override
    public int getReagent() {
        if (metallic == false) {

        } else {
            return getBaseReagent();
        }
    }
 }

 class Crystal extends Mineral {

    private int magicPower;

    @Override
     public int getReagent() {
        return getReagent()+magicPower;
    }
 }