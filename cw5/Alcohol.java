package PGO_12c.cw5;

public class Alcohol extends Liquid {

    private int percent;

    public void setPercent(int percent) {
        if (percent >= 0 && percent <= 100) {
            this.percent = percent;
        } else {
            throw new RuntimeException("Value must be from 0 to 100.");
        }
    }
}
