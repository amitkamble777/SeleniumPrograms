package ArrayLisst;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int [] num= {10,12,3,41,25,6,97,58,9};
		Arrays.sort(num);
		
		
		Arrays.fill(num, 33); // fill 3 value all placess in the Array
		for(int i : num)
		{
			System.out.print(i + " ");
		}

		//System.out.println("Soerting Arrays" +Arrays);
		//System.out.println(num);
	}

}
