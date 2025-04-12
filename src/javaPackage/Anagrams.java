package javaPackage;
import java.util.Arrays;
public class Anagrams {
	public static void main(String[] args) {
		String name1 = "god";
		String name2 = "dog";
		char[] name1Arr = name1.toCharArray();
		char[] name2Arr = name2.toCharArray();
		Arrays.sort(name1Arr);
		Arrays.sort(name2Arr);
		if(Arrays.equals(name1Arr, name2Arr)) {
			System.out.println("Strings are Anagram");
		}
		else {
			System.out.println("Strings are not Anagram");
		}
	}
}
