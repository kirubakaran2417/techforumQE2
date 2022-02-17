package collectionss;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
public static void main(String[] args) {
	ArrayList<String> ar=new  ArrayList<String>();
	ar.add("A");
	ar.add("B");
	ar.add("C");
	ar.add("D");
	System.out.println(ar);
	Collections.reverse(ar);
	System.out.println(ar);
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(90);
	arr.add(15);
	arr.add(20);
	arr.add(90);

    System.out.println(arr.lastIndexOf(90));
	ArrayList<String> ar1=new  ArrayList<String>();
ar1.add("a");
ar1.add("b");
ar1.add("c");

ar.addAll(ar1);
System.out.println(ar);

}
}
