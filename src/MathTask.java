import java.util.*;
import java.io.*;


public class MathTask {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StatsFunctions StatsFunction = new StatsFunctions();
        String returnVal = "";
        boolean loopVal = true;
        do {

            String ListMsg = "Input eq number\n0: Process Stop\n1: Amortization\n2: Simple Interest\n" +
                    "3: Compound Interest\n4: Cash Flow\n5: Present Value of an Ordinary Annuity\n" +
                    "6: Future Value of an Ordinary Annuity\n7: Compound Annual Growth Rate\n" +
                    "8: Leverage Ratio\n9: Rule of 72\n10: Credit Card Equation\n11: Consumption" +
                    "12: Sine/Cosine Function Table\n13: Physics Constants\n14: Creates a new file within the parameters defined" +
                    "15: Appends the file stated\n16: Append table to file test\n17: Different method for case 16\n" +
                    "18: Work in progress";
            System.out.println(ListMsg);

            int eqNum = sc.nextInt();

            switch (eqNum) {
                case 0:
                    loopVal = false;
                    break;

                case 1:
                    System.out.println("Interest Rate");
                    double r = sc.nextDouble();
                    System.out.println("Principle");
                    double P = sc.nextDouble();
                    System.out.println("Payments per period");
                    double n1 = sc.nextDouble();
                    System.out.println("Number of periods");
                    double t = sc.nextDouble();

                    returnVal = StatsFunction.AmortizationFunction(r, P, n1, t);
                    System.out.println(returnVal);

                    break;

                case 2:
                    System.out.println("Principle");
                    double P1 = sc.nextDouble();
                    System.out.println("Interest rate (decimal)");
                    double r1 = sc.nextDouble();
                    System.out.println("Number of Periods");
                    double t1 = sc.nextDouble();

                    returnVal = StatsFunction.SimpleInterestFunction(P1, r1, t1);
                    System.out.println(returnVal);

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

                    returnVal = StatsFunction.CompoundInterestFunction(P2, r2, n2, t2);
                    System.out.println(returnVal);

                    break;

                case 4:
                    System.out.println("Income");
                    double income = sc.nextDouble();
                    System.out.println("Expense");
                    double expense = sc.nextDouble();

                    returnVal = StatsFunction.CashFlowFunction(income, expense);
                    System.out.println(returnVal);

                    break;

                case 5:
                    System.out.println("Payment");
                    double PMT = sc.nextDouble();
                    System.out.println("Interest Rate");
                    double r3 = sc.nextDouble();
                    System.out.println("number of payments");
                    double t3 = sc.nextDouble();

                    returnVal = StatsFunction.PFunction(PMT, r3, t3);
                    System.out.println(returnVal);

                    break;

                case 6:
                    System.out.println("Payment");
                    double PMT1 = sc.nextDouble();
                    System.out.println("Interest Rate");
                    double r4 = sc.nextDouble();
                    System.out.println("Number of Payments");
                    double t4 = sc.nextDouble();

                    returnVal = StatsFunction.FVOAFunction(PMT1, r4, t4);
                    System.out.println(returnVal);

                    break;

                case 7:
                    System.out.println("Ending Value");
                    double EV = sc.nextDouble();
                    System.out.println("Beginning Value");
                    double BV = sc.nextDouble();
                    System.out.println("Number of Periods");
                    double t5 = sc.nextDouble();

                    returnVal = StatsFunction.CAGRFunction(EV, BV, t5);
                    System.out.println(returnVal);

                    break;

                case 8:
                    System.out.println("Total Liabilities");
                    double TL = sc.nextDouble();
                    System.out.println("Total Debts");
                    double TD = sc.nextDouble();
                    System.out.println("Total Income");
                    double TI = sc.nextDouble();

                    returnVal = StatsFunction.LeverageRatioFunction(TL, TD, TI);
                    System.out.println(returnVal);

                    break;

                case 9:
                    System.out.println("Interest Rate");
                    double r5 = sc.nextDouble();

                    returnVal = StatsFunction.R72Function(r5);
                    System.out.println(returnVal);

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

                        returnVal = StatsFunction.CCEIRFunction(b, p, i);
                    }
                    if (Ans == 0) {
                        System.out.println("APR");
                        double APR = sc.nextDouble();

                        returnVal = StatsFunction.CCEAPRFunction(b, p, APR);
                    }
                    System.out.println(returnVal);

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
                    returnVal = StatsFunction.GDPFunction(I, C, G, X, N);
                    System.out.println(returnVal);

                    break;

                case 12:
                    System.out.println("Input Case Value");
                    System.out.println("case 0 is a sine table");
                    System.out.println("case 1 is a cosine table");

                    int y1 = sc.nextInt();
                    sineValueFunction IF = new sineValueFunction(y1);
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
                    System.out.println("18: Electric Constant in terms of N-m^2/C^2");

                    int getInteger = sc.nextInt();
                    PhysicsConstants PC = new PhysicsConstants(getInteger);
                    System.out.println(PC);

                    break;

                case 14:
                    int b3 = 1;

                    do {
                        int n = 0;
                        String getName2 = sc.next();
                        int getMax = sc.nextInt();
                        do {

                            //System.out.println("Name of file");
                            int getName = n;
                            String name = getName2 + "_" + getName;
                            //System.out.println("Directory input should be in the form of \\Folder\\");
                            //String getDir = sc.next();
                            String getDir = "\\TEST-FILES\\" + getName2 + "\\";

                            CreateFile CF = new CreateFile(name, getDir);
                            System.out.println(CF);

                            n++;

                        } while (n <= getMax);
                        b3++;
                    } while (b3 < 70);
                    break;

                case 15:
                    int bc;
                    bc = 0;

                    do {
                        System.out.println("Name of file");
                        String getNameOfFile = sc.next();
                        System.out.println("Directory input should be in the form of \\Folder\\");
                        String getDirectory = sc.next();
                        System.out.println("Input text to be appended to file");
                        String getWrite = br.readLine();

                        System.out.println(getWrite);

                        WriteFile RF = new WriteFile(getWrite, getDirectory, getNameOfFile);
                        System.out.println(RF);

                        System.out.println("Do you want to do another? y/n");
                        String finish = sc.next();
                        if (finish.equals("y")) {
                            bc = 1;
                        }else {
                            bc += 3;
                        }
                    } while (bc < 3);

                    break;

                case 16:

                    System.out.println("Name of file");
                    String getFileName = "TrigTable";

                    System.out.println("Directory input should be in the form of \\Folder\\");
                    String getNewDir = "\\TRIG-TABLE\\";

                    CreateFile FC = new CreateFile(getFileName, getNewDir);
                    System.out.println(FC);

                    int getTable = sc.nextInt();
                    if (getTable == 0) {

                        double theta = 0;
                        do {
                            double getValue = Math.sin(theta * (Math.PI / 180));
                            String getStringValue = theta + "     " + getValue;

                            //writeBufferedWriter wbr = new writeBufferedWriter(getStringValue, 361, getNewDir, getFileName);
                            //System.out.println(wbr);

                            WriteFile WF = new WriteFile(getStringValue, getNewDir, getFileName);
                            System.out.println(WF);

                            theta += 1;
                            System.out.println(theta);
                        }
                        while (theta < 360);
                    }
                    break;

                case 17:

                    int a = 0;
                    do {
                        String getText = sc.next();
                        String Directory = "\\TRIG-TABLE\\";
                        String GetFileName = "TrigTable";
                        writeBufferedWriter wBR = new writeBufferedWriter(getText, Directory, GetFileName);
                        System.out.println(wBR);

                        System.out.println("Give value for a");
                        a++;
                        //a = sc.nextInt();
                    }
                    while (a < 10);

                    break;

                case 18:
                    System.out.println("Work in progress");
                    String ne = "";
                    ne+=sc.nextLine();
                    System.out.println(ne);

                    break;

                default:
                    System.out.println("Error: value not valid");

            }
        }
        while (loopVal);
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
                System.out.println("ERROR : OPTION NOT VALID");
        }
    }
}