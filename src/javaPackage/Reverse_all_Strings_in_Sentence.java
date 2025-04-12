package javaPackage;

public class Reverse_all_Strings_in_Sentence {

	public static void main(String[] args) {
		String name = "Onkar Mallinath Kolkur";
		String result = "";
		
		String[] words = name.split("\\s");
		
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			String reverse = "";
			for(int j=word.length()-1; j>=0; j--) {
				reverse = reverse + word.charAt(j);
			}
			result = result + reverse + " ";
		}
		System.out.println(result);
	}
}
