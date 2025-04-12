package collectionFramework;
public class ObjectArray {
	public static void main(String[] args) {
		Object arr3[] = {"onkar",'A',26,53.5,true,};
								
		for(Object x:arr3) {
			System.out.println(x);
		}
		System.out.println("The length of the Obj array is " + arr3.length);
	}
}
