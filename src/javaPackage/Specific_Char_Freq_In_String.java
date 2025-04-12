package javaPackage;
public class Specific_Char_Freq_In_String {
	public static void main(String[] args) {
		String name = "geeks for geeks";
		char ch = 'e';
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " is " + count);
	}
}
