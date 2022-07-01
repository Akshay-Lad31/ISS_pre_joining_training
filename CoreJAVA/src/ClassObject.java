import core.java.demoClass.Student;
/*
 * Demonstration of JAVA class and object instance
 */
public class ClassObject {

	public static void main(String[] args) {
		
		//Initialize an object with 'new' and passing the parameter to class constructor
		Student akshay = new Student(1, "Akshay" , "Lad");
		//Calling methods
		System.out.println("Student Name: "+ akshay.getFirstName() + " "+ akshay.getLastName() +" has id " + akshay.getId());
		//Changing instance variable 'id' using setId() method
		akshay.setId(0);
		System.out.println("Student Name: "+ akshay.getFirstName() + " "+ akshay.getLastName() +" has id (new) " + akshay.getId());
		

	}

}
