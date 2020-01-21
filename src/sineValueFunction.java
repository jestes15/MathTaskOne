public class sineValueFunction {
    public sineValueFunction(int theta) {
        if (theta == 0) {
            int iClass = 0;
            while (iClass <= 90) {
                if (iClass == 0) {
                    double getValue = 0;
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                if (iClass > 0) {
                    double getValue = Math.sin(iClass * (Math.PI / 180));
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                ++iClass;
            }

            while (iClass > 90 & iClass <= 180) {
                if (iClass < 180) {
                    double getValue = Math.sin(iClass * (Math.PI / 180));
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                if (iClass == 180) {
                    double getValue = 0;
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                ++iClass;
            }

            while (iClass > 180 & iClass <= 270) {
                double getValueH = Math.sin(iClass * (Math.PI / 180));
                System.out.println("The Value of " + iClass + " is " + getValueH);

                ++iClass;
            }
            while (iClass > 270 & iClass <= 360) {
                if (iClass < 360) {
                    double getValue = Math.sin(iClass * (Math.PI / 180));
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                if (iClass == 360) {
                    double getValue = 0;
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                ++iClass;
            }
        }

        if (theta == 1) {
            int iClass = 0;
            while (iClass <= 90) {
                if (iClass < 90) {
                    double getValue = Math.cos(iClass * (Math.PI / 180));
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                if (iClass == 90) {
                    double getValue = 0;
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                ++iClass;
            }

            while (iClass > 90 & iClass <= 180) {
                double getValue = Math.cos(iClass * (Math.PI/180));
                System.out.println("The Value of " + iClass + " is " + getValue);
                ++iClass;
            }

            while (iClass > 180 & iClass <= 270) {
                if (iClass < 270) {
                    double getValue = Math.cos(iClass * (Math.PI / 180));
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                if (iClass == 270) {
                    double getValue = 0;
                    System.out.println("The Value of " + iClass + " is " + getValue);
                }
                ++iClass;
            }
            while (iClass > 270 & iClass <= 360) {
                double getValue = Math.cos(iClass * (Math.PI/180));
                System.out.println("The Value of " + iClass + " is " + getValue);
                ++iClass;
            }
        }
    }
}