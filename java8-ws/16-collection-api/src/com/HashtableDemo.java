package com;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, Object> hm=new Hashtable<>();
		hm.put(37644444, "Praveen");
		hm.put(947394749, "James");
		hm.put(2948749, "kavya");
		hm.put(84568585, "Megana");
		hm.put(764836485, "Sarah");
		hm.put(947394749, "Buckey");
		//hm.put(null, "Prashath");
		//hm.put(8745685, null);
		//hm.put(null, null);
		
		
		System.out.println(hm);
		
		// get value using key
		
		Object obj = hm.get(2948749);
		System.out.println(obj);
		
		

	}

}
