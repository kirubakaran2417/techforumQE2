package arrays;

import java.util.Scanner;

public class sample {
  /*
   * what is array?
   * why do we need that??
   * declartion of array.
   * elementtype[] arrayname;
   * arrayname[] elementtye;
   * adding elements to array
   */
	public static void main(String[] args) {
		int [] marks;
		marks=new int[6];
		
		//int [] marks2=new int[6];--->another eway to create array	
		
		marks[0]=23;
		marks[1]=35;
		marks[2]=45;
		marks[3]=65;
		marks[4]=95;
		marks[5]=55;

		int[] marks2= {23,24,26,29,27,50};
		
		System.out.println("the size of the array is "+marks.length);
		System.out.println("the size of the array is "+marks2.length);
		
		System.out.println(marks[4]);
		
		for(int i=0;i<=5;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println("");
		for(int i=1;i<=5;i=i+2) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len=s.nextInt();
		System.out.println("Enter the elements of array");
		int a[]=new int[len];
		for (int i=0;i<len;i++) {
			a[i]=s.nextInt();
		}
		arrays2 a2=new arrays2();
		a2.display(a);

	}
}
