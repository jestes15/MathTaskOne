public class sineValueFunction {
    public sineValueFunction(int theta) {
        switch(theta) {
            case 0:
                int iClass = 0;
                while (iClass <= 90) {
                    double getValue = Math.sin(iClass * (Math.PI / 180));
                    System.out.println("The Value is of " + iClass + " is " + getValue);
                    ++iClass;
                }

                while (iClass >= 90 & iClass <= 180) {
                    double getValueG = Math.sin(iClass * (Math.PI / 180));
                    System.out.println("The Value is of " + iClass + " is " + getValueG);
                    ++iClass;
                }

                while (iClass >= 180 & iClass <= 270) {
                    double getValueH = Math.sin(iClass * (Math.PI / 180));
                    System.out.println("The Value is of " + iClass + " is " + getValueH);
                    ++iClass;
                }
                while (iClass >= 270 & iClass <= 360) {
                    double getValueH = Math.sin(iClass * (Math.PI / 180));
                    System.out.println("The Value is of " + iClass + " is " + getValueH);
                    ++iClass;
                }

            case 1:
                int intClass = 0;
                while (intClass <= 90) {
                    double getValue = Math.cos(intClass * (Math.PI / 180));
                    System.out.println("The Value is of " + intClass + " is " + getValue);
                    ++intClass;
                }

                while (intClass >= 90 & intClass <= 180) {
                    double getValueG = Math.cos(intClass * (Math.PI / 180));
                    System.out.println("The Value is of " + intClass + " is " + getValueG);
                    ++intClass;
                }

                while (intClass >= 180 & intClass <= 270) {
                    double getValueH = Math.cos(intClass * (Math.PI / 180));
                    System.out.println("The Value is of " + intClass + " is " + getValueH);
                    ++intClass;
                }
                while (intClass >= 270 & intClass <= 360) {
                    double getValueH = Math.cos(intClass * (Math.PI / 180));
                    System.out.println("The Value is of " + intClass + " is " + getValueH);
                    ++intClass;
                }
            default:
                System.out.println(1);
        }
    }
}