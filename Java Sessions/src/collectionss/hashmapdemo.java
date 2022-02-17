package collectionss;

import java.util.HashMap;

public class hashmapdemo {
	public static void main(String[] args) {
		HashMap<String,Integer> hmap=new HashMap<String, Integer>();
		
		boolean isempty=hmap.isEmpty();
		System.out.println("is hashmap empty "+isempty);
		
		hmap.put("jovita", 11);
		hmap.put("usha", 22);
		hmap.put("saranya", 33);
		
		System.out.println(hmap);
		
		System.out.println(hmap.size());
		
		hmap.put(null, null);
		
		System.out.println(hmap.size());
		System.out.println(hmap);
		
		hmap.remove(null);
		
		System.out.println(hmap.size());
		System.out.println(hmap);
		
		hmap.put("usha", 44);
		
		System.out.println(hmap);
		

	}
}
