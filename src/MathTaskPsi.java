public class MathTaskPsi {
    private double N;

    public MathTaskPsi(double b, double p, double APR) {
        double i = APR/365;
        double getInnermostParenthesis = Math.pow(1 + i, 30);
        double getMiddleParenthesis = (b/p) * (1 - getInnermostParenthesis);
        double getWholeParenthesis = 1 + getMiddleParenthesis;
        double getNumerator = Math.log(getWholeParenthesis);
        double getDenominator = Math.log(1 + i);
        this.N = (-1/30) * (getNumerator/getDenominator);
    }
    @Override
    public String toString() {
        return "It will take " + N + " years to pay off your credit card.";
    }
}