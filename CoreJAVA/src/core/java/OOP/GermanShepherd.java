package core.java.OOP;

public class GermanShepherd extends Dogs {
	
	//Keeping the variables private and providing getter and setter methods (Example of Encapsulation)
	private int age = 0;
	private boolean isCarnivorus = false;
	
	public GermanShepherd(int age, boolean carnivorusStatus) {
		this.age = age;
		this.isCarnivorus = carnivorusStatus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs mydog = new Dogs();
		Dogs mydog2 = new GermanShepherd(3, true);
		System.out.println("It says: ");
		mydog.intro();
		
		mydog2.intro();

	}
	
	//Example of Polymorphism (Overriding)
	@Override
	public void intro() {
		super.intro();
		System.out.println("This is GermanSheperd class");
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public boolean isCarnivorus() {
		// TODO Auto-generated method stub
		return isCarnivorus;
	}
	

}
