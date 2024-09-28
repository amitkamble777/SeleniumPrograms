package ASampleProgram;

public class ReversString {

	public static void main(String[] args) {
		String strn= "Amit kamble";
		 String reversed= new StringBuilder(strn).reverse().toString();
		System.out.println("Reversed String :" +reversed);

	}

}
