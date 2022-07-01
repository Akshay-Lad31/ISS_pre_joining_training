package core.java.exceptions;

import java.io.FileInputStream;

/*
 * Demo for exception handling in java
 */
public class ExceptionHandling {

	public void uncheckedException() {
		//Put the code which might raise an exception inside try{}. 
		//try{} is followed by catch{} to catch the thrown exception from try.
		try {
			String nullString = null;
			int stringLength = nullString.length();
			
		}
		//Exception if occured in try is caught by the catch{} method and catch{} section runs
		catch(Exception ex) {
			System.out.println("Exception has occured. Exception is:\n" + ex);
			
		}
		//Finally block runs after catch{}. Its optional
		finally {
			System.out.println("This block always runs");
			
		}
	}
	
	public void checkedException() {
		//
		try {
			FileInputStream myFile = new FileInputStream("C:/Users/Desktop/noSuchFile.txt");  
			
		}catch(Exception ex) {
			System.out.println("Exception has occured. Exception is:\n" + ex);
			
		}
		finally {
			System.out.println("This block always runs");
			
		}
	}
	
	public void exceptionHierarchy() {
		//
		try {
			int[] integerArray = {1,2,3};
			int integerValue = integerArray[3];
			
		}catch(Exception ex) {
			System.out.println("Exception has occured. Exception is:\n" + ex);
			System.out.println("Exception stack Trace is:");
			ex.printStackTrace();
			
		}
	}
	
	//Method to throw custom exception
	public void customException(int a, int b) throws CustomException{ //throws shows that the method might through a CustomException
		if(a != b) {
			//throw is used to throw an actual exception.
			throw new CustomException(" Both number are not equal. Thus Custom Exception occured");
		}
		else {
			System.out.println("No Exception as both number are same.");
		}			
	}
	
	//Run the code
	public static void main(String[] args) {
		ExceptionHandling exceptions = new ExceptionHandling();
		exceptions.uncheckedException();
		exceptions.checkedException();
		exceptions.exceptionHierarchy();
		try {
			exceptions.customException(2, 2);
			exceptions.customException(2, 3);
		} catch (CustomException e) {
			e.printStackTrace();
		}
		
	}

}
