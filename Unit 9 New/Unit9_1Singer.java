public class Unit9_1Singer extends Unit9_1Musician{

    private String favSong;

    Unit9_1Singer(){
        favSong = "Blank Space";
    }

    Unit9_1Singer(String fav){
        favSong = fav;
    }
    Unit9_1Singer(String n, int a, String inst, String fav){
        super(n, a, inst);
        favSong = fav;
    }
    Unit9_1Singer(String n, int a, String inst){
        super(n, a, inst);
        favSong = "Blank Space";
    }

    public void sing(){
        System.out.println("I'm singing my favorite song "+favSong);
    }

    public String getSong(){
		return favSong;
	}

    public String toString(int nummber){
        return "Jamba Juice stores: "+nummber;
    }

    public void perform() {
		
		System.out.println("I am performing! Singer");
	}
    
}
