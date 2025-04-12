package Practice;

import java.util.Arrays;

public class demo02 {
	public static int[] addElement(int n, int arr[], int x){
	       int newarr[] = new int[n + 1];
	       for (int i = 0; i < n; i++)
	           newarr[i] = arr[i];
	
	       newarr[n] = x;
	       return newarr;
	   }

	public static void main(String[] args){
	       int arr[] = { 1, 2, 3, 4, 5};
	
	       arr = addElement(5, arr, 8);
	       System.out.println(Arrays.toString(arr));
	 }
}