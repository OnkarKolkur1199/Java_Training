package javaPackage;

public class Longest_String_In_Array_Or_Sentence {

	public static void main(String[] args) {
		String name = "onkar hrushikesh prathamesh anand";
		String[] words = name.split("\\s");
		
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
	}
}
