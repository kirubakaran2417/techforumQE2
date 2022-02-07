package strings;

public class StringBuffers {


public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("hello");
	System.out.println(sb.append("java"));
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println(sb.insert(5, "world"));
	System.out.println(sb.reverse());
	System.out.println(sb.delete(5, 9));


}
}
