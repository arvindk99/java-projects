package util;

class Statistics

{
	private int [] lowscores = new int [5];
	private int [] highscores = new int [5];
	private float [] avgscores = new float [5];
	
	public void setLowScores(int[] lowscores) {
		this.lowscores = lowscores;
	}
	
	public void setHighScores(int[] highscores) {
		this.highscores = highscores;
	}
	
	public void setAvgScores(float[] avgscores) {
		this.avgscores = avgscores;
	}
	
	public int[] getLowScores() {
		return lowscores;
	}
	
	public int[] getHighScores() {
		return highscores;
	}
	
	public float[] getavgscores() {
		return avgscores;
	}
	
	
	
	void findlow(Student [] a) {
	/* This method will find the lowest score and store it in an   array names lowscores. */
		int low = 101;
		
		for (int x = 0; x < 5; x++) {
			for(int y = 0; y < a.length; y++) {
				if(a[y].getIndividualScore(x) < low) {
					low = a[y].getIndividualScore(x);
				}
				
			}
			{
				lowscores[x] = low;
			}
		}
		
		
	}
	
	void findhigh(Student [] a) {
	/* This method will find the highest score and store it in an     array names highscores. */
		
		int high = 0;
		for (int x = 0; x < 5; x++) {
			for(int y = 0; y < a.length; y++) {
				if(a[y].getIndividualScore(x) > high) {
					high = a[y].getIndividualScore(x);
				}
				
			}
			{
				lowscores[x] = high;
			}
		}
		
	}
	
	void findavg(Student [] a) {
	/* This method will find avg score for each quiz and store it in an array names avgscores. */
		int sum = 0;
		int count = 0;
		for(int x = 0; x < 5; x++){
			for(int y=0; y<a.length; y++){
				sum += a[y].getIndividualScore(x);
				count++;
			}
			try {
				avgscores[x] = sum / count;
				} 
			catch (ArithmeticException e) {
			avgscores[x] = 0;	
		
		
			}
		}
	}
	
	
	public void printloworhighInfo(int[] array) {
		for (int w=0; w<5; w++) {
			System.out.printf("Quiz %d: %d\t", w+1, array[w]);
		}
	}
	
	public void printavgInfo(float[] array) {
		for (int w=0; w<5; w++) {
			System.out.printf("Quiz %d: %.2f\t", w+1, array[w]);
		}
	}
	
	
	//add methods to print values of instance variables 
	public void print(int i) //i=1 (low), i=2(high), i=3(avg) i= 4 printall i=0 - print nothing.
	{
		switch (i) {
		case 0:
			System.out.printf("You have chosen to print nothing.");
		case 1:
			System.out.printf("The Lowest scores per quiz: ");
			printloworhighInfo(getLowScores());
			break;
		case 2:
			System.out.printf("The Highest scores per quiz: ");
			printloworhighInfo(getHighScores());
			break;
		case 3:
			System.out.printf("The average scores per quiz: ");
			printavgInfo(getavgscores());
			break;
		case 4:
			for (int options =0; options<4; options++) {
				print(options);
		}
	}

	}

}