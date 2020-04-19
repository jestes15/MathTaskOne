import java.util.*;
import java.io.*;

public class MathTask {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        do {
            System.out.println("Input eq number");
            System.out.println("1: Amortization");
            System.out.println("2: Simple Interest");
            System.out.println("3: Compound Interest");
            System.out.println("4: Cash Flow");
            System.out.println("5: Present Value of an Ordinary Annuity");
            System.out.println("6: Future Value of an Ordinary Annuity");
            System.out.println("7: Compound Annual Growth Rate");
            System.out.println("8: Leverage Ratio");
            System.out.println("9: Rule of 72");
            System.out.println("10: Credit Card Equation");
            System.out.println("11: Consumption");
            System.out.println("12: Sine/Cosine Function Table");
            System.out.println("13: Physics Constants");
            System.out.println("14: Creates a new file within the parameters defined");
            System.out.println("15: Appends the file stated");

            int eqNum = sc.nextInt();

            switch (eqNum) {

                case 1:
                    System.out.println("Interest Rate");
                    double r = sc.nextDouble();
                    System.out.println("Principle");
                    double P = sc.nextDouble();
                    System.out.println("Payments per period");
                    double n = sc.nextDouble();
                    System.out.println("Number of periods");
                    double t = sc.nextDouble();

                    AmortizationFunction MTA = new AmortizationFunction(r, P, n, t);
                    System.out.println(MTA);

                    a += 1;

                    break;

                case 2:
                    System.out.println("Principle");
                    double P1 = sc.nextDouble();
                    System.out.println("Interest rate (decimal)");
                    double r1 = sc.nextDouble();
                    System.out.println("Number of Periods");
                    double t1 = sc.nextDouble();

                    SimpleInterestFunction MTB = new SimpleInterestFunction(P1, r1, t1);
                    System.out.println(MTB);

                    a += 1;

                    break;

                case 3:
                    System.out.println("Principal");
                    double P2 = sc.nextDouble();
                    System.out.println("Interest Rate");
                    double r2 = sc.nextDouble();
                    System.out.println("Compounding per Period");
                    double n2 = sc.nextDouble();
                    System.out.println("Number of Periods");
                    double t2 = sc.nextDouble();

                    CompoundInterestFunction MTG = new CompoundInterestFunction(P2, r2, n2, t2);
                    System.out.println(MTG);

                    a += 1;

                    break;

                case 4:
                    System.out.println("Income");
                    double income = sc.nextDouble();
                    System.out.println("Expense");
                    double expense = sc.nextDouble();

                    CashFlowFunction MTD = new CashFlowFunction(income, expense);
                    System.out.println(MTD);

                    a += 1;

                    break;

                case 5:
                    System.out.println("Payment");
                    double PMT = sc.nextDouble();
                    System.out.println("Interest Rate");
                    double r3 = sc.nextDouble();
                    System.out.println("number of payments");
                    double t3 = sc.nextDouble();

                    PVOAFunction MTE = new PVOAFunction(PMT, r3, t3);
                    System.out.println(MTE);

                    a += 1;

                    break;

                case 6:
                    System.out.println("Payment");
                    double PMT1 = sc.nextDouble();
                    System.out.println("Interest Rate");
                    double r4 = sc.nextDouble();
                    System.out.println("Number of Payments");
                    double t4 = sc.nextDouble();

                    FVOAFunction MTZ = new FVOAFunction(PMT1, r4, t4);
                    System.out.println(MTZ);

                    a += 1;

                    break;

                case 7:
                    System.out.println("Ending Value");
                    double EV = sc.nextDouble();
                    System.out.println("Beginning Value");
                    double BV = sc.nextDouble();
                    System.out.println("Number of Periods");
                    double t5 = sc.nextDouble();

                    CAGRFunction MTT = new CAGRFunction(EV, BV, t5);
                    System.out.println(MTT);

                    a += 1;

                    break;

                case 8:
                    System.out.println("Total Liabilities");
                    double TL = sc.nextDouble();
                    System.out.println("Total Debts");
                    double TD = sc.nextDouble();
                    System.out.println("Total Income");
                    double TI = sc.nextDouble();

                    LeverageRatioFunction MTI = new LeverageRatioFunction(TL, TD, TI);
                    System.out.println(MTI);

                    a += 1;

                    break;

                case 9:
                    System.out.println("Interest Rate");
                    double r5 = sc.nextDouble();

                    R72Function MTX = new R72Function(r5);
                    System.out.println(MTX);

                    a += 1;

                    break;

                case 10:
                    System.out.println("Balance");
                    double b = sc.nextDouble();
                    System.out.println("Monthly Payment");
                    double p = sc.nextDouble();

                    System.out.println("Do you have the daily interest rate? 1 is yes 0 is no");
                    int Ans = sc.nextInt();

                    if (Ans == 1) {
                        System.out.println("Interest rate");
                        double i = sc.nextDouble();

                        CCEIRFunction MTO = new CCEIRFunction(b, p, i);
                        System.out.println(MTO);

                        a += 1;
                    }
                    if (Ans == 0) {
                        System.out.println("APR");
                        double APR = sc.nextDouble();

                        CCEAPRFunction MTP = new CCEAPRFunction(b, p, APR);
                        System.out.println(MTP);

                        a += 1;
                    }

                    break;

                case 11:
                    System.out.println("Investment");
                    double I = sc.nextDouble();
                    System.out.println("Private Consumption");
                    double C = sc.nextDouble();
                    System.out.println("Government Spending");
                    double G = sc.nextDouble();
                    System.out.println("Exports");
                    double X = sc.nextDouble();
                    System.out.println("Imports");
                    double N = sc.nextDouble();
                    GDPFunction MTC = new GDPFunction(I, C, G, X, N);
                    System.out.println(MTC);

                    a += 1;

                    break;

                case 12:
                    System.out.println("Input Case Value");
                    System.out.println("case 0 is a sine table");
                    System.out.println("case 1 is a cosine table");

                    int y = sc.nextInt();
                    sineValueFunction IF = new sineValueFunction(y);
                    System.out.println(IF);

                    break;

                case 13:
                    System.out.println("0: Atomic Mass Constant");
                    System.out.println("1: Avogadro's Number");
                    System.out.println("2: Boltzmann Constant");
                    System.out.println("3: Electron Charge");
                    System.out.println("4: Faraday Constant");
                    System.out.println("5: Gas Constant in L-atm/mol-K");
                    System.out.println("6: Gas Constant in J/mol-K");
                    System.out.println("7: Mass of an Electron in amu");
                    System.out.println("8: Mass of an Electron in kg");
                    System.out.println("9: Mass of a Neutron in amu");
                    System.out.println("10: Mass of a Neutron in kg");
                    System.out.println("11: Mass of a Proton in amu");
                    System.out.println("12: Mass of a Proton in kg");
                    System.out.println("13: Plank Constant");
                    System.out.println("14: Speed of Light in a Vacuum");
                    System.out.println("15: Gravitational Constant");
                    System.out.println("16: Magnetic Constant");
                    System.out.println("17: Electric Constant in terms of C^2/N-m^2");
                    System.out.println("18: Electr1ic Constant in terms of N-m^2/C^2");

                    int getInteger = sc.nextInt();
                    PhysicsConstants PC = new PhysicsConstants(getInteger);
                    System.out.println(PC);

                    a += 1;

                    break;

                case 14:
                    System.out.println("Name of file");
                    String getName = sc.next();
                    System.out.println("Directory input should be in the form of \\Folder\\");
                    String getDir = sc.next();

                    CreateFile CF = new CreateFile(getName, getDir);
                    System.out.println(CF);

                    a += 1;

                    break;

                case 15:
                    System.out.println("Name of file");
                    String getNameOfFile = sc.next();
                    System.out.println("Directory input should be in the form of \\Folder\\");
                    String getDirectory = sc.next();
                    System.out.println("Input text to be appended to file");
                    String getWrite = br.readLine();

                    System.out.println(getWrite);

                    WriteFile RF = new WriteFile(getWrite, getDirectory, getNameOfFile);
                    System.out.println(RF);

                    a += 1;

                    break;

                default:
                    System.out.println("No more options");

            }
        }

