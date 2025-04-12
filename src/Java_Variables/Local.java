package Java_Variables;

public class Local {

	public void myStaticMethod1() {
		  int x = 10; 
		  System.out.println("Local variable from method1 " + x); 
	  }
	  
	public void myStaticMethod2() {
		  int x = 20; 
		  System.out.println("Local variable from method2 " + x); 
	  }
	  
	public static void main(String[] args) {
		  Local myData = new Local();
		  myData.myStaticMethod1();
		  myData.myStaticMethod2();
	  }
}
