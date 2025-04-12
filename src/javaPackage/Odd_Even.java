package javaPackage;
public class Odd_Even {
	public static void main(String[] args) {
		int a = 12;
		int b = 224;
		int c = 64;
		
		if(a>b && a>c) {
			System.out.println("A is largest number");
		}
		else if(b>a && b>c){
			System.out.println("B is largest number");
		}
		else {
			System.out.println("C is largest number");
		}
	}
}
