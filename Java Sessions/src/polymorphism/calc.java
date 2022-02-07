package polymorphism;

public class calc {

	/*
	 * two types inn polymorphism
	 * 
	 * static(compile time) -metho overloading,constructor overloading
	 * dynamic(run time) - method overriding
	 * 
	 * binding-
	 */
	public void add(double a,int b) {
		double res=a+b;
	}
	public void add(int a,int b) {
		double res=a+b;
	}
	public static void main(String[] args) {
		calc c=new calc();
		c.add(25, 60);
		int[]numbers= {1,2,3};
		main(numbers);
	}
	public static void main(int[] k) {
		
		System.out.println("int main method");
	}
}
