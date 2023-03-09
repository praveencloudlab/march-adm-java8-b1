package com;


public class Test {
	
	
	/**
	 *  class
	 *  =======================
	 *  -> a class is a blue print of an object.
	 *     ex: Fruit, Employee, Vehicle, Animal,Human,Country
	 * 
	 *    what max a class can have?
	 *    ==================================
	 *    1.variables
	 *    2.methods
	 *    3.constructors
	 *    4.blocks
	 *    5.inner class
	 *    5.interfaces
	 *    6.enums
	 * 
	 *    1.variables / fields
	 *    =======================
	 *    1.instance
	 *    2.static
	 *    3.final
	 *    4.volatile
	 *    5.transient
	 *    
	 *    2.methods
	 *    ========================
	 *    1.instance
	 *    2.static
	 *    3.final
	 *    4.native
	 *    5.abstract
	 *    
	 *    3.constructors
	 *    =================
	 *    1.no argument 
	 *    2.argument based
	 *    
	 *    4.blocks
	 *    =================
	 *    1.instance
	 *    2.static
	 *    
	 *    5.inner class
	 *    =================
	 *    1.inner class
	 *    2.Anonymous inner class
	 *    
	 *    5.interfaces
	 *    ================
	 *    1.interfaces
	 *    2.multiple interfaces
	 *    
	 *    
	 *    
	 *    instance data
	 *    ===================
	 *    -> instance data can be unique to a object
	 *   
	 *    static data
	 *    ===================
	 *    -> static data is sharable b/w objects
	 *    
	 *    
	 *    methods
	 *    ==========
	 *    1.instance methods
	 *    2.static methods
	 *    
	 *    
	 *    notes
	 *    ===========
	 *    1.instance data can be accessed directly 
	 *      from instance methods
	 *    2.instance data can not be directly accessed from 
	 *      static methods
	 *    3.static data can be directly accessible from 
	 *      static and instance methods
	 *      
	 *      
	 *      
	 *    methods
	 *    ============
	 *    1.every method must return a value.
	 *    2.in case a method in not returning anything,
	 *      then return type must be 'void'
	 *      
	 *      
	 *    what is an object?
	 *    =======================
	 *    Object is an real time entity, which can have
	 *    1.state => variables
	 *    2.behavior/actions => methods
	 *    
	 *    Ex: animal class an have animalId, aninalName
	 *        animal class can have bark and run methods
	 *        
	 *        animalId and animalName are state
	 *        bark and run are actions of animal
	 *        
	 *        
	 *     why objects are needed in java?
	 *     ====================================
	 *     1.objects maintains unique content
	 *     2.object can carry data from one method to another method
	 *     
	 *     when/where objects have to be created?
	 *     ======================================
	 *     => to access instance data from a static methods,
	 *        then objects are needed.
	 *     
	 *     
	 *     notes
	 *     ============
	 *     1.Objects are needed to access instance data from
	 *       static methods with in the same class
	 *     2.Objects are needed to access instance data from
	 *       static and non static method of a different class
	 *   
	 *        
	 *     how objects can be created?
	 *     =================================
	 *     => using 'new'operator followed by a constructor
	 *     => 'new'operator allots memory to the class
	 *     => 'new'operator stores the object inside 'heap' memory
	 *     
	 */
	
	 int x; // instance variable
	 static int y; // static variable
	 
	 void f1() { // non static / instance
		 x=100; // valid
		 y=400; // valid
	 }
	 
	 static void f2() {
		// x=300; // invalid
		 y=500; // valid
		 
		 Test tObj=new Test();
		 tObj.x=947;
	 }
	 
	 public static void main(String[] args) { // static method
		
		// x=200; // invalid
		 
		 int x=10000; // x is local to main
		 
		Test t;
		t= new Test(); // here Test() is constructor
		t.x=100; // valid
		y=1000;
		 
		System.out.println("hello java!");
		System.out.println("x value is "+t.x);
		System.out.println("y value is "+y);

		

	}

}
