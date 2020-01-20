public class PVOAFunction {
    private double PV;

    public PVOAFunction(double PMT, double r, double t) {
        double getFractionOne = 1/r;
        double getFractionTwo = 1/(r * Math.pow((1 + r), t));
        double getParenthesis = getFractionOne - getFractionTwo;
        this.PV = PMT * getParenthesis;
    }

    @Override
    public String toString() {
        return "The Present Value is " + PV;
    }
}