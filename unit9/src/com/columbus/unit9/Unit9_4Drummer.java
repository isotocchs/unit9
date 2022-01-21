package com.columbus.unit9;

public class Unit9_4Drummer extends Unit9_1Musician{
	
	private String name = "Bob";
	private String intrument = "drums";
	
	public Unit9_4Drummer(String n, int a) {
		super(n,a);
	}
	
	public String getName() {
		super.getName();
		return name;
	}

}
