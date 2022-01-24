package constructors;

public class Person {

 
 Person( String name, int age, String city){
	 
	 
	 System.out.println(name+" "+age+" "+city);
 }
 
 public static void main(String[] args) {
	Person p1=new Person("kiruba",25,"chennai");
	Person p2=new Person("sree",35,"chennai");
}
}
