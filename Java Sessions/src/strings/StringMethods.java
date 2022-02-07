package strings;

public class StringMethods {

	public static void main(String[] args) {
         String str="HelloWorld";
         System.out.println(str.charAt(3));
         System.out.println(str.equalsIgnoreCase("HelloWorld"));
         System.out.println(str.indexOf('W'));
         System.out.println(str.length());
         System.out.println(str.replace('o', 'O'));
         System.out.println(str.substring(4,7));
         System.out.println(str.contains("Hello"));

	}

}
