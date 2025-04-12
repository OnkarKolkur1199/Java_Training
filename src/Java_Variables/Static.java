package Java_Variables;

public class Static {
	  static int salary = 5000;
	  static void myStaticMethod1() {
	    System.out.println(salary + " - myStatic Method 1 from class");
	  }
	 
	  static void myStaticMethod2() {
		System.out.println(salary + " - myStatic Method 2 from class");
	  }
	 
	  public static void main(String[] args) {
		  System.out.println(salary + " - calling static variable in main method");
		  myStaticMethod1();
		  myStaticMethod2();
	  }

}
