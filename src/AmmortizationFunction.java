public class AmmortizationFunction {
    private double A;

    public AmmortizationFunction(double r, double P, double n, double t) {
        double calcNum = r * P;
        double calcParent = 1 + (r / n);
        double exp = -(n * t);
        double calcBracket = 1 - Math.pow(calcParent, exp);
        double calcDenominator = n * calcBracket;
        this.A = calcNum / calcDenominator;
    }
    @Override
    public String toString() { return "A = " + A; }
}