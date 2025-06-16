package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public static void main(String args[]) {
		java.util.Set<String>st = new HashSet<String>();
		st.add("apple");
		st.add("mango");
		st.add("orange");
		st.add("apple");
		System.out.println(st);
		Iterator<String>it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
