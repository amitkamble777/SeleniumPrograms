package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedL {

	public static void main(String[] args) {
		List<Integer> list= new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(20); //This willadd 4 at the end of the Array list
		
		System.out.println(list);
		list.add(2); // This will add 2 at the end of the list 
		System.out.println(list);
	
		list.add(3, 15);   //After using this command we add he element on he given Index no 3 is the index no and 500 is the value/elemet 
		System.out.println(list);

	}

}
