public class PhysicsConstants {

    public PhysicsConstants(int getInteger) {
        double g;
        String h;
        if (getInteger == 0) {
            g = 1.660539040 * Math.pow(10, -27);
            h = "kg";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 1) {
            g = 6.022140859 * Math.pow(10, 23);
            h = "1/mol";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 2) {
            g = 1.3806485 * Math.pow(10, -23);
            h = "J/K";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 3) {
            g = 1.6021766208 * Math.pow(10, -19);
            h = "C";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 4) {
            g = 9.648533289 * Math.pow(10, 4);
            h = "C/mol";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 5) {
            g = 0.0820582;
            h = "L-atm/mol-K";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 6) {
            g = 8.3144598;
            h = "J/mol-K";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 7) {
            g = 5.4857990946 * Math.pow(10, -4);
            h = "amu";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 8) {
            g = 9.10938356 * Math.pow(10, -31);
            h = "kg";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 9) {
            g = 1.008664916;
            h = "amu";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 10) {
            g = 1.674927471 * Math.pow(10, -27);
            h = "kg";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 11) {
            g = 1.007276466;
            h = "amu";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 12) {
            g = 1.672621898 * Math.pow(10, -27);
            h = "kg";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 13) {
            g = 6.626070040 * Math.pow(10, -34);
            h = "J-s";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 14) {
            g = 2.99792458 * Math.pow(10, 8);
            h = "m/s";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 15) {
            g = 6.67384 * Math.pow(10, -11);
            h = "N-m^2/kg^2";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 16) {
            g = (4 * Math.PI) * Math.pow(10,-7);
            h = "Wb/A-m";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 17) {
            g = 8.854187817 * Math.pow(10, -12);
            h = "C^2/N-m^2";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        if (getInteger == 18) {
            g = 8.987551787 * Math.pow(10, 9);
            h = "N-m^2/C^2";
            System.out.println("The Value of the constant you chose is " + g + " " + h);
        }
        else {
            System.out.println("ERROR : OPTION NOT VALID");
        }
    }
}