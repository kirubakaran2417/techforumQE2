package ExceptionHandling;

public class finallly {
public static void main(String[] args) throws ArithmeticException{
	int a=20;
	int b=0;
	try {
		int q=a/b;
		System.out.println(q);
	}
	catch (NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("denominator cannot be zero");
	}
	
	
	System.out.println("hello world");
}
}
