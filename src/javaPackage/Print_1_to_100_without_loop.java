package javaPackage;

public class Print_1_to_100_without_loop {

	public static void main(String[] args){
        printNos(1, 15);
	}
	public static void printNos(int initial, int last){
		if (initial <= last) {
			System.out.print(initial + "\n");
			printNos(initial + 1, last);
    }
  }
}
