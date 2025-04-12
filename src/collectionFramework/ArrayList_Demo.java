package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		
		myList.add(100);
		myList.add("Welcome");
		myList.add(53.5);
		myList.add(true);
		myList.add(null);
		myList.add(100);
		myList.add('Z');
		myList.add(null);
		
		System.out.println(myList);
		
		myList.add(2, "New Onkar");
		System.out.println(myList);
		
		myList.set(2, "New onkar updated");
		System.out.println(myList);
		
		for(Object i:myList) {
			System.out.println("myList contains " + i);
		}
		
		for(int i=0; i<myList.size(); i++) {
			System.out.println("Index " + i +" : "+ myList.get(i));
		}
		
		System.out.println("List is empty : " + myList.isEmpty());
		
		Iterator it = myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		myList2.add(true);
		
		myList.removeAll(myList2);
		
		System.out.println(myList);
		
	}
}
