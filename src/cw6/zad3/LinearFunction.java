package cw6.zad3;



public class LinearFunction extends Function {

    private double a;
    private double b;

    public LinearFunction(double a, double b) {
    setA(a);
    setB(b);
    }

    @Override
    public double f(double x) {
        return a * x + b;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a += delta;
        b += delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a -= delta;
        b -= delta;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
