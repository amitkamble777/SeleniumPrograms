package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MTree {

	/*
	 Tree Map is Sort on the basis of key  

    Sort the order as per the alphabetical characters
    Tree map sorted order is depend on character  of key 
    
	 */
	public static void main(String[] args) {
	
		Map<String, Integer> num= new TreeMap<>();
		num.put("One", 10);
		num.put("Two", 20);
		num.put("Three", 30);
		num.put("Four", 45);
		
	    System.out.println(num);		
		num.remove("Four");
		System.out.println(num);
		
		
	}

}
