package Sujet_2;

public class Addition extends ExpressionsBinaires{

    private ExpressionArithmetiques op1;
    private ExpressionArithmetiques op2;

    public Addition(ExpressionArithmetiques op1, ExpressionArithmetiques op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public double eval() {
        return op1.eval()+op2.eval();
    }

    @Override
    public String toString() {
        return "Le résultat de l'addition est :  "+ op1 +" + "+ op2 ;
    }
}
