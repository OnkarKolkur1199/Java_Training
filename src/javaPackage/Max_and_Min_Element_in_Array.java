package javaPackage;
import java.util.Arrays;

public class Max_and_Min_Element_in_Array {

	public static void main(String[] args) {
		int[] arr = {88,33,6,4,99,23,1,54};
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Minimum element is " + arr[0]);
		System.out.println("Maximum element is " + (arr[n-1]));
	}
}
