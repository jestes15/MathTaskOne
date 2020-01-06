public class MathTaskDelta {
    private double  CashFlow;

    public MathTaskDelta (double income, double expense) {
        this.CashFlow = income - expense;
    }
    @Override
    public String toString() {
        return "The Cash Flow is " + CashFlow;
    }
}
