package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
	
		List<Integer> list= new ArrayList();
		list.add(1);
		list.add(200);
		list.add(3);
		list.add(4); //This willadd 4 at the end of the Array list
		
		System.out.println(list);
		list.add(2); // This will add 2 at the end of the list 
		System.out.println(list);
	
		list.add(3, 500);   //After using this command we add he element on he given Index no 3 is the index no and 500 is the value/elemet 
		System.out.println(list);
       
//we can add  the new list  in current arrray list using addAll  method 
		List<Integer> newlist= new ArrayList();
		newlist.add(200);
		newlist.add(1500);
		newlist.add(250);
		list.addAll(newlist);   //This will add all the element in list
		System.out.println(list);
		
		System.out.println(list.get(1)); // This will get values of index position 1 from ArrayList
		
       
	}

}
