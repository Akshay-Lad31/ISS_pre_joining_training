package core.java.OOP;

public class Dogs extends Mammals{
	
	public void getNumberofLimbs() {
		System.out.println("Dogs have 4 legs");	
	}
	
	public Dogs() {
		System.out.println("Hello Dog Class");
	}
	
	public void intro() {
		System.out.println("This is Dog Class");
	}

	@Override
	public boolean isCarnivorus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return -1;
	}


}
