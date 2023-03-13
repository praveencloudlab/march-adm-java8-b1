package p1;

public class C1 {

	//public
	//every package classes can access
	public void f1() {}
	//default
	//with in same package
	void f2() {}
	//protected
	// with in same package
	// sub classes objects of different packages
	protected void f3() {
		// auth
		f4(); // valid
	}
	
	private void f4() {
		
	}
	
	
	
}
