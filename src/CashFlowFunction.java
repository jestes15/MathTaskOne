public class CashFlowFunction {
    private double  CashFlow;

    public CashFlowFunction(double income, double expense) {
        this.CashFlow = income - expense;
    }
    @Override
    public String toString() {
        return "The Cash Flow is " + CashFlow;
    }
}