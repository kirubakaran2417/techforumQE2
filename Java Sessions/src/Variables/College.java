package Variables;

public class College {
	// Static variable. 
	   static String collegeName = "PIET"; 
	// static method. 
	   public static void main(String[] args)
	   { 
	     System.out.println(College.collegeName); 
	// Suppose anyone changes the value of a static variable using the class name. In this case it will display changed value. 
	    College.collegeName = "RSVM"; 
	    System.out.println(College.collegeName); 
	    } 
}
