package ASampleProgram;

public class Fibonaci {

	//Need to watch video for understanding 
	public static void main(String[] args) {
		int n=5; // Number of turns 
		int a=1, b=2;
		System.out.println("Fibonaci number is" +a+ " "+b);
		
		for(int i=2; i < n; i++)
		{
		int next=a+b;
		System.out.println("" +next);
		a=b;
		b=next;
	}
	}
}
