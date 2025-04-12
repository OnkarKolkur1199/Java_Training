package javaPackage;

public class Find_And_Add_Digits {
	public static void main(String[] args) {
		String name = "Onkar3 6Rushi Anan7d";
		int sum = 0;
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum + (ch-'0');
			}
		}
		System.out.println(sum);
	}
}
