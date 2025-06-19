import java.util.*;

public class OTPGenerator {
    public static String generateOTP() {
        int otp = 100000 + (int)(Math.random() * 900000);
        return String.valueOf(otp);
    }

    public static boolean areUnique(String[] otps) {
        Set<String> set = new HashSet<>(Arrays.asList(otps));
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        for (String otp : otps) System.out.println(otp);
        System.out.println("All OTPs unique: " + areUnique(otps));
    }
}
