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

    }
    public String toString() {
        return "The Value of the constant you chose is " + G + " " + H;
    }
}