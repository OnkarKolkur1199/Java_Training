package javaPackage;
public class Vowels_Present_or_not {
	public static void main(String[] args) {
		String name = "Onkar";
		if(name.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("String contains vowels");
		}
		else {
			System.out.println("String doesn't contains vowels");
		}
	}
}
