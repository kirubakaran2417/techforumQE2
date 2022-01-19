package Variables;

public class Testi {
	// Declare instance variables inside the class, not inside the method, constructor, or block. 
    int a = 30; 
    int b = 40; 
//This method is called Static method. 
   public static void main(String[] args) // main method. 
   { 
//This area is called static area. So, you can access instance variables by using an object reference variable. 
//Creating an object of the class Test. 
   Testi t = new Testi(); 
   System.out.println(t.a); // Accessing instance variable using object reference variable 't'. 
   System.out.println(t.b); 
   } 
//Declaration of instance method. 
  void m1() // This method is called user-defined method. 
  { 
//This area is called instance Area. So, we can access directly instance variables without creating any object. 
    System.out.println(a); //Direct access. 
    System.out.println(b); //Direct access. 
    } 
}
