package exceptionhandling;

public class ThrowDemo {
	public void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}
		public static void main(String args[]) {
		ThrowDemo td = new ThrowDemo();
		td.validate(4);
	}
	
	  

}


