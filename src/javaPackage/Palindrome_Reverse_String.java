package javaPackage;
public class Palindrome_Reverse_String {
	public static void main(String[] args) {
		String name = "wow";
		String reverse = "";
		for(int i=name.length()-1; i>=0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reverse string = " + reverse);
		if(reverse.equals(name)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}
