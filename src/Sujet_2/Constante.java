package Sujet_2;

public class Constante extends ExpressionsBinaires{

    private double c;

    public Constante(double c) {
        this.c = c;
    }

    @Override
    public double eval() {
        return c;
    }

    @Override
    public String toString() {
        return "La constante est :  "+c;
    }
}



