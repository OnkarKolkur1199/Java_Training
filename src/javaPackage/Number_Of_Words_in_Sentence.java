package javaPackage;
public class Number_Of_Words_in_Sentence {
	public static void main(String[] args) {
		String words = "onkar kolkur";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);
	}
}

