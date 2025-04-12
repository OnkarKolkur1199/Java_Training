package Java_Variables;

public class Instance {
	
	private int age;
	private String name;
	
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Instance myData1 = new Instance();
		myData1.setAge(26);
		myData1.setName("onkar");
		System.out.println("Age is " + myData1.getAge() + " Name is " + myData1.getName());
		
		Instance myData2 = new Instance();
		myData2.setAge(25);
		myData2.setName("rushi");
		System.out.println("Age is " + myData2.getAge() + " Name is " + myData2.getName());
	}
}
