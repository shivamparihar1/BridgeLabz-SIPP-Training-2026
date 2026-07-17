package corejava.gcrcodebase.methods.level3;

public class OTPGenerator {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {

                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otpArray = new int[10];

        System.out.println("Generated OTPs:");

        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        boolean unique = areOTPsUnique(otpArray);

        System.out.println("\nAre all OTPs unique? " + unique);
    }
}