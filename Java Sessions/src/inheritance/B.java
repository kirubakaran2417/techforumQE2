package inheritance;

public class B extends A{
	int a=110;
	int b=130;

	 void show() {
		System.out.println(super.a);
		System.out.println(super.b);
		

	}

	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}
