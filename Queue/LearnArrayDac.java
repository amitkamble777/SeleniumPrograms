package Queue;

import java.util.ArrayDeque;

public class LearnArrayDac {
	/*
	 Add/Remove the element from Fornt side as well as  Back side 
	  We can add/Remove the element from both side Front and back of the Queue
	  
	  Used in sliding Window Type
	  All queue methods are available Here because this will implement by using Queue
	  */

	public static void main(String[] args) {
		ArrayDeque<Integer> aq= new ArrayDeque<Integer>();
		aq.offer(20);
		aq.offer(30);
		aq.offer(40); // this is a normal property
		aq.offerFirst(100);// Element eWill add the First position 
		aq.offerLast(750);
		aq.offer(90);
		System.out.println(aq);
		
		System.out.println(aq.peek());
		System.out.println(aq.peekFirst());
		System.out.println(aq.peekLast());
		
		System.out.println(aq.poll());
		System.out.println("Poll" +aq);
		
		System.out.println(aq.pollFirst());
		System.out.println("pollFirst()" +aq);
		
		System.out.println(aq.pollLast());
		System.out.println("pollLast()" +aq);
		
		
		
		
 
	}

}
