package collection;

import java.util.ArrayList;

public class Numbers {
	public static void main(String args[]) {
		ArrayList<Integer>Arr = new ArrayList<Integer>();
		Arr.add(30);
		Arr.add(40);
		Arr.add(50);
		Arr.add(60);
		Arr.add(80);
		Arr.add(32);
		
		
		System.out.println(Arr);
	   Arr.set(5,70);
	 System.out.println(Arr);
	 System.out.println(Arr.contains(35));
	}

}
