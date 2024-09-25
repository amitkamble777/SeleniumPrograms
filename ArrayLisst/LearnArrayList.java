package ArrayLisst;
import java.util.Arrays;

public class LearnArrayList {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int index = Arrays.binarySearch(arr, 4);
		
		System.out.println("Index of element:" +index);

}

}
