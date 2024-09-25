package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIteration {

	public static void main(String[] args) {
	
		List<Integer> list= new ArrayList<Integer>();
		list.add(20);
		list.add(15);
		list.add(50);
		list.add(125);
		list.add(50);
		list.add(250);
		list.add(100);
		
		System.out.println(list);
		
		
		// For iteration of array we can use this for loop
		//  ways to iterate the list 
		for(int i=0; i<list.size(); i++)

		{
			System.out.println("The Element is" +list.get(i));
		}	
		
		for (Integer elemet :list)
		{
			System.out.println("Foreach elemet is" +elemet);
		}
			
		Iterator<Integer> it= list.listIterator();
		
		while(it.hasNext())
		{
			System.out.println("Iterator" +it.next());
		}
		
		}
}
