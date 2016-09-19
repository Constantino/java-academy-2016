package exercises;

public class EnumExample {

	public static enum LanguageLevels{
		A1,
		A2,
		B1,
		B2,
		C1,
		C2
	}
	
	public static enum Level{
		Beginner, 
		UpperBeginner, 
		Intermediate, 
		UpperIntermediate, 
		Advanced, 
		AdvancedPlus
	}
	
	public static void main(String[] args){
		
		System.out.println("I am a(n): "+getLevel(LanguageLevels.A2));
		
		System.out.println("***Levels available***");
		for(Level x : Level.values()){
			System.out.println(x);
		}
	}
	
	public static Level getLevel(LanguageLevels l){
		switch(l){
			case A1: 
				return Level.Beginner;
			case A2:
				return Level.UpperBeginner;
			case B1:
				return Level.Intermediate;
			case B2:
				return Level.UpperIntermediate;
			case C1:
				return Level.Advanced;
			case C2:
				return Level.AdvancedPlus;
		
		}
		return Level.Beginner;
	}
	
}

