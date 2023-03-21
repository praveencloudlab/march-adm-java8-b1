package com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		// Set interface
		
		HashSet<Object> hs=new HashSet<>();
		
		hs.add("Praveen");
		hs.add(34854545);
		hs.add(84484.343F);
		hs.add("Praveen");
		hs.add('A');
		hs.add(34854545);
		
		System.out.println(hs);
		
		// for each
		for(Object obj:hs) {
			System.out.println(obj);
		}
		
		System.out.println("---------------");
		Iterator<Object> it=hs.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
		
	
		
		
		
	}

}
