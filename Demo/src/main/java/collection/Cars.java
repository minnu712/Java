package collection;

import java.util.ArrayList;

public class Cars {
	public static void main(String args[]) {
		
		ArrayList<String>Arr= new ArrayList<String>();
		
		Arr.add("Volvo");
		Arr.add("BMW");
		Arr.add("Bens");
		System.out.println(Arr);
		System.out.println(Arr.get(0));
		System.out.println(Arr.contains("BMW"));
		
		System.out.println(Arr.remove(1));
		System.out.println(Arr);
		
			System.out.println(Arr.set(1,"Innova"));
			System.out.println(Arr);
			Arr.add(2,"Sandro");
			
			
			System.out.println(Arr.size());
			System.out.println(Arr.remove("Innova"));
			System.out.println(Arr);
		Arr.clear();
		System.out.println(Arr);
			
			
	}

}
