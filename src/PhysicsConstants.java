import java.util.Scanner;

public class PhysicsConstants {
    private double G;

    public PhysicsConstants(int K) {
        Scanner sc = new Scanner(System.in);
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
        if (getInteger == 0) {
            this.G = 1.660539040 * Math.pow(10, -27);
        }
        if (getInteger == 1) {
            this.G = 6.022140859 * Math.pow(10, 23);
        }
        if (getInteger == 2) {
            this.G = 1.3806485 * Math.pow(10, -23);
        }
    }

    public double toDouble() {
        return G;
    }
}