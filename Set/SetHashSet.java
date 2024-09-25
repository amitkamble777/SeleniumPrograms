package Set;

import java.util.HashSet;
import java.util.Set;

public class SetHashSet {
/*
	  We cant accept the duplicate values in Set
	 duplicate element is not allowed
	 Order is not defined in the set 
	 eg. Add the values in bag
	 Here internally genrate  the Hash
	 According to internal Hash value is generate in Set of collection 
	 all operation will done in constant time 
	 
	 */

	public static void main(String[] args) {
	Set<Integer> set= new HashSet<>();
	set.add(34);
	set.add(15);
	set.add(130);
	set.add(15);
	set.add(43);
	set.add(25);
	System.out.println(set);
	
	set.remove(98);
	System.out.println(set);
	
	//set.contains(43);
	System.out.println(set.contains(25));  //Output is true, false
	
	System.out.println(set.isEmpty()); // output is showing true or false
	
	System.out.println(set.size());
	
	set.clear();   // We can remove the all existing values from set
	System.out.println(set);
	
	
	
	}

}
