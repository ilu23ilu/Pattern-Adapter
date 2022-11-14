public class IntsCalculator implements Ints {
    @Override
    public int sum(int arg0, int arg1) {
        Calculator calc = new Calculator();
        double res = calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) res;
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator calc = new Calculator();
        double res = calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) res;
    }

    @Override
    public int pow(int a, int b) {
        Calculator calc = new Calculator();
        double res = calc.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int) res;
    }
}
