import java.util.Scanner;
import java.util.Random;
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
        System.out.println("10: Expected Return Of A Portfolio");
        System.out.println("11: Credit Card Equation");
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

                MathTaskAlpha MTA = new MathTaskAlpha(r, P, n, t);
                System.out.println(MTA);
            case 2:
                System.out.println("P");
                double P1 = sc.nextDouble();
                System.out.println("r");
                double r1 = sc.nextDouble();
                System.out.println("t");
                double t1 = sc.nextDouble();

                MathTaskBeta MTB = new MathTaskBeta(P1, r1, t1);
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

                MathTaskGamma MTG = new MathTaskGamma(P2, r2, n2, t2);
                System.out.println(MTG);
            case 4:
                System.out.println("Income");
                double income = sc.nextDouble();
                System.out.println("Expense");
                double expense = sc.nextDouble();

                MathTaskDelta MTD = new MathTaskDelta(income, expense);
                System.out.println(MTD);
        }

    }
}