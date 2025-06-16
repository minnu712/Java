package Javanw;

public class Car {
	 final int speedLimit = 90;
	
	public void changeDetails() {
		speedLimit = 40;
		 System.out.println(speedLimit);
	}
	public static void main(String args[]) {
		Car obj = new Car();
		obj.changeDetails();
	}
	}


// final keyword..// final variable cannot be change..
