package core.java.multithreading;
/*
 * Demo synchronization of block of code
 */
public class SynchronizationByBlock {
	
	class Counter {
		
		String usedBy = "";
		synchronized public void syncTaskMethod(String taskName, int multiplier) {
			System.out.println("Out of sync block....Used by: " + usedBy);
	    	try {
	    		//Sync only the loop part
	    		synchronized(this) {
	    			for(int i=0; i <8; i += multiplier) {
			    		if(i == 0) {
			    			//Run at start of Task
			    			System.out.println("Counter (for "+ taskName + ") HAS STARTED ");
			    		}
			    		else {
			    			//Run at execution of Task
			    			System.out.println("Counter (for "+ taskName + ") at: " + i);
			    		}
			    		Thread.sleep(1500);
			    	}
	    		}
	    		//Run at end of Task
    			System.out.println("Counter (for "+ taskName + ") COMPLETED ");	
	    	}
	    	catch(InterruptedException e) {
	    		e.printStackTrace();		
	    	}
	    	
	    }
		
	}
	//Create a Task which uses a resource
	class Task extends Thread {
	    private String name;
	    private Counter count;
	    private int counterSpeed;
	      
	    public Task(String taskName, Counter count, int speed)
	    {
	        this.name = taskName;
	        this.count = count;
	        this.counterSpeed = speed;
	    }
	      
	    //Run the counter
	    public void run(){
	    	System.out.println("Task Name: " + name + " (NOTE: print statement is not synchronized)");
	    	count.usedBy = name;
	    	count.syncTaskMethod(name, counterSpeed);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizationByBlock demo = new SynchronizationByBlock();
		//Initialize the counter
		Counter count = demo.new Counter();
		//Create two task (threads) and pass the same counter
		Task task1 = demo.new Task("Task 1", count, 1);
		Task task2 = demo.new Task("Task 2", count, 2);
		
		System.out.println("--------------------STARTING BOTH TASK------------------------ ");
		//start both threads
		task1.start();
		task2.start();

	}

}
