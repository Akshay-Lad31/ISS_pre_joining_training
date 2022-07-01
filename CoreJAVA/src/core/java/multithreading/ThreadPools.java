package core.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * Demo to implement thread pool
 */
public class ThreadPools {
	//Maximum number of threads
	private static final int MAX_THREAD = 3;
	//Creat a task to run on each thread
	class Task implements Runnable {
	    private String name;
	      
	    public Task(String s){
	        name = s;
	    }
	      
	    // Prints task name and sleeps for 1s
	    // This Whole process is repeated 5 times
	    public void run(){
	    	try {
	    		for(int i=0; i <5; i++) {
		    		if(i == 0) {
		    			//Run at start of Task
		    			System.out.println("Task: " + name + " HAS STARTED ");
		    		}
		    		else {
		    			//Run at execution of Task
		    			System.out.println("Task: " + name + " RUNNING... ");
		    		}
		    		Thread.sleep(1000);
		    	}
	    		//Run at end of Task
    			System.out.println("Task: " + name + " COMPLETED ");	
	    	}
	    	catch(InterruptedException e) {
	    		e.printStackTrace();		
	    	}
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Thread Pool
		ThreadPools threadPool = new ThreadPools();
		//Add runnable task to thread pools
		Runnable r1 = threadPool.new Task("1");
        Runnable r2 = threadPool.new Task("2");
        Runnable r3 = threadPool.new Task("3");
        Runnable r4 = threadPool.new Task("4");
        Runnable r5 = threadPool.new Task("5");
        Runnable r6 = threadPool.new Task("6"); 
        Runnable r7 = threadPool.new Task("7"); 
          
        //excute thread pool with max thread=3
        ExecutorService pool = Executors.newFixedThreadPool(threadPool.MAX_THREAD);  
         
        //Pass task to run to the pool
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);
        pool.execute(r7);
          
        //Shutdown all threads in thread pool
        pool.shutdown(); 

	}

}
