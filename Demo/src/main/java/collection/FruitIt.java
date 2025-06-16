package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FruitIt {
	public static void main(String args[]) {
		ArrayList <String>list = new ArrayList<String>();
		list.add("hhh");
		list.add("mmm");
		list.add("nmn");
		//System.out.println(list);
		Iterator<String>it = list.iterator();
		while(it.hasNext()) {
			String Fruit = it.next();
			System.out.println(Fruit);
			if(Fruit.equals("mmm")) {
			it.remove();
			
			
		}
			System.out.println(list);
		}
		
		
		
	}

}
