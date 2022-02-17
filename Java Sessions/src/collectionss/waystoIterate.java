package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class waystoIterate {
public static void main(String[] args) {
	List<String> li=new ArrayList<String>();
	li.add("usha");
	li.add("jovita");
	li.add("saranya");
	li.add("sree");
	li.add("usha");
	
	//simple for loop
	System.out.println("=============>using simple for loop");
	for(int i=0;i<li.size();i++) {
		System.out.println(li.get(i));
	}
	
	//For each loop
	
	System.out.println("===============>Enhanced for loop");
	int arr[]= {1,2,3,4,5,6};
	for(int temp:arr) {
		System.out.println(temp);
	}
	
	
	System.out.println("================>iterator");
	Iterator<String> listIterator=li.iterator();
	while(listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}
	
}
}
