package InterviewProgram;

import java.util.Scanner;

public class ConvertTOCelsius {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Input temperature in Fahrenhite");
		
		double fahrenheit=sc.nextDouble();
		double celsius=((5*(fahrenheit-32.0))/9.0);
		System.out.println(fahrenheit + "degree is eual to" +celsius + "In celsius");

		
	}

}
