package Set;
import java.util.Set;
import java.util.TreeSet;

public class STreeSet {
	/*
	  Here order  of element will be sorted  
	  All properties will be same 
	  Inernally implement the Binary search in TreeSet
	  All operation will done in login  time  , add, remove, delte, insert, peek
	 */

	public static void main(String[] args) {
	Set<Integer> set= new TreeSet<>();
	set.add(70);
	set.add(15);
	set.add(130);
	set.add(39);
	set.add(50);
	set.add(25);
	
	System.out.println(set);
	set.remove(70);
	System.out.println(set);
	
	//set.contains(43);
	System.out.println(set.contains(39));  //Output is true, false
	
	System.out.println(set.isEmpty()); // output is showing true or false
	
	System.out.println(set.size());
	
	set.clear();   // We can remove the all existing values from set
	System.out.println(set);


	}

}
