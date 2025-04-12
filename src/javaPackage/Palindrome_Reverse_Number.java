package javaPackage;
public class Palindrome_Reverse_Number {
	public static void main(String[] args) {
		int num = 121;
		int initialNum = num;
		int reverse = 0;
		while(num!=0) {
			reverse = reverse*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse number is " + reverse);
		if(reverse==initialNum) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
}
