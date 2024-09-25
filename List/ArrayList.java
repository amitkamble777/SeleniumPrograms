package List;

public class ArrayList {

	public static void main(String[] args) {
//		String [] stname = new String[10];
//		
//		stname [0]="Amit";
//		// FROM index value 0 to 9 means total 10
//		stname[9]="priya";
// WE can not chnage the array size dynamically		
		
// Here we can not add more than array index stname-- it will get arrayindex outofBound Exception Error		
		
	java.util.ArrayList<String> stname = new java.util.ArrayList();	
	
	/*  First time add thevalues 
	 size= n   n= 10  firt time we add the value 
        n+n/2+1  
        
        After add any value in arraylist  internally it will incresae the sizze of arraylist
  	
	*/
	stname.add("Amit");
	
	//Automatically we can add the  values in ArrayList

	}

}
