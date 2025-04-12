package javaPackage;
import java.util.Arrays;

public class Merge_Two_Arrays {

	public static void main(String[] args) {
		int[] a = {64,88,33,99};
	    int[] b = {62,11,92,77};
	      
	    int a1 = a.length;
	    int b1 = b.length;
	      
	    int c1 = a1 + b1;
	      
	    int[] c = new int[c1];
	      
	    for(int i=0; i<a1; i++){
	      c[i] = a[i];
	    }
	      
	    for(int i=0; i<b1; i++){
	      c[a1 + i] = b[i] ;
	    }
	      
	    System.out.println(Arrays.toString(c));
	}
}
