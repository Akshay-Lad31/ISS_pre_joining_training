package core.java.multithreading;

public class SynchronizationByMethod {
	
class Counter {
		//Entire method is sync. ie. only one thread can access it at a time
		synchronized public void syncTaskMethod(String taskName) {
	    	try {
	    		for(int i=0; i <5; i++) {
		    		if(i == 0) {
		    			//Run at start of Task
		    			System.out.println("Counter (for "+ taskName + ") HAS STARTED ");
		    		}
		    		else {
		    			//Run at execution of Task
		    			System.out.println("Counter (for "+ taskName + ") at: " + i);
		    		}
		    		Thread.sleep(2000);
		    	}
	    		//Run at end of Task
    			System.out.println("Counter (for "+ taskName + ") COMPLETED ");	
	    	}
	    	catch(InterruptedException e) {
	    		e.printStackTrace();		
	    	}
	    	
	    }
		
	}
	
	class Task extends Thread {
	    private String name;
	    private Counter count;
	      
	    public Task(String taskName, Counter count)
	    {
	        this.name = taskName;
	        this.count = count;
	    }
	      
	    //Run the counter
	    public void run(){
	    	System.out.println("Task Name: " + name + " (NOTE: print statement is not synchronized)");
	    	count.syncTaskMethod(name);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizationByMethod demo = new SynchronizationByMethod();
		Counter count = demo.new Counter();
		Task task1 = demo.new Task("Task 1", count);
		Task task2 = demo.new Task("Task 2", count);
		
		System.out.println("--------------------STARTING BOTH TASK------------------------ ");
		task1.start();
		task2.start();
	}

}
