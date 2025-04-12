package javaPackage;

public class Max_Element_From_Array {

	public static void main(String[] args) {
		int[] arr = {66,22,99,3,7,98,23,4};
		int n = arr.length;
		int max = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

