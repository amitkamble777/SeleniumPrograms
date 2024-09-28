package OPPS;
public class Animal {
	void eat()
	{
		System.out.println("Eating the FRUITS");
	}
}
class dog extends Animal{
	void bark()
	{
		System.out.println("Dog barking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	dog d = new dog ();
	d.eat();
	d.bark();
	
	}
}

