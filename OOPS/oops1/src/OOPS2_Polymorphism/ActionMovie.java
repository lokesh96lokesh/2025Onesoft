package OOPS2_Polymorphism;

public class ActionMovie extends Movie{ 
	public String fightScenes(int fightCount) {
		if(fightCount==9) {
			return "good";
		}
		else if(fightCount==6) {
			return "Average";
		}
		else if(fightCount==4) {
			return "Below Average";
		}
		else {
			return "Bad";
		}
	}

}
