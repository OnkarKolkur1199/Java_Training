package javaPackage;
public class Count_Of_Upper_Lower_Case_In_String {
	public static void main(String[] args) {
		String name = "CogNIzanT India";
		int countUpper = 0;
		int countLower = 0;		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(ch!=' ') {
				if(ch>=60 && ch<=95) {
					countUpper++;
				}
				else {
					countLower++;
				}
			}
		}
		System.out.println("upperCase count = " + countUpper);
		System.out.println("lowerCase count = " + countLower);
	}
}
