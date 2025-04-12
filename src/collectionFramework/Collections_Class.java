package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Class {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        
        Collections.sort(numbers);
        System.out.println(numbers); 
        // Output: [1, 2, 5, 8]
        
        Collections.reverse(numbers);
        System.out.println(numbers);
        // Output: [8, 5, 2, 1]
        
        Collections.swap(numbers, 1, 3);
        System.out.println(numbers);
        // Output: [8, 1, 2, 5]        
	}
}
