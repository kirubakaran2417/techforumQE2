package strings;

public class Demo {
//string
//stringbuffer
//stringbuilder
//string tokenizer
	
	public static void main(String[] args) {
		
		String s="Avengers";//using string literal
		String s1="Avengers";
		String s2=new String("Avengers");

		//concat and + operator
//		s1=s1.concat(s);
//		s1=s1+s;
		//comparing
		/*
		 * equals
		 * ==
		 * compareto
		 */
		boolean b=s.equals(s2);
		System.out.println(b);
		boolean b1=(s==s2);
		System.out.println(b1);
		
		String s4="A";
		String s5="a";
		System.out.println(s4.compareTo(s5));
		
		
	}
}
