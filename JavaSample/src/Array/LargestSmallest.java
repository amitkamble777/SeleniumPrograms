package Array;

public class LargestSmallest {

	public static void main(String[] args) {
		int [] arr= {12,45,23,22,65,32,85,42};
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]< min) arr[i]=min;
			if(arr[i]> max) max=arr[i];
		}
System.out.println("Minimum vaue: " +min );		
System.out.println("Maximum vaue: " +max );
}
}
