package Variables;

public class sample {
	/*local variables
	 * instance variables
	 * static variables
	 */
	static int b=65;
	int a=20;
	
	
public static void add(int c) {
	sample s =new sample();
	c=20;
	System.out.println(c+s.a+b);
	
}
public void temp() {
	b=75;
	System.out.println(b);
	System.out.println(a);
}
}
