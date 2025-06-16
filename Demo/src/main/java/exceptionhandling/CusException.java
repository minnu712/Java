package exceptionhandling;

public class CusException {
	public static void validate(int age) throws InvalAgeException {
		if(age<18) {
			throw new InvalAgeException("person not eligible");
		}else {
			System.out.println("eligible");
		}
		
	}
	public static void main(String args[]) {
		try {
			validate(33);
		}catch(InvalAgeException ie) {
			ie.printStackTrace();
			
		}
	}

}
