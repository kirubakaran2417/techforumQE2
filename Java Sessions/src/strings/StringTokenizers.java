package strings;

import java.util.StringTokenizer;

public class StringTokenizers {

	public static void main(String[] args) {
		//welcome to java
		String a=":";
		String b="welcome : to : java";
		StringTokenizer s=new StringTokenizer(b,a);
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}

	}

}
