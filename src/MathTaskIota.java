public class MathTaskIota {
    private double LevRatio;

    public MathTaskIota(double TL, double TD, double TI) {
        double Numerator = TL + TD;
        this.LevRatio = Numerator/TI;
    }
    @Override
    public String toString() {
        return "The Leverage Ratio is " + LevRatio;
    }
}