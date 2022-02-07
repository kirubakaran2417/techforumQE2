package inheritance;

public class inheritanceTest {

	public static void main(String[] args) {
Derivedclass d=new Derivedclass();
d.features();
d.ownfeature();


B obj=new B();
System.out.println(B.a);
System.out.println(obj.b);
obj.show();
obj.display();

A obj2=new A();
System.out.println(A.a);
System.out.println(obj2.b);
obj2.show();
obj2.display();



subclass s=new subclass();
s.display();
	}

}
