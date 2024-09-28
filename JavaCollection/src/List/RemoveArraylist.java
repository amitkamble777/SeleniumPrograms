package List;

import java.util.ArrayList;
import java.util.List;

public class RemoveArraylist {

	public static void main(String[] args) {
	List<Integer> list= new ArrayList<Integer>();
	list.add(20);
	list.add(15);
	list.add(50);
	list.add(125);
	list.add(500);
	list.add(200);
	list.add(100);
	
	list.remove(2);  // This will  remove the element at index position of List 
    System.out.println(list);
    
    
    list.remove(Integer.valueOf(125)); //This will remove the value from List
    System.out.println(list);
    
   list.clear(); // This will remove all the elements from List
    System.out.println(list);
    
    

	}

}
