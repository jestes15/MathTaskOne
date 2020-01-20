public class LeverageRatioFunction {
    private double LevRatio;

    public LeverageRatioFunction(double TL, double TD, double TI) {
        double Numerator = TL + TD;
        this.LevRatio = Numerator/TI;
    }
    @Override
    public String toString() {
        return "The Leverage Ratio is " + LevRatio;
    }
}