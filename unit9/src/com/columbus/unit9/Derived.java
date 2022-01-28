package com.columbus.unit9;

public class Derived extends Base{

//	public Derived() {
//		
//		System.out.print("Derived"+" ");
//	}
	
//	public Derived (String a, int b) {
//		apple=b;
//		super(a);
//	}
	
	public void calc(int n) {
		n+=2;
		super.calc(n);
		System.out.print(n+"delivered");
	}
	

}
