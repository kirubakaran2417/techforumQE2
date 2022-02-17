package listInterface;

import java.util.ArrayList;
import java.util.List;

public class Addex2 {
public static void main(String[] args) {
	List<String> li=new ArrayList<String>();
	li.add("usha");
	li.add("jovita");
	li.add("saranya");
	li.add("sree");
	li.add("usha");
	System.out.println(li);
	
	System.out.println(li.indexOf("usha"));
	
	System.out.println(li.get(2));
}
}
