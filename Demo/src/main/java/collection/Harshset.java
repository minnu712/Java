package collection;

import java.util.HashSet;

public class Harshset {
	public static void main(String args[]) {
		HashSet<String>hst = new HashSet<String>(); 
		hst.add("Apple");
		hst.add("Mango");
		hst.add("pineapple");
		hst.add("Orange");
		hst.add("Apple");
		    System.out.println(hst);
		   
		    HashSet<String>hast = new HashSet<String>(); 
		    hast.add("Orange");
			hast.add("App");
		    hast.add("Or");
		    System.out.println(hast);
		   //hst.retainAll(hast);
	  
	  
	     System.out.println( hst.isEmpty());
		// hst. addAll(hast);
		 //System.out.println(hst);  
		System.out.println(hast.retainAll(hst));
		 hst.clear();
		 System.out.println(hst);
		 System.out.println(hast);
	         
}}

