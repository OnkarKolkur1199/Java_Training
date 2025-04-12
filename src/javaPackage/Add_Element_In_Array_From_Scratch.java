package javaPackage;
import java.util.Arrays;
import java.util.Scanner;
public class Add_Element_In_Array_From_Scratch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		//Input
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		//Output
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
