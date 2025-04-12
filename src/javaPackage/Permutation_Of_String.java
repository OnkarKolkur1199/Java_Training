package javaPackage;

public class Permutation_Of_String {
	public static void per(String curr, String rem) {
	    if (rem.length() == 0) {
	      System.out.println(curr);
	      return;
	    }
	    for (int i = 0; i < rem.length(); i++) {
	      String ros = rem.substring(0, i) + rem.substring(i + 1);
	      per(curr + rem.charAt(i), ros);
	    }
	  }

	public static void main(String[] args) {
		per("", "CTS");
	}
}
