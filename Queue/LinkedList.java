package Queue;

import java.util.Queue;

public class LinkedList {

	/*
	 Queue is the First in and First Out Priority
	 
	 Front end and rear end 
	 Add the element from rear end and remove the element from front end
	 
	 We can user array or Linklist
	 
	 Linkedlist is implemented by Queue Interface
	 queue.offer(30); --> Insert the values in Queue
	 queue.poll(); --> Return and Remove the first inserted value from Queue, OR Head of the queue.
	 queue.peek();  it will show the next element will be ready to remove from Queue
	 queue.peek();--> Return the  Head of the Queue
	  */
	public static void main(String[] args) {
		
		Queue<Integer> queue= new java.util.LinkedList<>();
		queue.offer(270);  //Basically this will use to add the element in Queue
		queue.offer(30);
		queue.offer(40);
	    queue.offer(50);
	    queue.offer(60);
        System.out.println("Queue"  + queue);
        
       // queue.poll();
        
        System.out.println(queue.poll());  
        
        //queue.peek();  it will show the next element will be ready to remove from Stack
        System.out.println(queue.peek());
	
	
	}
	}
