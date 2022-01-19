package Datatypes;

public class School_NonPrimitive {
	
		// Declaration of a primitive variable. 
		   String name = "RSVM"; // Instance variable. 
		  
		public static void main(String[] args)
		{ 
		// Creating an object of the class. 
			School_NonPrimitive sc = new School_NonPrimitive(); // sc is Non-primitive data type i.e Object REFERENCE. 
		// Print the address of the memory location of an Object. 
		   System.out.println(sc); 

		// Now we cannot access instance variable directly. we call instance variable by using reference variable sc which is created above. 
		   System.out.println(sc.name); 
		  } 
}
