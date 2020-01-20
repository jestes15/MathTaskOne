public class CAGRFunction {
    private double CAGR;

    public CAGRFunction(double EV, double BV, double t) {
        double getFraction = EV/BV;
        double getExpFraction = 1/t;
        double Exponential = Math.pow(getFraction, getExpFraction);
        this.CAGR = Exponential - 1;
    }
    public String toString() {
        return "The Compound Annual Growth Rate is " + CAGR;
    }
}