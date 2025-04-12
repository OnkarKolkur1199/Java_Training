package javaPackage;
import java.util.Arrays;
public class Add_Element_In_Array_to_Last_Index {
	public static void main(String[] args){
	       int arr[] = { 1, 2, 3, 4, 5, 10};
	       int n = arr.length;
	       int newNum = 8;
	       
	       int newarr[] = new int[n + 1];
	       for (int i = 0; i < n; i++)
	           newarr[i] = arr[i];
	           newarr[n] = newNum;
	       
	       System.out.println(Arrays.toString(newarr));
	 }
}
