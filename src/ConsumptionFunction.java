public class ConsumptionFunction {
    private double getAnswer;

    public ConsumptionFunction(double I, double C, double G, double X, double n) {
        this.getAnswer = C + I + G + X*n;
    }
    @Override
    public String toString() {
        return "The GDP is " + getAnswer;
    }
}
