package Queue;

public class PriorityQueue {

	/*
	  Create a  queue but we nedd to give the priority of value  in the  queue
	  CM is standing in Queue we need to give the first priority to CM.
	  We have to define the priority for Low, High and Custom element in the Queue.
	  All funtions are comming from Queue
	  In this queue small element is in the top position.
	  */
	
	public static void main(String[] args) {
		java.util.PriorityQueue<Integer> pq= new java.util.PriorityQueue<>();
		pq.offer(300);
		pq.offer(700);
		pq.offer(50);
		pq.offer(250);
		System.out.println(pq);  //  in Queue 1st position lower value is showing 
		pq.poll();
		System.out.println(pq); // Remove the Lower value
		
		System.out.println(pq.peek()); // It will show the newxt lower value is ready to remove
		

	}


		
	}


