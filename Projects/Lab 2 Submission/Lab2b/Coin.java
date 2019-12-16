//Arvind Kumar
//October 3, 2019
//Lab 2a
//CIS 35a
//Coin Simulator


import java.util.Random;

public class Coin {
	
	public Coin() {
		toss();
	}
	
	private String sideUp;

	public void toss() {
		Random coinToss = new Random();
		double randomNumber; 
		
		randomNumber = coinToss.nextInt(2);
		if (randomNumber == 1) {
			sideUp = "head";
		}
		else {
			sideUp = "tail";
		}
	}
	
	public String getSideUp() {
		return sideUp;
	}
	
	
	public class Simulation {
		public void toss(Coin c) {

			int heads = 0;
			int tails = 0;
			
			for(int i =1; i <= 20; i++) {
				c.toss();
				if(c.getSideUp() == "head") {
					heads += 1;	
				}
				else {
					tails += 1;
				}
			}
			System.out.printf("\n\nOut of 20 tosses, "
					+ "there were " + heads +
					" heads, and there were " + tails + " tails.");
	}

	}	
}

