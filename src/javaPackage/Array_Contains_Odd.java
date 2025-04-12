package javaPackage;

public class Array_Contains_Odd {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7,8,9};
		for(int i:myArray) {
			if(i%2!=0) {
				System.out.println("Array contains odd number");
				break;
			}
		}
	}
}
