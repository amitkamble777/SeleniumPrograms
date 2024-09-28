package Array;

/*
 Array must contain the same data types elements
 
 This is a runtime Exception 
 
This exception is thrown to indicate that an attempt has been made to store  the wrong type of 
object into an array objects



ArrayStreException -->We are rying to add an incompatible data type
If we try to add integer object into String Array 

ArrayaOutOBoundException--> Access the  array with illigal index , 
for example index value is negative or greater than the array size

*/

public class ArrayStorException {

	public static void main(String[] args) {
	
		Object x []= new emp [2];
		
		x[0]= new String("Agile labs pvt");
		}

}


class  emp{
	
}


