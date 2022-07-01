package core.java.multithreading;

public class Multithreading {
	
/*Thread class can be used to implement multithreading.
 However, if class is extended using Thread class, then it cannot be extended to any other class as 
 JAVA doesn't support multi-inheritance.
 */	
	public class MultithreadingWithThread extends Thread{
		public void run(){
	        try {
	            // Displaying the thread that is running
	            System.out.println("Thread using Thread class: " + Thread.currentThread().getId());
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	    }
	}
	
	public class MultithreadingWithRunnable implements Runnable{
		@Override
		public void run(){
	        try {
	            // Displaying the thread that is running
	            System.out.println("Thread using Runnable Interface: " + Thread.currentThread().getId());
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading demo = new Multithreading();
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingWithThread usingThread =demo.new MultithreadingWithThread();
			usingThread.start();
        }
		System.out.println("----------------------------------------------- ");
        for (int i = 0; i < n; i++) {
        	Thread usingRunnable = new Thread (demo.new MultithreadingWithRunnable());
        	usingRunnable.start();
        }

	}

}
