package Array;


/*
 AARRAYoUTOFBoundException is thrown when an attempt is made to access the array with an illigal index 
 
  	Index says the negative number and greater than the size of the number
  
 
 */
public class OutofBoundException {

	public static void main(String[] args) {
	
int[] array = {1, 2, 4,3,5,5,5};

int  element = array[9];

System.out.print(element);
	}

}
