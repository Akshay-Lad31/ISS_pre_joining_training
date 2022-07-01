package core.java.collections;
/*
 * Custom Student class build to implement custom collection objects
 */
public class Student {
	//Create class variables
	private int id;
	private String name;
	//Creating getter and setter methods to access class variables.
	public int getId() {
		return id;
	}
	
	public Student(int id_, String name_) {
		this.id = id_;
		this.name = name_;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Helper function to print class variable details
	public void printStudent() {
		System.out.println("ID: " + id + " NAME: " + name);
	}
	

}
