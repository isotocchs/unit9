package com.columbus.unit9;

public class Unit9_7ObjectSuperclass {

	//Object is the superclass of all objects in Java
	//By default every class -extends Object-
	
	//The main two methods you use from this superclass are:
	// .equals() returns boolean
	// .toString() returns String (this is what happens when you try to print the object)
	// Subclasses can override these methods if needed.
	
	private int age;
	
	public Unit9_7ObjectSuperclass(int a) {
		age = a;
	}
	
	public String toString() {
		return "Age: "+age;
	}
	
	
}
