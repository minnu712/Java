package exceptionhandling;

public class CustomException {
 public static void validateAge(int age)throws InvalidAgeException {
	 if(age<18) {
		 throw new  InvalidAgeException("Not eligible to vote");
	 } else {
		 System.out.println("Eligible to vote");
		 
	 }
	
 }
 public static void main(String args[]) {
	 try {
		 validateAge(200);
	 }catch(InvalidAgeException ie) {
	 ie.printStackTrace();  
	 
	 } finally {
		 System.out.println("Welcome");
		 
		 }
		 System.out.println("Obsqura");
		 
	 }
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
