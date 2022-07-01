package core.java.collections.compare;

/*
 *This code is an demo for Comparable Interface to sort collection 
 *Use to sort only measured quantities.
 */
public class Student implements Comparable<Student>{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	// Used to sort student by id
    public int compareTo(Student m){
        return this.id - m.id;
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
	
	public void printStudent() {
		System.out.println("ID: " + id + " NAME: " + name);
	}
	

}
