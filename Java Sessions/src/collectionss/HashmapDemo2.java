package collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapDemo2 {
public static void main(String[] args) {
	HashMap<Character, String> hmap=new HashMap<Character, String>();
	hmap.put('v', "violet");
	hmap.put('i', "indigo");
	hmap.put('b', "blue");
	hmap.put('g', "green");
	hmap.put('y', "yellow");
	hmap.put('o', "orange");
	hmap.put('r', "red");
	//Entryset is a method that is used to get view of entries of a hashmap
	Iterator<Entry<Character,String>> itr=hmap.entrySet().iterator();
	System.out.println("Iterating the entries of hashmap");
	while(itr.hasNext()) {
		Object key=itr.next();
		System.out.println(key);
	}
	//keyset is the method used to get ve of keys of hashmap
	Iterator<Character> itr2=hmap.keySet().iterator();
	System.out.println("Iterating the keys of hashmap");
	while (itr2.hasNext()) {
		Object keyview=itr2.next();
		System.out.println(keyview);
		
	}
	Iterator<String> itr3=hmap.values().iterator();
	System.out.println("Iterating the values of hashmap");
	while (itr3.hasNext()) {
		Object valueview=itr3.next();
		System.out.println(valueview);
		
	}

}
}
