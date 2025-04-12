package javaPackage;
public class Odd_Even_Num_Count_In_Array {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int countEven = 0;
		int countOdd = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		System.out.println("Count of even number is " + countEven);
		System.out.println("Count of odd number is " + countOdd);
	}
}
