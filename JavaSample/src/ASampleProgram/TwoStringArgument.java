package ASampleProgram;

public class TwoStringArgument {

	public static void main(String[] args) {
String str1= "Amit kamble";
String str2="Amit kamble";

if(isTwoStingArgument(str1, str2))
{
	System.out.println(str1+ ":are Argument string");
}
else
{
	System.out.println(str1+ ":and" +str2+ ":Not Argument string");	

	}

}

	private static boolean isTwoStingArgument(String str1, String str2) {
		// TODO Auto-generated method stub
		return true;
	}
	}
