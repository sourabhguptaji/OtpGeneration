import java.util.Random;

public class GenerateOTP {
	
	static char[] sendOTP(int length)
	{
		System.out.println("your otp for this transection is:");
		String numbers="0123456789";
		Random r=new Random();
		char[] otp=new char[length];
		for(int i=0;i<length;i++)
		{
			otp[i]=numbers.charAt(r.nextInt(numbers.length()));
		}
		return otp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("generate otp ............");
	System.out.println(sendOTP(4));
	}	
}

