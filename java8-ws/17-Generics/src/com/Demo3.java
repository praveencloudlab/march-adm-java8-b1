package com;

class Test{
	
}

public class Demo3<T> {
	
	void f1(T x) {
		System.out.println(x.getClass().getTypeName() +" : " +x);
	}
	
	 
	public static void main(String[] args) {
		
		
		// make sure d object must have only integer values
		Demo3<Integer> d=new Demo3<>(); 
		Demo3<String> d1=new Demo3<>();
		Demo3<Object> d2=new Demo3<>();
		//d.f1("Praveen");
		d.f1(394739);
		d.f1(2324);
		d.f1(45466);
		
		d1.f1("Abc");
		d1.f1("Xyz");
		
		d2.f1("AbcXyz");
		d2.f1(384374);
		d2.f1(844545.545F);
		d2.f1(new Test());
		
	//	d.f1(74364.3434F);
		//d.f1(834648L);
		
		
		
	}

}
