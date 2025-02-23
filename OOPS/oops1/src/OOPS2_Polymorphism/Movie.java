package OOPS2_Polymorphism;

public class Movie {
	public String fightScenes(int fightCount) {
		if(fightCount==6) {
			return "good";
		}
		else if(fightCount==4) {
			return "average";
		}
		else {
			return "Below Average";
		}
		
	}

}
