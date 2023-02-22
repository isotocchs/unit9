
public class Unit9_1Performer {
	
	private String name;
	private int age;
	
	//Constructors are not inherited
	public Unit9_1Performer() {
		name = "Performer";
		age = 18;
	}
	
	public Unit9_1Performer(String n, int a) {
		name = n;
		age = a;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void practice() {
		System.out.println("Honing my craft. Performer");
	}
	
	public void perform() {
		
		System.out.println("I am performing! Performer");
	}

}
