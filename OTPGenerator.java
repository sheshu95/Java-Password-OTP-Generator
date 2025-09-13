import java.util.Random;

public class OTPGenerator {
	public static void main(String[] args) {
		int length = 4; // OTP length
		char[] otp = OTP(length);
		System.out.print("Your OTP is : ");
		System.out.println(otp); // prints characters
	}

	static char[] OTP(int len) {
		String numbers = "0123456789";
		Random rndm_method = new Random();
		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		return otp;
	}
}
