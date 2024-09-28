package Array;

public class MIssingNumberInArray {

	public static void main(String[] args) {

int [] arr= {1,2,3,4,6};  // 2, 6, 7 number is missing
int n= arr.length+1;     //Total numbers should be n
int totalsum=n*(n+1)/2;
int arraysum=0;

for (int num : arr)
{
	arraysum += num;
}
int missingnum= totalsum - arraysum;
System.out.println("Missing Number:" +missingnum);
}
}
