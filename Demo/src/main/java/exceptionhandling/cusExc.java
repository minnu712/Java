package exceptionhandling;

public class cusExc {
	public static void withdraw(int balance ,int amount)throws InsufficientFundsException{
		if(amount>balance) {
			throw new InsufficientFundsException("insufficient balance");
		}
		else {
			System.out.println("amount is greaterthan balance ");
		}
	}
	public static void main(String args[]) {
		int balance = 500;
		int withdrawAmount  = 800;
		try {
			withdraw(balance,withdrawAmount);
		}catch(InsufficientFundsException ie) {
			ie.printStackTrace();
		
		} finally {
			 System.out.println("Credits more amount");
			 
			 }
		
			
		}
		
	}


