package interviewString;

/*
 String constant pool is the memory space in heap memory specially allocated to store the String Objects 
 created using String literals 
 
 There will be no Sting objects having the same content
 
 String pool is not a special memory is allocated in Heap memory
 
 It wont save the same containt in the String pool
 String contains pool basically contains a unique values  
 
 */
public class StringConstantPool {

	public static void main(String[] args) {
		
		java.lang.String S1= "Amit"; // This will store in String Pool
		java.lang.String S2= "Amit"; // 
		java.lang.String S3= "sanju";
		
		
		String s4= new String("Agile labs");  // thsi will store in Heam memmory

	}

}
