package constructors;

import java.util.Scanner;

public class Person {



Scanner s;
 
 Person( String name, int age, String city){
	 
	 
	 System.out.println(name+" "+age+" "+city);
 }
 public Person(Scanner s) {
		this.s = s;
	}


 
 public static void main(String[] args) {
	Person p1=new Person("kiruba",25,"chennai");
	Person p2=new Person("sree",35,"chennai");
}
}
