package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
		myMap.put(1,"Onkar");
		myMap.put(2,"Hrushikesh");
		myMap.put(3,"Anand");
		myMap.put(4,"Prathamesh");
		
		for(int i:myMap.keySet()) {
			System.out.println(i + " : " + myMap.get(i));
		}
		
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		System.out.println(myMap.entrySet());
		
		Iterator it = myMap.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("My Initial HashMap size is : " + myMap.size());
		
		myMap.remove(4);
		System.out.println("My HashMap after remove : " + myMap);

	}

}
