package ASampleProgram;


/*Palindrom string means measns--> MADAM, ABCBA, 12321

Non palindrom string means ---> any string-- ami sumit, delhi, agile labs pvt ltd

*/
public class Strpalindrom {

	public static void main(String[] args) {
		String str="ABCDCBA";
		String reverse=new StringBuilder(str).reverse().toString();
		
	System.out.println("Reverse String:" +reverse);
	
	if (str.equals(reverse))
	{
		System.out.println(str+ ":Is a  palindrom");
	}
	else
	{
		System.out.println(str+ "Is not a  palindrom");
	}

	}

}
