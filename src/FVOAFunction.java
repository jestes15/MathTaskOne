public class FVOAFunction {
    private double FV;

    public FVOAFunction(double PMT, double r, double t) {
        double exponent = Math.pow((1 + r), t);
        double getFraction1 = exponent/r;
        double getFraction2 = 1/r;
        double getParenthesis = getFraction1 - getFraction2;
        this.FV = PMT * getParenthesis;
    }
    @Override
    public String toString() {
        return "The Future Value of an Ordinary Annuity is " + FV;
    }
}