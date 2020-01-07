public class MathTaskEpsilon {
    private double PV;

    public MathTaskEpsilon(double PMT, double r, double t) {
        double getFracOne = 1/r;
        double getFracTwo = 1/(r * Math.pow((1 + r), t));
        double getParenthesis = getFracOne - getFracTwo;
        this.PV = PMT * getParenthesis;
    }

    @Override
    public String toString() {
        return "The Present Value is " + PV;
    }
}