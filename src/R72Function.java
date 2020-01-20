public class R72Function {
    private double ruleOf72;

    public R72Function(double r) {
        this.ruleOf72 = 72/r;
    }
    @Override
    public String toString() {
        return "The rule of 72 is " + ruleOf72;
    }
}