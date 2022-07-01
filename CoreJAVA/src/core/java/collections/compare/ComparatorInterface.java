package core.java.collections.compare;
import java.util.*;
import core.java.collections.compare.Student;
/*
 * Implementing Comparator Interface to sort collection
 * Used to sort features or column which may or may not be measurable.
 */
public class ComparatorInterface {
	// Class to compare students by Name
	public class StudentNameCompare implements Comparator<Student>{
	    
		//Implement compare() method for interface to compare names
		public int compare(Student student1, Student student2){
	        return student1.getName().compareTo(student2.getName());
	    }
	}
	
	public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<Student>();
    
        ComparatorInterface mycomm = new ComparatorInterface();
        list.add(new Student(45,"Akshay"));   
        list.add(new Student(07, "Raj"));
        list.add(new Student(92, "John"));
        list.add(new Student(47, "Raju"));
        list.add(new Student(28, "Bheem"));
        list.add(new Student(65, "Tom"));
        list.add(new Student(33, "Jerry"));
        
        System.out.println("Original List is: ");
        
        System.out.println("\nSorted by name");
        //Initialize the studentNameCompare class to sort our collection 
        StudentNameCompare ratingCompare = mycomm.new StudentNameCompare();
        
        //Pass the compare class with collection to sort method
        Collections.sort(list, ratingCompare);
        for (Student student: list)
            System.out.println(student.getId() + " " + student.getName());
             
 
        // Uses Comparable to sort by year
        System.out.println("\nSorted by id");
        Collections.sort(list);
        for (Student student: list)
            System.out.println(student.getId() + " " + student.getName());
    }

}
