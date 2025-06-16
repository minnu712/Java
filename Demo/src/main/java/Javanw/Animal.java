package Javanw;

public class Animal implements Pets{
	public void print() {
		System.out.println("Implement method");
	}
	

	public static void main(String args[]) {
		Pets obj = new Animal();
		obj.print();
	}
	
}

