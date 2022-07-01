/*
 * Demo for strings and Array operations
 */
import java.util.Arrays;

public class StringsAndArrays {
	
	static class StringOperations {
		//Method to get length of the string
		static void getLength(String selectedString) {
			System.out.println("Length is: " + selectedString.length());
			
		}
		//Method to get substring from given start and end index value
		static void getSubstring(String selectedString, int startIndex, int endIndex) {
			System.out.println("Substring from index " + startIndex + " to index " + endIndex + " is: " + selectedString.substring(startIndex, endIndex));
		}
		//Method to method to check if a word or character sequence is present in the string
		static void containsWord(String selectedString , CharSequence word) {
			System.out.println("Does given string contain the word - " + word + " : " + selectedString.contains(word));
		}
		//Method to join two strings with given delimiter
		static void joinStrings(String firstString, String secondString, CharSequence delimiter) {
			System.out.println("Joined string is : " + String.join(" ", firstString, secondString));
		}
		//Method to concatenate two strings
		static void concatenateStrings(String firstString, String secondString) {
			System.out.println("Concatenated string is : " + firstString.concat(secondString));
		}
		//Method to replace a word/character sequence
		static void replaceStringWords(String selectedString, CharSequence oldWord, CharSequence newWord) {
			System.out.println("After replacing word (" + oldWord + ") with  new word (" + newWord + ") string is : " + selectedString.replace(oldWord, newWord));
		}
		//Method to make all character lowercased
		static void makeStringLowercase(String selectedString) {
			System.out.println("Lowecased string is : " +  selectedString.toLowerCase());
		}
		//Method to make all character uppercased
		static void makeStringUppercase(String selectedString) {
			System.out.println("Uppercased string is : " + selectedString.toUpperCase());
		}
		
	}

	public static void main(String[] args) {
		// Implementing all string operation from our class StringOperations
		StringOperations.getLength("Hello everyone");
		StringOperations.getSubstring("Hello everyone", 4, 8);
		StringOperations.containsWord("Testing this string", "akshay");
		StringOperations.joinStrings("I am", "batman", " ");
		StringOperations.concatenateStrings("My name is ", "John Doe");
		StringOperations.replaceStringWords("It is what it is. It should be like it is", "is", "is not");
		StringOperations.makeStringLowercase("HeLLO everYoNE");
		StringOperations.makeStringUppercase("HeLLO everYoNE");
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("      				 ARRAY OPERATION 						");
		System.out.println("------------------------------------------------------------\n");
		
		int[] integerArray = {3,5,4,1,2};
		float []floatArray = {3.5f, 9.2f, 0.73f};
		char charArray[] = new char[3];
		charArray[0] = 'A';
		charArray[1] = 'b';
		charArray[2] = 'C';
		
		// Sort method of array class
		Arrays.sort(integerArray);
		System.out.println("After sort() method array is: " + Arrays.toString(integerArray));
		
		// Fill method of array class
		Arrays.fill(floatArray, 3.14f);
		System.out.println("After fill() method array is: " + Arrays.toString(floatArray));
		
		// Equals method of array class
		System.out.println("After equals() method both arrays are equal: " + Arrays.equals(integerArray, null));
		
		//BinarY Search method in array class
		System.out.println("After binarySearch() method '5' is at index: " + Arrays.binarySearch(integerArray, 5));
		
		
		
		// Implementing all string operation from our class StringOperations
		
		
	}

}
