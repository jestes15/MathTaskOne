import java.util.Scanner;

public class PhysicsConstants {
    private double G;
    private String H;

    public PhysicsConstants(int getInteger) {
        Scanner sc = new Scanner(System.in);

        if (getInteger == 0) {
            this.G = 1.660539040 * Math.pow(10, -27);
            this.H = "kg";
        }
        if (getInteger == 1) {
            this.G = 6.022140859 * Math.pow(10, 23);
            this.H = "molE-1";
        }
        if (getInteger == 2) {
            this.G = 1.3806485 * Math.pow(10, -23);
            this.H = "J/K";
        }
        if (getInteger == 3) {
            this.G = 1.6021766208 * Math.pow(10, -19);
            this.H = "C";
        }
        if (getInteger == 4) {
            this.G = 9.648533289 * Math.pow(10, 4);
            this.H = "C/mol";
        }
        if (getInteger == 5) {
            System.out.println("a1: Gas Constant in terms of L-atm/mol-K");
            System.out.println("a2: Gas Constant in terms of J/mol-K");
            String getChoice = sc.next();
            if (getChoice == "a1") {
                this.G = 0.0820582;
                this.H = "L-atm/mol-K";
            }
            if (getChoice == "a2") {
                this.G = 9.3144598;
                this.H = "J/mol-K";
            }
        }

    }
    public String toString() {
        return "The Value of the constant you chose is " + G + " " + H;
    }
}