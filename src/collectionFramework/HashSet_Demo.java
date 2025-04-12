package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		HashSet mySet = new HashSet();
		
		mySet.add(100);
		mySet.add("Welcome");
		mySet.add(53.5);
		mySet.add(true);
		mySet.add(null);
		mySet.add(100);  // Duplicate not allowed
		mySet.add('Z');
		mySet.add(null);  // Duplicate not allowed
		
		System.out.println("My Initial HashSet : " + mySet);
		
		System.out.println("My Initial ArrayList size is : " + mySet.size());
		
		System.out.println("Insertion of data with index is not Possible in Set or HashSet");
		
		System.out.println("Removing data with index not Possible in Set/HashSet but can remove with name");
		
		mySet.remove(53.5);
		System.out.println("My HashSet after remove : " + mySet);
		
		System.out.println("Setting the data with index not Possible in Set/HashSet, we can only add the data");
		
		System.out.println("My HashSet is empty? : " + mySet.isEmpty());
		
		System.out.println("Reading data using for loop is not Possible in Set or HashSet");
		
		System.out.println("Reading data using for each loop or enhanced for loop : ");
		for(Object x:mySet) {
			System.out.println(x);
		}
		
		System.out.println("Reading data using Iterator : ");
		Iterator it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet mySet2 = new HashSet();
		mySet2.add(100);
		mySet2.add(true);
		
		System.out.println("My 2nd HashSet mySet2 : " + mySet2);
		
		mySet.removeAll(mySet2);
		System.out.println("My HashSet after removing collection of elements : " + mySet);
		
		mySet.clear();
		System.out.println("Cleared the mySet.........");
		System.out.println("My HashSet after clearing Set, is it empty? : " + mySet.isEmpty());
		
		System.out.println("\r\n Note : We can convert Set of element into List\n "
				+ "ArrayList al = new ArrayList(mySet) \n "
				+ "Then we can perform all operation like list for set");

	}

}
