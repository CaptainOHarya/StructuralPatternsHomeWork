package structuralpatterns.adapterHomeWork;

/**
 * @author Leonid Zulin
 * @date 30.12.2022 23:10
 */
public class IntsCalculator implements Ints {
    protected final Calculator target;


    public IntsCalculator() {
        super();
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg1, int arg2) {
        int result = (int) target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(Calculator.Operation.SUM)
                .result();
        return result;
    }

    @Override
    public int sub(int arg1, int arg2) {
        int result = (int) target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(Calculator.Operation.SUB)
                .result();
        return result;
    }

    @Override
    public int mult(int arg1, int arg2) {
        int result = (int) target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(Calculator.Operation.MULT)
                .result();
        return result;
    }

    @Override
    public double div(int arg1, int arg2) {
        double result = target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(Calculator.Operation.DIV)
                .result();
        return result;

    }

    @Override
    public int pow(int arg1, int arg2) {
        int result = (int) target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(Calculator.Operation.POW)
                .result();
        return result;
    }

    @Override
    public double sqrt(int arg1) {
        double result = target.newFormula()
                .addOperand(arg1)
                .addOperand(1)
                .calculate(Calculator.Operation.SQRT)
                .result();
        return result;
    }

}
