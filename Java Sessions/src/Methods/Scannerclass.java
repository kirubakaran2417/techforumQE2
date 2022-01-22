package Methods;
import java.util.*;
public class Scannerclass {

	public static void main(String[] args) {
       //this is how we get input from user
		Scanner s=new Scanner(System.in);
		System.out.println("enter your value");
		int a=s.nextInt();
		double b=s.nextDouble();
		String c=s.next();
		char d=s.next().charAt(0);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
