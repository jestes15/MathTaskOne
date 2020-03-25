public class PhysicsConstants {
    private double G;
    private String H;

    public PhysicsConstants(int getInteger) {
        if (getInteger == 0) {
            this.G = 1.660539040 * Math.pow(10, -27);
            this.H = "kg";
        }
        if (getInteger == 1) {
            this.G = 6.022140859 * Math.pow(10, 23);
            this.H = "1/mol";
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
            this.G = 0.0820582;
            this.H = "L-atm/mol-K";
        }
        if (getInteger == 6) {
            this.G = 8.3144598;
            this.H = "J/mol-K";
        }
        if (getInteger == 7) {
            this.G = 5.4857990946 * Math.pow(10, -4);
            this.H = "amu";
        }
        if (getInteger == 8) {
            this.G = 9.10938356 * Math.pow(10, -31);
            this.H = "kg";
        }
        if (getInteger == 9) {
            this.G = 1.008664916;
            this.H = "amu";
        }
        if (getInteger == 10) {
            this.G = 1.674927471 * Math.pow(10, -27);
            this.H = "kg";
        }
        if (getInteger == 11) {
            this.G = 1.007276466;
            this.H = "amu";
        }
        if (getInteger == 12) {
            this.G = 1.672621898 * Math.pow(10, -27);
            this.H = "kg";
        }
        if (getInteger == 13) {
            this.G = 6.626070040 * Math.pow(10, -34);
            this.H = "J-s";
        }
        if (getInteger == 14) {
            this.G = 2.99792458 * Math.pow(10, 8);
            this.H = "m/s";
        }
        if (getInteger == 15) {
            this.G = 6.67384 * Math.pow(10, -11);
            this.H = "N-m^2/kg^2";
        }
        if (getInteger == 16) {
            this.G = (4 * Math.PI) * Math.pow(10,-7);
            this.H = "Wb/A-m";
        }
        if (getInteger == 17) {
            this.G = 8.854187817 * Math.pow(10, -12);
            this.H = "C^2/N-m^2";
        }
        if (getInteger == 18) {
            this.G = 8.987551787 * Math.pow(10, 9);
            this.H = "N-m^2/C^2";
        }
    }
    public String toString() {
        return "The Value of the constant you chose is " + G + " " + H;
    }
}