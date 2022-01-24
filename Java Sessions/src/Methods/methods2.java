package Methods;

public class methods2 {
	public int add(int a,int b) {//here int a ,int b are called parameters
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public int sub(int a,int b) {//here int a ,int b are called parameters
		int c=a-b;
		System.out.println(c);
		return c;
	}
	public int mul(int a,int b) {//here int a ,int b are called parameters
		int c=a*b;
		System.out.println(c);
		return c;
	}
	
	public static void main(String[] args) {
		methods2 m=new methods2();
		methods2 m2=new methods2();
        m2.add(100, 25);
		m.add(25, 20);
		m.sub(30,20);
		m.mul(25,25);//here 25,25 are called arguments
	}

}
