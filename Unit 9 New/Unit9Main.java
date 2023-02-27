
import java.util.ArrayList;


//Inheritance - build a hierarchy of classes that share characteristics.

//Superclass - parent
//Subclass - child (inherits all methods and attributes without duplicating code)

//Reasons

//Code reusability
//High level classes can be used in many situations.

//Prevent repeating code
//Common methods and variables are all in one place

//Organization
//Organized structure in your classes allows for easy identification.
//Also easier error correction

//Ease of maintenance
//When you want to change something you can easily find it.
//It is also faster to make changes if you only have to do it once in the parent class



public class Unit9Main {
	
	public static void main(String[] args) {

		System.out.println("-------------------------------------------------");
		
		Unit9_1Performer performer = new Unit9_1Performer();
		// System.out.println(performer.getName());
		Unit9_1Performer performer2 = new Unit9_1Performer("Guy",16);
		// System.out.println(performer2.getName());
		// performer2.perform();

		Unit9_1Musician musicMan = new Unit9_1Musician("Gus",21, "Guitar");
		// System.out.println(musicMan.getName());
		// System.out.println(musicMan.getInstrument());
		// musicMan.perform();

		Unit9_1Singer singMan = new Unit9_1Singer("John Elway",54,"Sax","California Girl");
		// System.out.println(singMan.name);
		// System.out.println(singMan.getInstrument());
		// singMan.perform();
		// singMan.practice();
		// singMan.sing();

		// System.out.println(singMan.name);







		// Unit9_1Singer singMan = new Unit9_1Singer("taylor",33,"throat","anti hero");

		
		// System.out.println(singMan.getName());
// singMan.perform();	
// performer.perform();
		// System.out.println(musicMan.getInstrument());
		// System.out.println(musicMan2.getAge());
		
		Unit9_3OverrideMethods overrideMan = new Unit9_3OverrideMethods("Bob",45);
		
		// System.out.println(overrideMan.getName());
		// System.out.println(overrideMan.name);
		// overrideMan.perform();
		// overrideMan.practice();
		
		ArrayList<String> oneliners = new ArrayList<String>();
		oneliners.add("this is funny");
		oneliners.add("Bob Stan");
		oneliners.add("applesauce");
		oneliners.add("something else");
		oneliners.add("google fiber");

		Unit9_6Entertainer Sally = new Unit9_6Comedian("Satire",oneliners);
		//Is this valid?
		// System.out.println(Sally.getTalent());
		//Why is this not valid?
		//Compile time (Unit9_6Entertainer) vs Run time (Unit9_6Comedian)
		// System.out.println(Sally.tellJoke());
		
		
		
		
		
		//We fix it by casting, careful with parenthesis
		//System.out.println(((Unit9_6Comedian) Sally).tellJoke());
		
		
		Unit9_7ObjectSuperclass objectStuff = new Unit9_7ObjectSuperclass(10);
		//System.out.println(objectStuff);
		//System.out.println(objectStuff.toString());
		//String apple = "Testing";
		
		Unit9_7ObjectSuperclass2 moreObjectStuff = new Unit9_7ObjectSuperclass2(25, "Bob");
		//System.out.println(moreObjectStuff);
		
		Unit9_7ObjectSuperclass objectStuff2 = new Unit9_7ObjectSuperclass(10);
		//by default .equals checks if the two variables refer to the same object.
		// We want it to check the info inside the object so we override.
		
		//System.out.println(objectStuff.equals(apple));
		
		//How would I add the equals method to Unit9_7ObjectSuperclass2 to compare names too?
		// Base d1 = new Derived();
		// d1.calc(2);

		System.out.println("-------------------------------------------------");

	}
}
