package interview;

public class MethodOverload {
	/*
	 public static void main(String[] args)
	 
	  public static void main(String... args)  --> this is a var args 
	  var args are nothing but the arrays
	 
	 * 
	 */

	public static void main(String[] args) {
		 System.out.println("Standard main method");
	        // You can call the overloaded main methods from here if needed
	        main(20); 
	        main("Hello");
	        main(1, 2, 5);
	    }

	    // Overloaded main method with an int parameter
	    public static void main(int arg) {
	        System.out.println("Overloaded main method with int argument: " + arg);
	    }

	    // Overloaded main method with a String parameter
	    public static void main(String arg) {
	        System.out.println("Overloaded main method with String argument: " + arg);
	    }

	    // Overloaded main method with multiple int parameters
	    public static void main(int a, int b, int c) {
	        System.out.println("Overloaded main method with three int arguments: " + a + ", " + b + ", " + c);
	    }
	}
	

