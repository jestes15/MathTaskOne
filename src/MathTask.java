import java.util.*;
import java.io.*;


public class MathTask {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StatsFunctions StatsFunction = new StatsFunctions();
        classBufferedWriter cBW = new classBufferedWriter();
        String returnVal = "";
        boolean loopVal = true;
        do {
            String eqNum = "";
            String ListMsg = "Input eq number\nexit: Process Stop\n1: Amortization\n2: Simple Interest\n" +
                    "3: Compound Interest\n4: Cash Flow\n5: Present Value of an Ordinary Annuity\n" +
                    "6: Future Value of an Ordinary Annuity\n7: Compound Annual Growth Rate\n" +
                    "8: Leverage Ratio\n9: Rule of 72\n10: Credit Card Equation\n11: Consumption" +
                    "12: Sine/Cosine Function Table\n13: Physics Constants\n14: Creates a new file within the parameters defined" +
                    "15: Appends the file stated\n16: Append table to file test\n17: Different method for case 16\n" +
                    "18: Work in progress";
            System.out.println(ListMsg);

            try {
                eqNum = sc.next();
            }
            catch (InputMismatchException e) {
                String getText = e + "";
                String getDirectory = "\\ERROR-CACHE\\";
                String getFileName = "ERROR-1";
                String exitMSG = cBW.writeBufferedWriter(getText, getDirectory, getFileName);
                System.out.println(exitMSG);
            }

            switch (eqNum) {
                case "exit":
                    loopVal = false;
                    break;

                case "1":
                    System.out.print("Interest Rate> ");
                    double r = sc.nextDouble();
                    System.out.print("Principle> ");
                    double P = sc.nextDouble();
                    System.out.print("Payments per period> ");
                    double n1 = sc.nextDouble();
                    System.out.print("Number of periods> ");
                    double t = sc.nextDouble();

                    returnVal = StatsFunction.AmortizationFunction(r, P, n1, t);
                    System.out.println(returnVal);

                    break;

                case "2":
                    System.out.print("Principle> ");
                    double P1 = sc.nextDouble();
                    System.out.print("Interest rate (decimal)> ");
                    double r1 = sc.nextDouble();
                    System.out.print("Number of Periods> ");
                    double t1 = sc.nextDouble();

                    returnVal = StatsFunction.SimpleInterestFunction(P1, r1, t1);
                    System.out.println(returnVal);

                    break;

                case "3":
                    System.out.print("Principal> ");
                    double P2 = sc.nextDouble();
                    System.out.print("Interest Rate> ");
                    double r2 = sc.nextDouble();
                    System.out.print("Compounding per Period> ");
                    double n2 = sc.nextDouble();
                    System.out.print("Number of Periods> ");
                    double t2 = sc.nextDouble();

                    returnVal = StatsFunction.CompoundInterestFunction(P2, r2, n2, t2);
                    System.out.println(returnVal);

                    break;

                case "4":
                    System.out.print("Income> ");
                    double income = sc.nextDouble();
                    System.out.print("Expense> ");
                    double expense = sc.nextDouble();

                    returnVal = StatsFunction.CashFlowFunction(income, expense);
                    System.out.println(returnVal);

                    break;

                case "5":
                    System.out.print("Payment> ");
                    double PMT = sc.nextDouble();
                    System.out.print("Interest Rate> ");
                    double r3 = sc.nextDouble();
                    System.out.print("number of payments> ");
                    double t3 = sc.nextDouble();

                    returnVal = StatsFunction.PFunction(PMT, r3, t3);
                    System.out.println(returnVal);

                    break;

                case "6":
                    System.out.print("Payment> ");
                    double PMT1 = sc.nextDouble();
                    System.out.print("Interest Rate> ");
                    double r4 = sc.nextDouble();
                    System.out.print("Number of Payments> ");
                    double t4 = sc.nextDouble();

                    returnVal = StatsFunction.FVOAFunction(PMT1, r4, t4);
                    System.out.println(returnVal);

                    break;

                case "7":
                    System.out.print("Ending Value> ");
                    double EV = sc.nextDouble();
                    System.out.print("Beginning Value> ");
                    double BV = sc.nextDouble();
                    System.out.print("Number of Periods> ");
                    double t5 = sc.nextDouble();

                    returnVal = StatsFunction.CAGRFunction(EV, BV, t5);
                    System.out.println(returnVal);

                    break;

                case "8":
                    System.out.print("Total Liabilities> ");
                    double TL = sc.nextDouble();
                    System.out.print("Total Debts> ");
                    double TD = sc.nextDouble();
                    System.out.print("Total Income> ");
                    double TI = sc.nextDouble();

                    returnVal = StatsFunction.LeverageRatioFunction(TL, TD, TI);
                    System.out.println(returnVal);

                    break;

                case "9":
                    System.out.print("Interest Rate> ");
                    double r5 = sc.nextDouble();

                    returnVal = StatsFunction.R72Function(r5);
                    System.out.println(returnVal);

                    break;

                case "10":
                    System.out.print("Balance> ");
                    double b = sc.nextDouble();
                    System.out.print("Monthly Payment> ");
                    double p = sc.nextDouble();

                    System.out.print("Do you have the daily interest rate? (Yes/No): ");
                    String Ans = sc.next();

                    if (Ans.equals("Yes")) {
                        System.out.print("Interest rate> ");
                        double i = sc.nextDouble();

                        returnVal = StatsFunction.CCEIRFunction(b, p, i);
                    }
                    if (Ans.equals("No")) {
                        System.out.print("APR> ");
                        double APR = sc.nextDouble();

                        returnVal = StatsFunction.CCEAPRFunction(b, p, APR);
                    }
                    System.out.println(returnVal);

                    break;

                case "11":
                    System.out.print("Investment> ");
                    double I = sc.nextDouble();
                    System.out.print("Private Consumption> ");
                    double C = sc.nextDouble();
                    System.out.print("Government Spending> ");
                    double G = sc.nextDouble();
                    System.out.print("Exports> ");
                    double X = sc.nextDouble();
                    System.out.print("Imports> ");
                    double N = sc.nextDouble();
                    returnVal = StatsFunction.GDPFunction(I, C, G, X, N);
                    System.out.println(returnVal);

                    break;

                case "12":
                    System.out.println("Input Case Value");
                    System.out.println("case 0 is a sine table");
                    System.out.println("case 1 is a cosine table");

                    int y1 = sc.nextInt();
                    sineValueFunction IF = new sineValueFunction(y1);
                    System.out.println(IF);

                    break;

                case "13":
                    String userMenu = "0: Atomic Mass Constant\n1: Avogadro's Number\n2: Boltzmann Constant\n" +
                            "3: Electron Charge\n4: Faraday Constant\n5: Gas Constant in L-atm/mol-K\n" +
                            "6: Gas Constant in J/mol-K\n7: Mass of an Electron in amu\n8: Mass of an Electron in kg\n" +
                            "9: Mass of a Neutron in amu\n10: Mass of a Neutron in kg\n11: Mass of a Proton in amu\n" +
                            "12: Mass of a Proton in kg\n13: Plank Constant\n14: Speed of Light in a Vacuum\n" +
                            "15: Gravitational Constant\n16: Magnetic Constant\n17: Electric Constant in terms of C^2/N-m^2\n" +
                            "18: Electric Constant in terms of N-m^2/C^2\n:::";
                    System.out.print(userMenu);

                    int getInteger = sc.nextInt();
                    PhysicsConstants PC = new PhysicsConstants(getInteger);
                    System.out.println(PC);

                    break;

                case "14":
                    int b3 = 1;

                    do {
                        int n = 0;
                        int getMax = sc.nextInt();
                        do {
                            System.out.println("Name of file");
                            String getName = sc.next();
                            System.out.println("Directory input should be in the form of \\Folder\\");
                            String getDir = sc.next();

                            CreateFile CF = new CreateFile(getName, getDir);
                            System.out.println(CF);
                            n++;
                        } while (n <= getMax);
                        b3++;
                    } while (b3 < 70);
                    break;

                case "15":
                    int bc;
                    bc = 0;

                    do {
                        System.out.print("Name of file");
                        String getNameOfFile = sc.next();
                        System.out.print("Directory input should be in the form of \\Folder\\");
                        String getDirectory = sc.next();
                        System.out.print("Input text to be appended to file");
                        String getWrite = br.readLine();

                        System.out.println(getWrite);

                        WriteFile RF = new WriteFile(getWrite, getDirectory, getNameOfFile);
                        System.out.println(RF);

                        System.out.print("Do you want to do another? (y/n)");
                        String finish = sc.next();
                        if (finish.equals("y")) {
                            bc = 1;
                        }else {
                            bc += 3;
                        }
                    } while (bc < 3);

                    break;

                case "16":

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

                            WriteFile WF = new WriteFile(getStringValue, getNewDir, getFileName);
                            System.out.println(WF);

                            theta += 1;
                            System.out.println(theta);
                        }
                        while (theta < 360);
                    }
                    break;

                case "17":

                    int a = 0;
                    do {
                        String getText = sc.next();
                        String getDirectory = "\\TRIG-TABLE\\";
                        String getFile = "TrigTable";
                        String exitMSG = cBW.writeBufferedWriter(getText, getDirectory, getFile);
                        System.out.println(exitMSG);

                        System.out.println("Give value for a");
                        a++;
                    }
                    while (a < 10);

                    break;

                case "18":
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