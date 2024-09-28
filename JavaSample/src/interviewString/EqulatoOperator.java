package interviewString;
/*
 ==   --> this operator is used for reference comparison(address comaprison)
 Check both object points to the same memory location. 
 Check the refernce of the Oject 
 
 .equal() ---> this is used for containt comparison
We have to comparison of values in the objects
Check the  containts of the object

I used .equal() -->Because it compares two string Objects based on the content. that provides more locgical 
comparison of two string objects
 */
public class EqulatoOperator {

	public static void main(String[] args) {
		String s1= new String("Amit");
		String s2= new String("sumit");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
	}

}
