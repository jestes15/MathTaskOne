import java.util.Scanner;

public class PhysicsConstants {
    private double G;

    public PhysicsConstants(int k) {
        Scanner sc = new Scanner(System.in);
        if (k == 1) {
            System.out.println("input boolean value");
            boolean I = sc.nextBoolean();
            System.out.println("input second boolean value");
            boolean A = sc.nextBoolean();
            System.out.println("input value for action taken upon booleans");
            int i = sc.nextInt();
            boolean F = true;

            if (i == 1) {
                boolean U = sc.nextBoolean();
                System.out.println(U);
            }
        }
    }
    public String toString() {
        return "The boolean value is " + G;
    }
}