package collectionFramework;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		// Approach 1
		int arr1[] = new int[3];
		arr1[0]=101;
		arr1[1]=201;
		arr1[2]=301;
					   
		System.out.println(arr1[0]);
		int n1 = arr1.length;
					   
		for(int i=0; i<n1; i++){
		     System.out.println(arr1[i]);
		}
		System.out.println(Arrays.toString(arr1));
		
		for(int x:arr1) {
			System.out.println(x);
		}
				
		// Approach 2
		int arr2[] = {100,200,300,400,500};
			
		System.out.println("Length of the array is " +arr2.length);
		System.out.println("Value of the 2nd index is " +arr2[1]);
				
		for(int i=0; i<arr2.length; i++){
		     System.out.println(arr2[i]);
		}
		System.out.println(Arrays.toString(arr2));
				
		for(int x:arr2) {
			System.out.println(x);
		}
	}
}
