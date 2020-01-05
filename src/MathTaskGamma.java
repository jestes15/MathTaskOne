public class MathTaskGamma {
    private double AmntAcc;

    public MathTaskGamma(double P, double r, double n, double t) {
        double getParenthesis = 1 + (r/n);
        double getExponent = Math.pow(getParenthesis, n*t);
        double A = P * getExponent;
        this.AmntAcc = A;
    }
    @Override
    public String toString() {
        return "Amount Accumulated is " + AmntAcc;
    }
}
