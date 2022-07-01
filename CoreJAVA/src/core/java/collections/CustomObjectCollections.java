package core.java.collections;
/*
 * Implementation of Custom Object collection 
 * 
 * Here, the custom object is Student.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class CustomObjectCollections {
	
	void customObjectList() {
		//initialize custom ArrayList with Student object
		ArrayList<Student> customList = new ArrayList<Student>();
		System.out.println(customList);
		
		String[] nameArray = {"akshay", "mihir", "jay", "raj", "lad"};
		
		//Add all student object with data to our customList
		for (int i = 0; i < 5; i++)
			customList.add(new Student(i, nameArray[i] ));
		
		// Printing elements
		//Creating an Iterator to iterate over the ArrayList
		Iterator<Student> iterator = customList.iterator();
		System.out.println("CustomList is: " + customList);
		while(iterator.hasNext()) {
			iterator.next().printStudent();
		}
        // Remove element at index 3
        customList.remove(3);
      
        // Find index of a particular element. If element is not present -1 is returned.
        System.out.println("Index of element '3' which is: " + customList.indexOf(iterator));
        
        //Setting value/Replacing an element at a particular index.
        customList.set(1, new Student(11, "Johnny"));
        System.out.println("Setting index '1' value to '7' the ArrayList is: " + customList);
        
        //Cloning the list
        Object clonedList = customList.clone();
        System.out.println("Cloned (Shallow copy) ArrayList is: " + clonedList);
        
        //Removing all elements in the list
        customList.clear();
        System.out.println("Clearing ArrayList: " + customList);
        
        // Checking if the list is empty or not.
        System.out.println("Checking if ArrayList is empty: " + customList.isEmpty());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomObjectCollections customCollections = new CustomObjectCollections();
		customCollections.customObjectList();

	}

}
