package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HshSet {
	public static void main(String args[]) {
		HashSet<String>hst = new HashSet<String>(); 
		hst.add("Apple");
		hst.add("Mango");
		hst.add("pineapple");
		hst.add("Orange");
		hst.add("Apple");
		    System.out.println(hst);
		
		    
		    Iterator<String>it =  hst.iterator();
		while(it.hasNext()) {
			String dyn = it.next();
			System.out.println(dyn);
		
		   
		   
			
		    System.out.println(hst.contains("Orange"));
			
		  for(String Fruit:hst) {
			  System.out.println(Fruit);
		  }//for each loop..for iterate
		   
		  
		   System.out.println(hst.size());
		   System.out.println(hst.remove("Apple"));
		   System.out.println(hst);
		   hst.remove(1);
		
		   hst.clear();
		   System.out.println(hst);
		   
		  
		}
	}


