package exceptionhandling;

public class TrCatFin {
	public static void main(String args[]) {
	try {
     int num = 5/0;
 }
	catch(ArithmeticException ae) {
	System.out.println("welcome");
	
	}
	finally {
		System.out.println("right");
		
		
	}
	 
 
	}
}
