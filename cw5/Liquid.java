package PGO_12c.cw5;

public class Liquid extends Ingredient {

    private int dissolubility;

    public void setDissolubility(int dissolubility) {
        if (dissolubility >= 0 && dissolubility <= 100) {
            this.dissolubility = dissolubility;
        } else {
            throw new RuntimeException("Value must be from 0 to 100.");
        }
    }

    @Override
    public int getReagent() {
        return 0;
    }
}