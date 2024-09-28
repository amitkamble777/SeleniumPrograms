package Array;

public class bubblesort {

	public static void main(String[] args) {
		int [] arr= {87,12,23,56,40,35,54,22,11,899};
		bubblesort(arr);
		System.out.println("Sorted Array");
		for (int num:arr)
		{
			System.out.println(num);
		}
}
public static void bubblesort(int[] arr) {
		int n=arr.length;
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-1; j++) {
		if(arr[j] > arr[j+1])
			//swap the arr[j] and arr[j+1]
		{
		int	temp= arr[j];
			arr[j]= arr[j+1];
			arr[j+1]=temp;
		}
		}
	}
}
}