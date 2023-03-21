package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LihnkedHashSetDemo {
	
	public static void main(String[] args) {
		
		// Set interface
		
		LinkedHashSet<Object> hs=new LinkedHashSet<>();
		
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
