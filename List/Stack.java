package List;

public class Stack {
/*
Stack --> last in First Out
 
	animal.Push--> add the element in Stack 
	 animal.peek();  --> Last element is showing in First.
	 animal.pop();  --> Last element will be remove from the Stack
	 */
	public static void main(String[] args) {
 	java.util.Stack<String> animal = new java.util.Stack<>();
 	animal.push("dog");
 	animal.push("tiger");
 	animal.push("elephant");
 	System.out.println("Stack Elements:" +animal );

 	animal.peek();
 	System.out.println(animal.peek());
 	
 	animal.pop();
 	System.out.println("stack" +animal);
 	
	}

}
