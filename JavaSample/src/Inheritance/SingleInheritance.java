package Inheritance;

class plant{
	
	void tree()
	{
		System.out.println("This is a mango tree");
	}
}
class fruit{
	void mango()
	{
		System.out.println("Mango is the national fruits");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
fruit abc= new  fruit();
abc.mango();
	}

}
