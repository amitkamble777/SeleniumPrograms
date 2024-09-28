package Map;

import java.util.HashMap;
import java.util.Map;

public class MHashMap {
/*
 Map is used to store the key Values
  Key  us --------------> United state Values
  Key  br--------------> Brazil
  Key  es--------------> spain    
  
    All keys are unique 
    
     
      num.put("One", 1);--> output={One=1, five=2, Three=3}
      
     */
	public static void main(String[] args) {
		
	Map<String, Integer> num= new HashMap<>();
	num.put("One", 1);
	num.put("Two", 3);
	num.put("Ten", 3);
	num.put("Two", 45);  // 45 it is a override in output because key is duplicate
	
	System.out.println(num);
	
	if(num.containsKey("Two"))
	{
		num.put("Four", 20);
	}
	
	num.putIfAbsent("Two", 3);
		System.out.println(num);
}

}
