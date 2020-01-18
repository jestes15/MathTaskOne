public class sineValueFunction {
    private double G;

    public sineValueFunction(double theta) {
        this.G = Math.sin(theta);
    }

    @Override
    public String toString() {
        return "" + G;
    }
}
