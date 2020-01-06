public class MathTaskXi {
    private double ruleOf72;

    public MathTaskXi(double r) {
        this.ruleOf72 = 72/r;
    }
    @Override
    public String toString() {
        return "The rule of 72 is " + ruleOf72;
    }
}
