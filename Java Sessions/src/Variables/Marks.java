package Variables;

public class Marks {
	// Declare the instance variable inside the class. 
    int phyMarks = 80; 
public static void main(String[] args) 
{ 
//Create the two objects of the class 'Marks'.
    Marks m1 = new Marks(); 
    Marks m2 = new Marks(); 

//Call the variables using object m1 and m2. 
    int pMarks1 = m1.phyMarks; 
    int pMarks2 = m2.phyMarks; 
    System.out.println("Marks in Physics: " +pMarks1); 
    System.out.println("Marks in Physics: " +pMarks2); 

/* If we change the value of instance variable using object reference m2, the value of object m1 variable will not change. Only the value of instance variable calling by using object m2 will change. This shows that they have their own copy of instance variable.*/ 

    m2.phyMarks=90; 
    System.out.println("After changing the value of instance variable using object m2 "); 
    System.out.println("Marks in Physics: " +m1.phyMarks); 
    System.out.println("Marks in Physics: " +m2.phyMarks); 
  } 
}
