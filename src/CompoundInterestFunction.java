public class CompoundInterestFunction {
    private double AmntAcc;

    public CompoundInterestFunction(double P, double r, double n, double t) {
        double getParenthesis = 1 + (r/n);
        double getExponent = Math.pow(getParenthesis, n*t);
        this.AmntAcc = P * getExponent;
    }
    @Override
    public String toString() {
        return "Amount Accumulated is " + AmntAcc;
    }
}