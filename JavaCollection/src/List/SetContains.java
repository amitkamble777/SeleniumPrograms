package List;

import java.util.ArrayList;
import java.util.List;

public class SetContains {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(20);
		list.add(15);
		list.add(50);
		list.add(125);
		list.add(50);
		list.add(250);
		list.add(100);
		
		list.set(3, 3000);  // This will update the value at index 2 in theList
		System.out.println(list);
		
	 // this will show the value  in list
		System.out.println(list.contains(100));  // it will display output is true or false 
		  //If  value is present it will display treu 
		// If value not in the list--> it will display false in output
	}

}
