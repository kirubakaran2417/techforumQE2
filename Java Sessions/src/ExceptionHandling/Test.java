package ExceptionHandling;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two integer numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	/*
	 * try-catch block
	 * finally
	 * throw throws
	 */
	try {
		System.out.println("Before Divide");
	System.out.println(num1+"/"+num2+"="+(num1/num2));//exceptional case
	//Exception will occur
	System.out.println("After Divide");
	}
	catch(ArithmeticException e) {//exception is handled
		System.out.println("A number cannot be divided by zero");
		
	}
	catch(NullPointerException e) {//exception is handled
		System.out.println("A number cannot be divided by zero");
		
	}
	System.out.println(num1+"+"+num2+"="+(num1+num2));

	System.out.println(num1+"-"+num2+"="+(num1-num2));

	System.out.println(num1+"*"+num2+"="+(num1*num2));
   /*
    * Predefined Exceptions
    * custom exceptions
    */
	
	/*exception
	 * Runtime exception-Arithmetic,llegal argument,indexoutofbounds,nullpointer
	 * classnotfoundexception
	 * filenotfoundexception
	 * illegalaccess
	 * nosuchmethod
	 * nosuchfield
	 * 
	 */
	
}
}
