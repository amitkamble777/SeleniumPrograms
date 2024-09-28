package Array;
import java.util.Arrays;

public class MergeTwoArray {
public static void main(String[] args) {
	 int[] arr1 = {1, 33, 45, 23};
     int[] arr2 = {12, 35, 23, 34};
     int[] mergedArray = mergeArrays(arr1, arr2);
     System.out.println("Merged array: " + Arrays.toString(mergedArray));
 }

 public static int[] mergeArrays(int[] arr1, int[] arr2) {
     int[] mergedArray = new int[arr1.length + arr2.length];
     int i = 0, j = 0, k = 0;
     
     while (i < arr1.length && j < arr2.length) {
         if (arr1[i] < arr2[j]) {
             mergedArray[k++] = arr1[i++];
         } else {
             mergedArray[k++] = arr2[j++];
         }
     }
     
     while (i < arr1.length) {
         mergedArray[k++] = arr1[i++];
     }
     
     while (j < arr2.length) {
         mergedArray[k++] = arr2[j++];
     }
     
     return mergedArray;
 }
}
	
	
	
	
	//		int [] arr1= {1,3,5,7}; 
//		int [] arr2= {2,4,6,8};
//		int [] mergearray= mergearray(arr1,arr2);
//System.out.println("Merge Array" +Arrays.toString(mergearray));
//	}
//public static int[] mergearray(int[] arr1, int[] arr2) {
//		int [] mergearray=new int[arr1.length +arr2.length]; 
//		int i=0, j=0, k=0;
//		
//while(i < arr1.length && j < arr2.length)
//		{
//			if(arr1[i] < arr2[j])
//			{
//				mergearray[k++]=arr1[i++];
//			}
//			else
//{
//mergearray[k++]=arr2[j++];
//}	
//}
//while (i< arr1.length) {
//			mergearray[k++]=arr1[i++];
//	}
//	while (j< arr1.length) {
//			mergearray[k++]=arr1[j++];	
//		}
//		return mergearray;
//	}
//
//}
