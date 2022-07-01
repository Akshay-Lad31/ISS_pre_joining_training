package core.java.exceptions;

/*
 * Creating a custom exception class which extends Exception.
 * It requires a constructor and a toString() method.
 */
public class CustomException extends Exception{
	
	String errorMessage = null;
	
	public CustomException(String message) {
		errorMessage = message;
	}

	public String toString() {
		return "CustomException:" + errorMessage;
	}
}
