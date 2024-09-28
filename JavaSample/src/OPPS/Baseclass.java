package OPPS;

public class Baseclass {
	
	    // Fields
	    int field1;

	    // Constructor
	    public Baseclass(int value) {
	        this.field1 = value;
	    }

	    // Method
	    public void display() {
	        System.out.println("Value: " + field1);
	    }
	}

	// Derived class (Sub class)
	public class DerivedClass extends Baseclass {
	    // Additional field
	    int field2;

	    // Constructor
	    public DerivedClass(int value1, int value2) {
	        // Call the constructor of the base class
	        super(value1);
	        this.field2 = value2;
	    }

	    // Additional method
	    public void show() {
	        System.out.println("Value 1 from BaseClass: " + field1);
	        System.out.println("Value 2: " + field2);
	    }
	

	// Main class to test inheritance
	//public class main {
public static void main(String[] args) {
	        // Create an instance of the derived class
	      DerivedClass obj = new DerivedClass(10, 20);

	        // Call methods from both the base class and derived class
	        obj.display(); // Method from BaseClass
	        obj.show();    // Method from DerivedClass
	    }
	
}
