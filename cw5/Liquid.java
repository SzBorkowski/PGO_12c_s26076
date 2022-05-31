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
        return dissolubility;
    }
}

class Water extends Liquid {

    private boolean distilated;

    @Override
    public int getReagent() {
        if (distilated == false) {
            return 0;
        }
        return 0;
    }
}

class Alcohol extends Liquid {

    private int percent;

    public void setPercent(int percent) {
        if (percent >= 0 && percent <= 100) {
            this.percent = percent;
        } else {
            throw new RuntimeException("Value must be from 0 to 100.");
        }
    }
}