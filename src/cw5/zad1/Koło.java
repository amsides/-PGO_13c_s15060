package cw5.zad1;

public class Koło extends Figura {

    private double promien;
    public Koło(String name, double promien)
    {
        super(name);
        setPromien(promien);
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        if(promien < 0)
        {
            throw new RuntimeException("Cannot be lower than 0");
        }
        this.promien = promien;
    }

    @Override
    public double getArea()
    {
        return Math.PI*promien*promien;
    }

    @Override
    public double getPerimeter()
    {
        return Math.PI*2*promien;
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + promien;
    }
}
