package Polymorphism;

public abstract class Animal {
	
	 abstract void sound() ;
	{
		System.out.println("Primary class");
	}
	
	abstract class dog extends Animal
	{
		abstract void sound();
	}
	
	
	public static void main(String[] args) {
	
Object dog;
Animal abc=new Animal(dog);
abc.sound();
	}

}
