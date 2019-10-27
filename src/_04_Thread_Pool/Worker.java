package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	
	public Worker(ConcurrentLinkedQueue<Task> taskQueue) {
		taskQueue= new ConcurrentLinkedQueue();
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!taskQueue.isEmpty()) {
			
			taskQueue.remove();
			taskQueue.element().perform();
		}
		
		
	}


}
