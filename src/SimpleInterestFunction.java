public class SimpleInterestFunction {
    private double SI;

    public SimpleInterestFunction(double P, double r, double t) {
        this.SI = P * r * t;
    }
    @Override
    public String toString() {
        return "Simple Interest is = " + SI;
    }
}