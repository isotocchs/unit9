
public class Unit9_1Musician extends Unit9_1Performer{
	
	private String intrument;
	// public String name;
	
	//Constructors are not inherited. Calls default constructor of superclass
	public Unit9_1Musician() {
		intrument="Piano";
	}
	
	public Unit9_1Musician(String inst) {
		super("John",67);
		intrument=inst;
		// name = "Apples";
	}
	
	//Call constructor of parent
	public Unit9_1Musician(String n, int a, String inst) {
		super(n,a);
		intrument=inst;
		// name = "Apples";
		

		
	}
	
	public Unit9_1Musician(String n, int a) {
		super(n,a);
	}

	public String getName() {
		return "BOB";
	}

	// public String getName(int a) {
	// 	return super.getName();
	// }
	
	public String getMusicianName() {
		return super.getName();
		
	}
	
	public String getInstrument() {
		return intrument;
	}
	
	public void perform() {
		System.out.println("I am performing! Musician");
		// super.perform();
	}
	
	public void playInstrument() {
		System.out.println("I am playing my instrument! Musician");
		super.practice();
	}

}