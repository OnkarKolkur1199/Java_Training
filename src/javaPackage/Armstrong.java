package javaPackage;
public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int initialNum = num;
		int sum = 0;
		int noOfDigits = String.valueOf(initialNum).length();
		while(num!=0) {
			int digit = num%10;
			sum = (int) (sum + Math.pow(digit, noOfDigits));
			num = num/10;
		}
		if(sum==initialNum) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
	}
}
