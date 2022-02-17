package collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapDemo3 {
public static void main(String[] args) {
	HashMap<Integer, String> hmap=new HashMap<Integer, String>();
	hmap.put(5, "five");
	hmap.put(10, "ten");
	hmap.put(15, "fifteen");
	hmap.put(20, "twenty");
	hmap.put(25, "twenty five");
	hmap.put(30, "thirty");
	hmap.put(35, "thirty five");
	//loop the keys using for each loop by keyset method
	for(Integer num:hmap.keySet()) {
		System.out.println("Number: "+num);
	}
	//loop the values using for each loop by values method
	for(String Words:hmap.values()) {
		
		System.out.println("words: "+Words);
	}

	//entryset
    for(Entry<Integer,String> entry:hmap.entrySet()){
    	System.out.println(entry.getKey()+" "+entry.getValue());
    }
}
}
