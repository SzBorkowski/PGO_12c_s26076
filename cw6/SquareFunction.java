package PGO_12c.cw6;

public class SquareFunction extends Function implements Fun {

    private double a;
    private double b;
    private double c;

    public SquareFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a += delta;
        c += delta;
        a += delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a -= delta;
        c -= delta;
        a -= delta;
    }

    @Override
    public double f(double x) {
        double y = a*(x*x) + b*x + c;
        return y;
    }
}
