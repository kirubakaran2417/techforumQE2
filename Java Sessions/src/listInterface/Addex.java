package listInterface;

import java.util.ArrayList;
import java.util.List;

public class Addex {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add(42);
	list.add(65);
	list.add(74);
	list.add(85);
	
    list.add(4,78);//adding the element in fourth position\
    
    System.out.println(list);
}
}
