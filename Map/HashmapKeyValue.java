package Map;

import java.util.HashMap;
import java.util.Map;

public class HashmapKeyValue {

	public static void main(String[] args) {
		Map<String, Integer> num= new HashMap<>();
		num.put("One", 10);
		num.put("Two", 20);
		num.put("Three", 30);
		num.put("Foure", 45);
		
	System.out.println(num);
	
	System.out.println(num.containsValue(30));
	System.out.println(num.isEmpty());

	
	//Map Iteration 
	for(Map.Entry<String,  Integer> e:num.entrySet())
	{
		System.out.println(e);
		
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		}
	
	for(Integer value: num.values())
	{
		System.out.println(value);
	}
	}

}
