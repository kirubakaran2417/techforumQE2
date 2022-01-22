package Methods;

import java.util.Scanner;

public class Addition {

    //declaring two instane variables
	int a=10;
	int b=20;
	
	public void add() {
	
		System.out.println(a+b);
	
	}
	
	public static void main(String[] args) {
		Addition a=new Addition();
		Addition a2=new Addition();
a2.add();
		a.add();
		
	}

}
