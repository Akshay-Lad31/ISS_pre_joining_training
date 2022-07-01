/*
 * This code example show various primitive datatypes present in java
 */
public class BasicDatatypes {
	
	public int integerNumber = 72;
	public float floatNumber = (float)5.3293;
	public double doubleNumber = 3.5457;
	public char charLetter = 'A';
	protected short shortNumber = -2345;
	protected long longNumber = 10372834;
	public static int staticInteger;
	private boolean currentStatus = true;
	final static String COMPANY_NAME = "Institutional Shareholder Services Inc.";
	

	public static void main(String[] args) {
		System.out.println("--------- No need to create an Object instance for 'static' objects ---------");
		System.out.println("Interger in static method :\t" + staticInteger );
		System.out.println("String in static method   :\t" + COMPANY_NAME + "");
		
		BasicDatatypes dataObject = new BasicDatatypes();
		System.out.println("Double datatype (public)   :\t" + dataObject.doubleNumber );
		System.out.println("Float datatype (public)    :\t" + dataObject.floatNumber );
		System.out.println("Char datatype (public)     :\t" + dataObject.charLetter );
		System.out.println("Short datatype (protected) :\t" + dataObject.shortNumber );
		System.out.println("Long datatype (protected) :\t" + dataObject.longNumber );
		System.out.println("Boolean datatype (private) :\t" + dataObject.currentStatus );
		

	}

}
