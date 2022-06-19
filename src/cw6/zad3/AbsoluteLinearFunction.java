package cw6.zad3;



public class AbsoluteLinearFunction extends  LinearFunction {

    public AbsoluteLinearFunction(double a, double b) {
        super(a, b);
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        super.increaseCoefficientsBy(delta);
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        super.decreaseCoefficientsBy(delta);
    }

    @Override
    public double f(double x) {
        double y = getA() * x + getB();
        if (y < 0) {
            y *= (-1);
        }
        return y;
    }
}