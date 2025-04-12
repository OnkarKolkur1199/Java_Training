package javaPackage;
public class Peterson {
	public static void main(String[] args) {
		int num = 145;
		int initialNum = num;
		int sum = 0;
		while(num!=0) {
			int reminder = num%10;
			int fact = 1;
			for(int i=1; i<=reminder; i++) {
				fact = fact *i;
			}
			sum = sum + fact;
			num= num/10;
		}
		if(sum==initialNum) {
			System.out.println("Number is Peterson");
		}
		else {
			System.out.println("Number is not Peterson");
		}
	}
}
