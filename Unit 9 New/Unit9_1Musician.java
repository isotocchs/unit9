
public class Unit9_1Musician extends Unit9_1Performer{
	
	private String intrument;
	
	//Constructors are not inherited. Calls default constructor of superclass
	public Unit9_1Musician() {
		intrument="Piano";
	}
	
	public Unit9_1Musician(String inst) {
		intrument=inst;
	}
	
	//Call constructor of parent
	public Unit9_1Musician(String n, int a, String inst) {
		super(n,a);
		intrument=inst;
		
		
	}
	
	public Unit9_1Musician(String n, int a) {
		super(n,a);
	}
	
	public String getName() {
		return super.getName();
		
	}
	
	public String getInstrument() {
		return intrument;
	}
	
	public void perform() {
		System.out.println("I am performing! Musician");
	}
	
	public void playInstrument() {
		System.out.println("I am playing my instrument! Musician");
		// super.practice();
	}

}