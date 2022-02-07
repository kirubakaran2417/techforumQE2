package inheritance;

public class subclass extends Superclass{
int x=70;

void display() {
	System.out.println(super.x);
	System.out.println("The value of x is "+x);
}
}