        while (a < 10);
    }
}
class AmortizationFunction {
    private final double A;

    public AmortizationFunction(double r, double P, double n, double t) {
        double calcNum = r * P;
        double calcParent = 1 + (r / n);
        double exp = -(n * t);
        double calcBracket = 1 - Math.pow(calcParent, exp);
        double calcDenominator = n * calcBracket;
        this.A = calcNum / calcDenominator;
    }
    @Override
    public String toString() { return "A = " + A; }
}

class CAGRFunction {
    private final double CAGR;

    public CAGRFunction(double EV, double BV, double t) {
        double getFraction = EV/BV;
        double getExpFraction = 1/t;
        double Exponential = Math.pow(getFraction, getExpFraction);
        this.CAGR = Exponential - 1;
    }
    public String toString() {
        return "The Compound Annual Growth Rate is " + CAGR;
    }
}

class CashFlowFunction {
    private final double CashFlow;

    public CashFlowFunction(double income, double expense) {
        this.CashFlow = income - expense;
    }
    @Override
    public String toString() {
        return "The Cash Flow is " + CashFlow;
    }
}

class CCEAPRFunction {
    private final double N;

    public CCEAPRFunction(double b, double p, double APR) {
        double i = APR/365;
        double getInnermostParenthesis = Math.pow(1 + i, 30);
        double getMiddleParenthesis = (b/p) * (1 - getInnermostParenthesis);
        double getWholeParenthesis = 1 + getMiddleParenthesis;
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

class CCEIRFunction {
    private final double N;

    public CCEIRFunction(double b, double p, double i) {
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

class CompoundInterestFunction {
    private final double AmntAcc;

    public CompoundInterestFunction(double P, double r, double n, double t) {
        double getParenthesis = 1 + (r/n);
        double getExponent = Math.pow(getParenthesis, n*t);
        this.AmntAcc = P * getExponent;
    }
    @Override
    public String toString() {
        return "Amount Accumulated is " + AmntAcc;
    }
}

class GDPFunction {
    private final double getAnswer;

    public GDPFunction(double I, double C, double G, double X, double n) {
        this.getAnswer = C + I + G + (X - n);
    }
    @Override
    public String toString() {
        return "The GDP is " + getAnswer;
    }
}

class FVOAFunction {
    private final double FV;

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

class LeverageRatioFunction {
    private final double LevRatio;

    public LeverageRatioFunction(double TL, double TD, double TI) {
        double Numerator = TL + TD;
        this.LevRatio = Numerator/TI;
    }
    @Override
    public String toString() {
        return "The Leverage Ratio is " + LevRatio;
    }
}

class PVOAFunction {
    private final double PV;

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

class R72Function {
    private final double ruleOf72;

    public R72Function(double r) {
        this.ruleOf72 = 72/r;
    }
    @Override
    public String toString() {
        return "The rule of 72 is " + ruleOf72;
    }
}

class SimpleInterestFunction {
    private final double SI;

    public SimpleInterestFunction(double P, double r, double t) {
        this.SI = P * r * t;
    }

    @Override
    public String toString() {
        return "Simple Interest is = " + SI;
    }
}