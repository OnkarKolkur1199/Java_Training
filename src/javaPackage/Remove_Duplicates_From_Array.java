package javaPackage;
import java.util.HashMap;
public class Remove_Duplicates_From_Array {
    public static void main(String[] args){
    	int[] arr = {1,2,8,9,3,4,5,3,4,5,5,7,2,9};
		int n= arr.length;
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(hm.get(arr[i])==null) {
				hm.put(arr[i],true);
				System.out.println(arr[i]);
			}
		}
    }
}


