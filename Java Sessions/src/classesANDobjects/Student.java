package classesANDobjects;

public class Student {
//Declaration of state/properties-->variables
	//datatype variable name
	static String name;
	String name2;
	String[] team1= {"kiruba","usha","saranya","subha"};//arrays
	int age;
	int rollno;
//Declaration of constructor
	Student(){
		//constructor
	}
//Declaration of actions
	public void display() {
		//method body
	}
//Declaration of main method
	public static void main(String[] args) {
		//classname objectname--->declaring an object
		//objectname=new classname();--->creating an object
		
		Student student=new Student();
		student.name="kiruba";
		student.name2="usha";
		System.out.println(student.name+" "+student.name2);
		

	}
}
