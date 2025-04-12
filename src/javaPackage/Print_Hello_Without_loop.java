package javaPackage;

public class Print_Hello_Without_loop {
	static int count = 1;
	public static void printHello() {
		System.out.println("Hello onkar");
		if(count<10) {
			count++;
			printHello();
		}
	}
	public static void main(String[] args) {
		printHello();
	}

}
