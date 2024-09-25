package Set;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {

	
	/*
	  Here  order wll be  maintain
	 */
	public static void main(String[] args) {
		Set<Integer> set= new LinkedHashSet<>();
		set.add(34);
		set.add(15);
		set.add(130);
		set.add(39);
		
		System.out.println(set);
		set.remove(15);
		System.out.println(set);
		
		//set.contains(43);
		System.out.println(set.contains(39));  //Output is true, false
		
		System.out.println(set.isEmpty()); // output is showing true or false
		
		System.out.println(set.size());
		
		set.clear();   // We can remove the all existing values from set
		System.out.println(set);


	}

}
