package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGen {
	public static void main(String[] args){
		List  arr = new ArrayList();
		arr.add("hhh");
		arr.add(100);
		arr.add(10.5);
		String name = (String)arr.get(0);
		char name1 = (char)arr.get(1);
		
		
			System.out.println(name);

		}

}

	
		
		


