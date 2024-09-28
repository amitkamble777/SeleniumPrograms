package Array;
 class Animal1 {
void eat()
	{
		System.out.println("Eating111");
	}
}

 class Dog1 extends Animal1{
	void bark()
	{
		System.out.println("Dog is barkin11111");
	}
	

}
 
 public class TryAnimal{
	 public static void main(String[] args) {
		 Dog1 d = new Dog1 ();
		 d.eat();
		 d.bark();

		 	}
 }
