public class Functions {
    private String returnVal;
    private double inputVal1;
    private double inputVal2;
    private double inputVal3;
    private double inputVal4;
    private double inputVal5;

    public void setReturnVal(String returnVal) {
        this.returnVal = returnVal;
    }
    public String getReturnVal() {
        return this.returnVal;
    }

    public void setInputVal1(double inputVal1) {
        this.inputVal1 = inputVal1;
    }
    public double getInputVal1() {
        return this.inputVal1;
    }

    public void setInputVal2(double inputVal2) {
        this.inputVal2 = inputVal2;
    }
    public double getInputVal2() {
        return this.inputVal2;
    }

    public void setInputVal3(double inputVal3) {
        this.inputVal3 = inputVal3;
    }
    public double getInputVal3() {
        return inputVal3;
    }

    public void setInputVal4(double inputVal4) {
        this.inputVal4 = inputVal4;
    }
    public double getInputVal4() {
        return inputVal4;
    }

    public void setInputVal5(double inputVal5) {
        this.inputVal5 = inputVal5;
    }
    public double getInputVal5() {
        return inputVal5;
    }


    public void AmortizationFunction() {
        double calcNum = inputVal1 * inputVal2;
        double calcParent = 1 + (inputVal1 / inputVal3);
        double exp = -(inputVal3 * inputVal4);
        double calcBracket = 1 - Math.pow(calcParent, exp);
        double calcDenominator = inputVal3 * calcBracket;
        double A = calcNum / calcDenominator;
        setReturnVal("A = " + A);
    }

    public void CAGRFunction() {
        double getFraction = inputVal1/inputVal2;
        double getExpFraction = 1/inputVal3;
        double Exponential = Math.pow(getFraction, getExpFraction);
        double ans = Exponential - 1;
        setReturnVal("The Compound Annual Growth Rate is " + ans);
    }

    public void CashFlowFunction() {
        double CashFlow = inputVal1 - inputVal2;
        setReturnVal("The Cash Flow is " + CashFlow);
    }

    public void CCEAPRFunction() {
        double i = inputVal3/365;
        double getInnermostParenthesis = Math.pow(1 + i, 30);
        double getMiddleParenthesis = (inputVal1/inputVal2) * (1 - getInnermostParenthesis);
        double getWholeParenthesis = 1 + getMiddleParenthesis;
        double getNumerator = Math.log(getWholeParenthesis);
        double getDenominator = Math.log(1 + i);
        double getProduct = -((double) 1/(double) 30);
        double N = getProduct * (getNumerator/getDenominator);
        setReturnVal("It will take " + N + " years to pay off your credit card.");
    }

    public void CCEIRFunction() {
        double getInnermostParenthesis = Math.pow(1 + inputVal3, 30);
        double getMiddleParenthesis = (inputVal1/inputVal2) * (1 - getInnermostParenthesis);
        double getWholeParenthesis = ++getMiddleParenthesis;
        double getNumerator = Math.log(getWholeParenthesis);
        double getDenominator = Math.log(1 + inputVal3);
        double getProduct = -((double) 1/(double) 30);
        double N = getProduct * (getNumerator/getDenominator);
        setReturnVal("It will take " + N + " years to pay off your credit card.");
    }

    public void CompoundInterestFunction() {
        double getParenthesis = 1 + (inputVal2/inputVal3);
        double getExponent = Math.pow(getParenthesis, inputVal3*inputVal4);
        double AmountAcc = inputVal1 * getExponent;
        setReturnVal("Amount Accumulated is " + AmountAcc);
    }

    public void GDPFunction() {
        double getAnswer = inputVal2 + inputVal1 + inputVal3 + (inputVal4 - inputVal5);
        setReturnVal("The GDP is " + getAnswer);
    }

    public void FVOAFunction() {
        double exponent = Math.pow((1 + inputVal2), inputVal3);
        double getFraction1 = exponent / inputVal2;
        double getFraction2 = 1 / inputVal2;
        double getDiff = getFraction1 - getFraction2;
        double FV = inputVal1 * getDiff;
        setReturnVal("The Future Value of an Ordinary Annuity is " + FV);
    }


    public void R72Function() {
        double ruleOf72 = 72 / inputVal1;
        setReturnVal("The rule of 72 is " + ruleOf72);
    }

    public void PFunction() {
        double getFractionOne = 1 / inputVal2;
        double getFractionTwo = 1 / (inputVal2 * Math.pow((1 + inputVal2), inputVal3));
        double getParenthesis = getFractionOne - getFractionTwo;
        double PV = inputVal1 * getParenthesis;
        setReturnVal("The Present Value is " + PV);
    }

    public void SimpleInterestFunction() {
        double SI = inputVal1 * inputVal2 * inputVal3;
        setReturnVal("Simple Interest is = " + SI);
    }

    public void LeverageRatioFunction() {
        double Numerator = inputVal1 + inputVal2;
        double LevRatio = Numerator / inputVal3;
        setReturnVal("The Leverage Ratio is " + LevRatio);
    }

    public void PhysicsConstants(int getInteger) {
        double g;
        String h;
        switch (getInteger) {
            case 0:
                g = 1.660539040 * Math.pow(10, -27);
                h = "kg";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 1:
                g = 6.022140859 * Math.pow(10, 23);
                h = "1/mol";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 2:
                g = 1.3806485 * Math.pow(10, -23);
                h = "J/K";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 3:
                g = 1.6021766208 * Math.pow(10, -19);
                h = "C";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 4:
                g = 9.648533289 * Math.pow(10, 4);
                h = "C/mol";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 5:
                g = 0.0820582;
                h = "L-atm/mol-K";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 6:
                g = 8.3144598;
                h = "J/mol-K";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 7:
                g = 5.4857990946 * Math.pow(10, -4);
                h = "amu";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 8:
                g = 9.10938356 * Math.pow(10, -31);
                h = "kg";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 9:
                g = 1.008664916;
                h = "amu";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 10:
                g = 1.674927471 * Math.pow(10, -27);
                h = "kg";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 11:
                g = 1.007276466;
                h = "amu";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 12:
                g = 1.672621898 * Math.pow(10, -27);
                h = "kg";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 13:
                g = 6.626070040 * Math.pow(10, -34);
                h = "J-s";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 14:
                g = 2.99792458 * Math.pow(10, 8);
                h = "m/s";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 15:
                g = 6.67384 * Math.pow(10, -11);
                h = "N-m^2/kg^2";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 16:
                g = (4 * Math.PI) * Math.pow(10, -7);
                h = "Wb/A-m";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 17:
                g = 8.854187817 * Math.pow(10, -12);
                h = "C^2/N-m^2";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            case 18:
                g = 8.987551787 * Math.pow(10, 9);
                h = "N-m^2/C^2";
                setReturnVal("The Value of the constant you chose is " + g + " " + h);
                break;

            default:
                System.out.println("ERROR: OPTION NOT VALID");
        }

    }
}