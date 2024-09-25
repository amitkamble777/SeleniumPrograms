package ArrayLisst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinArraylist {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList();
		list.add(25);
		list.add(500);
		list.add(39);
		list.add(150); //This willadd 4 at the end of the Array list
		list.add(25);
		list.add(190);
		list.add(25);
		list.add(500);
		
		System.out.println(list);
		System.out.println("Minimum Value in Array:" + Collections.min(list));
		
		System.out.println("Maximum Value in Array:" + Collections.max(list));
		
		System.out.println("Maximum Value in Array:" + Collections.frequency(list, 25));  // Repetation of value = 25 in ArrayList
		
		Collections.sort(list);   //Assending Order
		System.out.println(list);
		
		Collections.sort(list, Comparator.reverseOrder());  //Descending order
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
