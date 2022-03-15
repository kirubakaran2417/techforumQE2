package constructors;

import java.util.Scanner;

public class addition {
	static Scanner s;
	addition(){
		System.out.println("im a constructor");
	}
	
	public static void main(String[] args) {
        Person p=new Person(s);
		addition a=new addition();
	}

}
