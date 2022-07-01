package core.java.OOP;
/*
 * This is an abstract class. It implemts Animals interface thus, all class which implement Mammals will follw the interface.
 * This class describes the methods of a class . but methods are not implemented.
 */
public abstract class Mammals implements Animals {
	private final String BLOOD_TYPE = "warm";
	
	public Mammals() {
		System.out.println("Inside Mammals");
	}
	
	public void intro() {
		System.out.println("This is Mammals Class");
	}
	public void getCharacteristics() {
		System.out.println("mammal char");
	}
	
	abstract void getNumberofLimbs();


	public String getBloodType() {
		return BLOOD_TYPE;
	}

}
