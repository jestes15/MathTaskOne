public class MathTaskZeta {
    private double FV;

    public MathTaskZeta(double PMT, double r, double t) {
        double exponent = Math.pow((1 + r), t);
        double getFrac1 = exponent/r;
        double getFrac2 = 1/r;
        double getParenthesis = getFrac1 - getFrac2;
        this.FV = PMT * getParenthesis;
    }
    @Override
    public String toString() {
        return "The Future Value of an Ordinary Annuity is " + FV;
    }
}
