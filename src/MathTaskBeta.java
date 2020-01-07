public class MathTaskBeta {
    private double SI;

    public MathTaskBeta(double P, double r, double t) {
        this.SI = P * r * t;
    }
    @Override
    public String toString() {
        return "Simple Interest is = " + SI;
    }
}