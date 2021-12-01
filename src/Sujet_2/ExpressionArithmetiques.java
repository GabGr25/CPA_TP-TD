package Sujet_2;

public abstract class ExpressionArithmetiques  {

    public abstract double eval();

    public abstract String toString();

    public boolean equals(Object obj) {
        ExpressionArithmetiques e =(ExpressionArithmetiques) obj;
        return this.eval()==eval();
    }
}