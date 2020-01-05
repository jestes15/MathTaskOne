public class MathTaskAlpha {
    private double A;

    public MathTaskAlpha(double r, double P, double n, double t) {
        double calcNum = r * P;
        double calcParent = 1 + (r / n);
        double exp = -(n * t);
        double calcBracket = 1 - Math.pow(calcParent, exp);
        double calcDenom = n * calcBracket;
        double getCalc = calcNum / calcDenom;
        this.A = getCalc;
    }

    @Override
    public String toString() { return "A = " + A; }
}