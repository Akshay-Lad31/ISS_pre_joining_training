package core.java.collections;

import java.util.*;

/*
Collections of primitive datatypes like int, float, double, char, string, etc can be implemented through java.util.Collections package.
In this example, we will be implementing ArrayList (for List), HashSet (for Set) and HashMap (for Map) for primitive datatype integers.

Note: Same can be implemented using other integer types.  
*/
public class PrimitiveCollections {
	
	public void listOperations() {
		
		//Initialize ArrayList
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		  
        //Adding elements to list
        for (int i = 1; i <= 5; i++)
        	integerArrayList.add(i);
  
        // Printing elements
        System.out.println("ArrayList is: " + integerArrayList);
        
        // Remove element at index 3
        integerArrayList.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + integerArrayList);
        
        // Find index of a particular element. If element is not present -1 is returned.
        System.out.println("Index of element '3' which is: " + integerArrayList.indexOf(3));
        System.out.println("Index of element '4' which is not in the list returns : " + integerArrayList.indexOf(4));
        
        //Setting value/Replacing an element at a particular index.
        integerArrayList.set(1, 7);
        System.out.println("Setting index '1' value to '7' the ArrayList is: " + integerArrayList);
        
        //Cloning the list
        Object clonedList = integerArrayList.clone();
        System.out.println("Cloned (Shallow copy) ArrayList is: " + clonedList);
        
        //Removing all elements in the list
        integerArrayList.clear();
        System.out.println("Clearing ArrayList: " + integerArrayList);
        
        // Checking if the list is empty or not.
        System.out.println("Checking if ArrayList is empty: " + integerArrayList.isEmpty());
		
	}
	
	public void setOperations() {
		Set<Integer> setA = new HashSet<Integer>();
        
        // Adding all elements to List 
		setA.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 8, 12, 10, 6 }));

        Set<Integer> setB = new HashSet<Integer>();
        setB.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5, 10, 11 }));
  
          
        // To find union
        Set<Integer> union = new HashSet<Integer>(setA);
        union.addAll(setB);
        System.out.println("Union of the two Set: " + union);
        
        
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection of the two Set: " + intersection);
        
        
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(setA);
        difference.removeAll(setB);
        System.out.println("Difference of the two Set: " + difference);
        
        //Removing element from set
        setA.remove(0);
        System.out.println("Set A after removing element 0 is: " + setA);
        
        //Checking if element is present in a set
        System.out.println("Checking if element 9 is present in Set A: " + setA.contains(9));
        
		
	}

	public void mapOperations() {
		
		Map<String, Integer> mapA = new TreeMap<>();
		  
        // Inserting elements using put() method
        mapA.put("Two", 2);
        mapA.put("Seven", 7);
        mapA.put("Nine", 9);
        System.out.println("Elements in map A are: " + mapA);
        
        // Removing element from map using its key
        mapA.remove("Two");
        System.out.println("Map A after removing 'two': " + mapA);
        
        //To get size of the map.
        System.out.println("Map A size is: " + mapA.size());
        
        // To find an value of element in map based on its key
        System.out.println("Map A element value for key 'Nine': " + mapA.get("Nine"));
        
        //Keys present in map
        System.out.println("Map A has following keys: " + mapA.keySet());
        
        //To check if key and value is present in a map
        System.out.println("Checking if key 'two' and value '2' is present: " + mapA.containsKey("Two") + " and " + mapA.containsValue(2));
		
	}


	public static void main(String[] args) {
		
		PrimitiveCollections collectionDemo = new PrimitiveCollections();
		
		System.out.println("\n---------  ARRAY LIST OPERATIONS  ---------\n");
		collectionDemo.listOperations();
		
		System.out.println("\n---------  SET LIST OPERATIONS  ---------\n");
		collectionDemo.setOperations();
		
		System.out.println("\n---------  MAP LIST OPERATIONS  ---------\n");
		collectionDemo.mapOperations();

	}

}
