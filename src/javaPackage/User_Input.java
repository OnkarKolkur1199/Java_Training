package javaPackage;
import java.util.Scanner;
public class User_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Number is = " + num);
		
		String name = sc.nextLine();
		System.out.println("Name is = " + name);
	}
}
