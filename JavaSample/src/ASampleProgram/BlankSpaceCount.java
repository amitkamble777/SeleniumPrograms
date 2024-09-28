package ASampleProgram;

public class BlankSpaceCount {

	public static void main(String[] args) {
	
		String input= "Amit kamble 431 811 am 1 shyam";
		int count = BlankSpaceCcount(input);
	
		System.out.println("Number of Blank Spaces:" +count);
}
	
public static int BlankSpaceCcount(String str) {
int count = 0;
	for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ' ') 
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	}



