/*
 * Code is a demo to perform FOR, WHILE & DO-WHILE LOOPS and Loop control statement.
 */
public class LoopControl {
	
	public void performWhileLoop(int numberOfIteration) {
		int i = 0;
		while(i < numberOfIteration) {
			System.out.println("Loop at : " + i);
			i++;
		}
		
		
	}
	
	public void performForLoop(int numberOfIteration) {
		for (int i=0; i < numberOfIteration; i++) {
			System.out.println("Loop at : " + i);
		}
		
	}
	
	public void performDoWhileLoop(int numberOfIteration) {
		int i = 1;
		do {
			i = i * 2;
			System.out.println("Loop at : " + i);
			
		}while(numberOfIteration > i);
		
	}
	
	public void performLoopControl(int numberOfIteration, int breakValue, int continueValue) {
		int count = 0;
		for(int i=0; i < numberOfIteration; i++) {
			if(i%continueValue == 0) {
				//Go to next iteration in the loop
				continue;
			}
			if(count >= breakValue) {
				//break out of the loop statements
				break;
			}
			count +=1;
			System.out.println("Loop is at : " + i + " and count is " + count);
			
		}
	}

	public static void main(String[] args) {
		// Initialize the class
		LoopControl myloop = new LoopControl();
//		myloop.performLoopControl(83, 10, 5);
		System.out.println("----------------------------------");
		myloop.performDoWhileLoop(5);
		System.out.println("----------------------------------");
		myloop.performForLoop(7);
		System.out.println("----------------------------------");
		myloop.performWhileLoop(4);
		System.out.println("----------------------------------");
		

	}

}
