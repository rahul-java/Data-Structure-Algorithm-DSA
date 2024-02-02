package Queue.QueueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
	
	//FIFO=>First In First Out
	//LILO=>Last In Last Out
	
	public static void main(String[] args) {
		
		Queue<Object> queue = new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		
		System.out.println(queue);  //[10, 20, 30, 40, 50, 60]
		
		//poll()=>it retrieve the value from front and remove it and  then shift all the values to the left.
		//poll()=>when queue is empty then it will return null.
		
		System.out.println(queue.size());  //6
		System.out.println(queue.poll());  //10
		System.out.println(queue.size()); //5
		System.out.println(queue);  //[20, 30, 40, 50, 60]
		
		System.out.println(queue.poll());  //20
		System.out.println(queue.size()); //4
		System.out.println(queue);  //[30, 40, 50, 60]
		
		System.out.println(queue);  //[30, 40, 50, 60]
		System.out.println(queue.peek());  //30
		System.out.println(queue.peek());  //30
		System.out.println(queue);  //[30, 40, 50, 60]
		
		
	}

}
