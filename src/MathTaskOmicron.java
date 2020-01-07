public class MathTaskOmicron {
    private double N;

    public MathTaskOmicron(double b, double p, double i) {
        double getInnermostParenthesis = Math.pow(1 + i, 30);
        double getMiddleParenthesis = (b/p) * (1 - getInnermostParenthesis);
        double getWholeParenthesis = ++getMiddleParenthesis;
        double getNumerator = Math.log(getWholeParenthesis);
        double getDenominator = Math.log(1 + i);
        double u = 1;
        double getProduct = -u/30;
        this.N = getProduct * (getNumerator/getDenominator);
    }
    @Override
    public String toString() {
        return "It will take " + N + " years to pay off your credit card.";
    }
}
