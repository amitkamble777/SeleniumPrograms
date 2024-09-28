package ASampleProgram;

public class PrimeNumber {
	
	/*Prime number means --> Tya number la dusrya number ne divide nahi karu shakat
	ex 1, 3, 5, 7, 11
	
	*/
public static void main(String[] args) {
		int start=5, end=100;
		System.out.println("Perime bumber is") ;

		for (int num=start; num<=end; num++)
		{
			if(isPrime(num))
			{
				System.out.println( num+  " ");
			}
		}
	}
	  public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
}
}
