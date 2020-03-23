import java.util.Scanner;

public class MathTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Hyper skill test");

        int eqNum = sc.nextInt();
        switch(eqNum) {

            case 1:
                System.out.println("r");
                double r = sc.nextDouble();
                System.out.println("P");
                double P = sc.nextDouble();
                System.out.println("n");
                double n = sc.nextDouble();
                System.out.println("t");
                double t = sc.nextDouble();

                AmmortizationFunction MTA = new AmmortizationFunction(r, P, n, t);
                System.out.println(MTA);

            case 2:
                System.out.println("P");
                double P1 = sc.nextDouble();
                System.out.println("r");
                double r1 = sc.nextDouble();
                System.out.println("t");
                double t1 = sc.nextDouble();

                SimpleInterestFunction MTB = new SimpleInterestFunction(P1, r1, t1);
                System.out.println(MTB);

            case 3:
                System.out.println("P");
                double P2 = sc.nextDouble();
                System.out.println("r");
                double r2 = sc.nextDouble();
                System.out.println("n");
                double n2 = sc.nextDouble();
                System.out.println("t");
                double t2 = sc.nextDouble();

                CompoundInterestFunction MTG = new CompoundInterestFunction(P2, r2, n2, t2);
                System.out.println(MTG);

            case 4:
                System.out.println("Income");
                double income = sc.nextDouble();
                System.out.println("Expense");
                double expense = sc.nextDouble();

                CashFlowFunction MTD = new CashFlowFunction(income, expense);
                System.out.println(MTD);

            case 5:
                System.out.println("PMT");
                double PMT = sc.nextDouble();
                System.out.println("r");
                double r3 = sc.nextDouble();
                System.out.println("t");
                double t3 = sc.nextDouble();

                PVOAFunction MTE = new PVOAFunction(PMT, r3, t3);
                System.out.println(MTE);

            case 6:
                System.out.println("PMT");
                double PMT1 =sc.nextDouble();
                System.out.println("r");
                double r4 = sc.nextDouble();
                System.out.println("t4");
                double t4 = sc.nextDouble();

                FVOAFunction MTZ = new FVOAFunction(PMT1, r4, t4);
                System.out.println(MTZ);

            case 7:
                System.out.println("Ending Value");
                double EV = sc.nextDouble();
                System.out.println("Beginning Value");
                double BV = sc.nextDouble();
                System.out.println("t");
                double t5 = sc.nextDouble();

                CAGRFunction MTT = new CAGRFunction(EV, BV, t5);
                System.out.println(MTT);

            case 8:
                System.out.println("Total Liabilities");
                double TL = sc.nextDouble();
                System.out.println("Total Debts");
                double TD = sc.nextDouble();
                System.out.println("Total Income");
                double TI = sc.nextDouble();

                LeverageRatioFunction MTI = new LeverageRatioFunction(TL, TD, TI);
                System.out.println(MTI);

            case 9:
                System.out.println("r");
                double r5 = sc.nextDouble();

                R72Function MTX = new R72Function(r5);
                System.out.println(MTX);

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
                }
                if (Ans == 0) {
                    System.out.println("APR");
                    double APR = sc.nextDouble();

                    CCEAPRFunction MTP = new CCEAPRFunction(b, p, APR);
                    System.out.println(MTP);
                }

            case 11:
                System.out.println("I");
                double I = sc.nextDouble();
                System.out.println("C");
                double C = sc.nextDouble();
                System.out.println("G");
                double G = sc.nextDouble();
                System.out.println("X");
                double X = sc.nextDouble();
                System.out.println("n");
                double N = sc.nextDouble();
                ConsumptionFunction MTC = new ConsumptionFunction(I, C, G, X, N);
                System.out.println(MTC);

            case 12:
                System.out.println("Input Case Value");
                System.out.println("case 0 is a sine table");
                System.out.println("case 1 is a cosine table");

                int y = sc.nextInt();
                sineValueFunction IF = new sineValueFunction(y);
                System.out.println(IF);

            case 13:
                System.out.println("0: Atomic Mass Constant");
                System.out.println("1: Avogadro's Number");
                System.out.println("2: Boltzmann Constant");
                System.out.println("3: Electron Charge");
                System.out.println("4: Faraday Constant");
                System.out.println("5: Gas Constant");
                System.out.println("6: Mass of an Electron");
                System.out.println("7: Mass of a Neutron");
                System.out.println("8: Mass of a Proton");
                System.out.println("9: Plank Constant");
                System.out.println("10: Speed of Light in a Vacuum");

                int getInteger = sc.nextInt();
                PhysicsConstants PC = new PhysicsConstants(getInteger);
                System.out.println(PC);

            default:
                System.out.println("Joshua Estes " + "\u00a9 2020");
        }
    }
}