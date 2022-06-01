package PGO_12c.cw5;

class Liquid extends Ingredient {

    private int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        this.dissolubility = dissolubility;
    }

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

    public Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated = distilated;
    }

    public boolean isDistilated() {
        return distilated;
    }

    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }

    @Override
    public int getReagent() {
        if (distilated == false) {
            return super.getReagent()/2;
        } else {
            return super.getReagent();
        }
    }
}

class Alcohol extends Liquid {

    private int percent;

    public Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if (percent >= 0 && percent <= 100) {
            this.percent = percent;
        } else {
            throw new RuntimeException("Value must be from 0 to 100.");
        }
    }

    @Override
    public int getReagent() {
        if (super.getReagent() - percent >= 0) {
            return super.getReagent() - percent;
        } else {
            return 0;
        }
    }
}