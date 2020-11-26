public class Functions {
    private double returnVal;
    private double inputVal1;
    private double inputVal2;
    private double inputVal3;
    private double inputVal4;

    public void setReturnVal(double returnVal) {
        this.returnVal = returnVal;
    }
    public double getReturnVal() {
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
}

class StatsFunctions {

    public String AmortizationFunction(double r, double P, double n, double t) {
        double calcNum = r * P;
        double calcParent = 1 + (r / n);
        double exp = -(n * t);
        double calcBracket = 1 - Math.pow(calcParent, exp);
        double calcDenominator = n * calcBracket;
        double A = calcNum / calcDenominator;
        return "A = " + A;
    }

    public String CAGRFunction(double EV, double BV, double t) {
        double getFraction = EV/BV;
        double getExpFraction = 1/t;
        double Exponential = Math.pow(getFraction, getExpFraction);
        double CAGR = Exponential - 1;
        return "The Compound Annual Growth Rate is " + CAGR;
    }

    public String CashFlowFunction(double income, double expense) {
        double CashFlow = income - expense;
        return "The Cash Flow is " + CashFlow;
    }

    public String CCEAPRFunction(double b, double p, double APR) {
        double i = APR/365;
        double getInnermostParenthesis = Math.pow(1 + i, 30);
        double getMiddleParenthesis = (b/p) * (1 - getInnermostParenthesis);
        double getWholeParenthesis = 1 + getMiddleParenthesis;
        double getNumerator = Math.log(getWholeParenthesis);
        double getDenominator = Math.log(1 + i);
        double u = 1;
        double getProduct = -u/30;
        double N = getProduct * (getNumerator/getDenominator);
        return "It will take " + N + " years to pay off your credit card.";
    }

    public String CCEIRFunction(double b, double p, double i) {
        double getInnermostParenthesis = Math.pow(1 + i, 30);
        double getMiddleParenthesis = (b/p) * (1 - getInnermostParenthesis);
        double getWholeParenthesis = ++getMiddleParenthesis;
        double getNumerator = Math.log(getWholeParenthesis);
        double getDenominator = Math.log(1 + i);
        double u = 1;
        double getProduct = -u/30;
        double N = getProduct * (getNumerator/getDenominator);
        return "It will take " + N + " years to pay off your credit card.";
    }

    public String CompoundInterestFunction(double P, double r, double n, double t) {
        double getParenthesis = 1 + (r/n);
        double getExponent = Math.pow(getParenthesis, n*t);
        double AmountAcc = P * getExponent;
        return "Amount Accumulated is " + AmountAcc;
    }

    public String GDPFunction(double I, double C, double G, double X, double n) {
        double getAnswer = C + I + G + (X - n);
        return "The GDP is " + getAnswer;
    }

    public String FVOAFunction(double PMT, double r, double t) {
        double exponent = Math.pow((1 + r), t);
        double getFraction1 = exponent / r;
        double getFraction2 = 1 / r;
        double getDiff = getFraction1 - getFraction2;
        double FV = PMT * getDiff;
        return "The Future Value of an Ordinary Annuity is " + FV;
    }

    public String R72Function(double r) {
        double ruleOf72 = 72 / r;
        return "The rule of 72 is " + ruleOf72;
    }

    public String PFunction(double PMT, double r, double t) {
        double getFractionOne = 1 / r;
        double getFractionTwo = 1 / (r * Math.pow((1 + r), t));
        double getParenthesis = getFractionOne - getFractionTwo;
        double PV = PMT * getParenthesis;
        return "The Present Value is " + PV;
    }

    public String SimpleInterestFunction(double P, double r, double t) {
        double SI = P * r * t;
        return "Simple Interest is = " + SI;
    }

    public String LeverageRatioFunction(double TL, double TD, double TI) {
        double Numerator = TL + TD;
        double LevRatio = Numerator / TI;
        return "The Leverage Ratio is " + LevRatio;
    }
}

class PhysicsConstants {

    public PhysicsConstants(int getInteger) {
        double g;
        String h;
        switch (getInteger) {
            case 0:
                g = 1.660539040 * Math.pow(10, -27);
                h = "kg";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 1:
                g = 6.022140859 * Math.pow(10, 23);
                h = "1/mol";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 2:
                g = 1.3806485 * Math.pow(10, -23);
                h = "J/K";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 3:
                g = 1.6021766208 * Math.pow(10, -19);
                h = "C";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 4:
                g = 9.648533289 * Math.pow(10, 4);
                h = "C/mol";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 5:
                g = 0.0820582;
                h = "L-atm/mol-K";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 6:
                g = 8.3144598;
                h = "J/mol-K";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 7:
                g = 5.4857990946 * Math.pow(10, -4);
                h = "amu";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 8:
                g = 9.10938356 * Math.pow(10, -31);
                h = "kg";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 9:
                g = 1.008664916;
                h = "amu";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 10:
                g = 1.674927471 * Math.pow(10, -27);
                h = "kg";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 11:
                g = 1.007276466;
                h = "amu";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 12:
                g = 1.672621898 * Math.pow(10, -27);
                h = "kg";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 13:
                g = 6.626070040 * Math.pow(10, -34);
                h = "J-s";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 14:
                g = 2.99792458 * Math.pow(10, 8);
                h = "m/s";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 15:
                g = 6.67384 * Math.pow(10, -11);
                h = "N-m^2/kg^2";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 16:
                g = (4 * Math.PI) * Math.pow(10, -7);
                h = "Wb/A-m";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 17:
                g = 8.854187817 * Math.pow(10, -12);
                h = "C^2/N-m^2";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            case 18:
                g = 8.987551787 * Math.pow(10, 9);
                h = "N-m^2/C^2";
                System.out.println("The Value of the constant you chose is " + g + " " + h);
                break;

            default:
                System.out.println("ERROR: OPTION NOT VALID");
        }
    }
}