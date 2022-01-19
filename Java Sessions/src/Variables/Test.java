package Variables;

public class Test {
	// Declaration of static variables. 
    static int a = 400; 
    static int b = 500; 
 // Instance method. 
    void m1()
    { 
// Instance area. 
     System.out.println(Test.a); 
     System.out.println(Test.b); 
    } 
// Static method or main method. 
    public static void main(String[] args)
    { 
// Static area. So, we can call static variables or static methods by using the class name. 
     System.out.println(Test.a); // Test is the name of class. 
     System.out.println(Test.b); 
      Test t = new Test(); // Creating the object of class Test. 
     t.m1();
    } 

}
