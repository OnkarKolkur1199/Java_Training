package Practice;

import java.util.Arrays;

public class demo03 {

	public static void main(String[] args) {
		int a[] = {100,200,300,400,500};
		
		System.out.println("Length of the array is " +a.length);
		System.out.println("Value of the 2nd index is " +a[1]);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println(Arrays.toString(a));
	}
}
