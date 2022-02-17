package collectionss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
public static void main(String[] args) {
	Set<String> days=new LinkedHashSet<String>();
   // List<String> cities = new ArrayList<String>();

	days.add("monday");
	days.add("tuesday");
	days.add("wednesday");
	days.add("thursday");
	days.add("friday");
	days.add("saturday");
	
	days.add("monday");//it will be ignored
	
	System.out.println(days);
	
	//hashset
	//treeset
	//linkedhashset

}
}
