package Javanw;

public class Vehiclee implements Cars,bus{ 
	public void print() {
		System.out.println("drive vehicle");
	}


public static void main(String args[]) {
	Vehiclee vh = new Vehiclee();
	vh.print();
}
}