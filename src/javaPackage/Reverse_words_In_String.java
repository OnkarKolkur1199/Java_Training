package javaPackage;

public class Reverse_words_In_String {

	public static void main(String[] args) {
		String name = "I am software engineer";
		String reverse = "";
		
		String[] parts = name.split("\\s");
		
		for(int i=parts.length-1; i>=0; i--) {
			reverse = reverse + parts[i] + " ";
		}
		
		System.out.println(reverse);
	}
}
