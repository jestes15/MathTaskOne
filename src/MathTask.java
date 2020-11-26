import java.util.*;
import java.io.*;


public class MathTask {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        classBufferedWriter cBW = new classBufferedWriter();
        classWriteFile cWF = new classWriteFile();
        CreateFile FC = new CreateFile();
        Functions fRet = new Functions();
        String returnVal = null;
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
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Principle> ");
                    fRet.setInputVal2(sc.nextDouble());
                    System.out.print("Payments per period> ");
                    fRet.setInputVal3(sc.nextDouble());
                    System.out.print("Number of periods> ");
                    fRet.setInputVal4(sc.nextDouble());

                    fRet.AmortizationFunction();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "2":
                    System.out.print("Principle> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Interest rate (decimal)> ");
                    fRet.setInputVal2(sc.nextDouble());
                    System.out.print("Number of Periods> ");
                    fRet.setInputVal3(sc.nextDouble());

                    fRet.SimpleInterestFunction();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "3":
                    System.out.print("Principal> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Interest Rate> ");
                    fRet.setInputVal2(sc.nextDouble());
                    System.out.print("Compounding per Period> ");
                    fRet.setInputVal3(sc.nextDouble());
                    System.out.print("Number of Periods> ");
                    fRet.setInputVal4(sc.nextDouble());

                    fRet.CompoundInterestFunction();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "4":
                    System.out.print("Income> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Expense> ");
                    fRet.setInputVal2(sc.nextDouble());

                    fRet.CashFlowFunction();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "5":
                    System.out.print("Payment> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Interest Rate> ");
                    fRet.setInputVal2(sc.nextDouble());
                    System.out.print("number of payments> ");
                    fRet.setInputVal3(sc.nextDouble());

                    fRet.PFunction();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "6":
                    System.out.print("Payment> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Interest Rate> ");
                    fRet.setInputVal2(sc.nextDouble());
                    System.out.print("Number of Payments> ");
                    fRet.setInputVal3(sc.nextDouble());

                    fRet.FVOAFunction();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "7":
                    System.out.print("Ending Value> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Beginning Value> ");
                    fRet.setInputVal2(sc.nextDouble());
                    System.out.print("Number of Periods> ");
                    fRet.setInputVal3(sc.nextDouble());

                    fRet.CAGRFunction();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "8":
                    System.out.print("Total Liabilities> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Total Debts> ");
                    fRet.setInputVal2(sc.nextDouble());
                    System.out.print("Total Income> ");
                    fRet.setInputVal3(sc.nextDouble());

                    fRet.LeverageRatioFunction();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "9":
                    System.out.print("Interest Rate> ");
                    fRet.setInputVal1(sc.nextDouble());

                    fRet.R72Function();
                    System.out.println(fRet.getReturnVal());

                    break;

                case "10":
                    System.out.print("Balance> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Monthly Payment> ");
                    fRet.setInputVal2(sc.nextDouble());

                    System.out.print("Do you have the daily interest rate? (Yes/No): ");
                    String Ans = sc.next();

                    if (Ans.equals("Yes")) {
                        System.out.print("Interest rate> ");
                        fRet.setInputVal3(sc.nextDouble());
                        fRet.CCEIRFunction();
                    }
                    if (Ans.equals("No")) {
                        System.out.print("APR> ");
                        fRet.setInputVal3(sc.nextDouble());
                        fRet.CCEAPRFunction();
                    }
                    System.out.println(fRet.getReturnVal());

                    break;

                case "11":
                    System.out.print("Investment> ");
                    fRet.setInputVal1(sc.nextDouble());
                    System.out.print("Private Consumption> ");
                    fRet.setInputVal2(sc.nextDouble());
                    System.out.print("Government Spending> ");
                    fRet.setInputVal3(sc.nextDouble());
                    System.out.print("Exports> ");
                    fRet.setInputVal4(sc.nextDouble());
                    System.out.print("Imports> ");
                    fRet.setInputVal5(sc.nextDouble());
                    fRet.GDPFunction();
                    System.out.println(returnVal);

                    break;

                case "12":
                    System.out.println("Which table do you want?\n0 for a Sine table\n1 for a Cosine table");
                    fRet.setInputVal1(sc.nextInt());
                    sineValueFunction IF = new sineValueFunction((int)fRet.getInputVal1());
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
                    fRet.PhysicsConstants(getInteger);

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

                            FC.setGetName(getName);
                            FC.setGetDir(getDir);
                            FC.createFile();

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

                        cWF.WriteFile(getWrite, getDirectory, getNameOfFile);

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

                    String getFileName = "TrigTable";
                    String getNewDir = "\\TRIG-TABLE\\";
                    FC.setGetName(getFileName);
                    FC.setGetDir(getNewDir);
                    FC.createFile();

                    int getTable = sc.nextInt();
                    if (getTable == 0) {

                        double theta = 0;
                        do {
                            double getValue = Math.sin(theta * (Math.PI / 180));
                            String getStringValue = theta + "     " + getValue;

                            cWF.WriteFile(getStringValue, getNewDir, getFileName);
                            theta += 1;
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
                        fRet.setReturnVal(exitMSG);
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
                    String msg = "Error: value not valid";
                    fRet.setReturnVal(msg);
            }
            System.out.println(fRet.getReturnVal());
            fRet.setReturnVal(null);
        }
        while (loopVal);
    }
}