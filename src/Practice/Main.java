package Practice;

public class Main {
	  
	  Main(int x, int y){
	    System.out.println("The input is " + x + " and " + y);
	  }
	  
	  Main(int x){
	    System.out.println("The input is only " + x );
	  }
	  
	  Main(){
	    System.out.println("The input is null");
	  }
	  
	  public static void main(String[] args) {
	      Main myObj1 = new Main(2,5);
	      Main myObj2 = new Main(77);
	      Main myObj3 = new Main();
	  }
}


