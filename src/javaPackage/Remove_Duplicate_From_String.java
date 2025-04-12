package javaPackage;
public class Remove_Duplicate_From_String {
	public static void main(String[] args) {
		String name = "geeksforgeeks";
		String result = "";
		for(int i=0; i<name.length(); i++) {
			String ch = "" + name.charAt(i);
			if(result.contains(ch)) {
				continue;
			}
			result = result +ch;
		}
		System.out.println(result);		
	}
}
