package javaPackage;
public class Fibonacci {
	public static void main(String[] args) {
		int num = 10;
		int a = 0;
		int b = 1;
		int c = 1;
		for(int i=1; i<=num; i++) {
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
