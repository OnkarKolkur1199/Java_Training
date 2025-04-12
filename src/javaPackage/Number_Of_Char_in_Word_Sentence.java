package javaPackage;
public class Number_Of_Char_in_Word_Sentence {
	public static void main(String[] args) {
		String name = "Onkar";
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
