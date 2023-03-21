package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<>();

		ar.add(39494);
		ar.add("Praveen");
		ar.add("James");
		ar.add(3947);
		ar.add(345347);
		ar.add("Kavita");
		ar.add(3847.454F);
		ar.add('A');
		ar.add("Praveen");
		ar.add(false);
		ar.add(39494);

		System.out.println(ar);

		System.out.println(ar.size());
		// get AR elements by index
		System.out.println(ar.get(3));

		ar.add(1, 10000); // here 1 is index

		System.out.println(ar);

		// delete elements from ar

		ar.remove(4);

		System.out.println(ar);

		// how to iterate data over ArrayList? : 4 ways

		// way -1 : use for loop

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("-----------------------------------");

		// way 2: use Iterator object

		Iterator<Object> it = ar.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);

		}

		// way3: ListIterator

		System.out.println("-----------------------------------");

		ListIterator<Object> li = ar.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		// way 4 : for each :: from Java 6 : works only with Arrays
		System.out.println("-----------------------------------");

		for (Object obj : ar) {
			System.out.println(obj);
		}

		// for(int i=0;i<ar.size();i++) {
		// System.out.println(ar.get(i));
		// ar.add("data");
		// }

		// for(Object obj:ar) {
		// System.out.println(obj);
		// ar.add("New Data");
		// }

		Iterator<Object> it1 = ar.iterator();

		while (it1.hasNext()) {
			Object obj = it1.next();
			if (obj.equals("James"))
				it1.remove();
			System.out.println(obj);

		}

		System.out.println(ar);

		ListIterator<Object> li1 = ar.listIterator();

		while (li1.hasNext()) {
			Object obj=li1.next();
			if(obj.equals("Kavita")) {
				li1.set("Bucky Wall");
			}
			System.out.println(obj);
		}
		System.out.println("==============================");
		System.out.println(ar);
	}

}
