package javaPackage;
import java.util.HashMap;

public class Character_Freq_In_String {
	public static void main(String[] args) {
		String S = "geeks for geeks";
		String s = S.replaceAll("\\s+","");
        HashMap<Character, Integer> d = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
            if (d.containsKey(ch)) {
                d.put(ch, d.get(ch) + 1);
            }
            else {
                d.put(ch, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
            if (d.get(ch)!= 0) {
                System.out.print(ch + "" + d.get(ch) + " ");
                d.put(ch, 0);
            }
        }
	}
}
