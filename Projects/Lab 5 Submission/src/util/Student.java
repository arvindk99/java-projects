package util;

class Student {

	 private int SID;
	 private int scores[] = new int[5];
	 
	 public Student() {}
	 public Student(int SID, int scores[]) {
		 this.SID = SID;
		 this.scores = scores;
		 
	 }
	
	//write public get and set methods for
	
	//SID and scores
	 
	 public void setSID(int SID) {
		 this.SID = SID;
	 }
	 
	 public void setScores(int scores[]) {
		 this.scores = scores;
	 }
	 
	 public int getSID() {
		 return SID;
	 }
	 
	
	 public int[] getScores() {
		 return scores;
	 } 
	 public int getIndividualScore(int a) {
		 return scores[a];
	 }
	
	//add methods to print values of instance variables.
	 
	 public void printStudentID() {
		 System.out.printf("Student ID: %d\n", getSID());
	 }
	 
	 public void printScores() {
		 System.out.printf("Student scores: ");
		 for(int i = 0; i < 5; i++) {
			 System.out.printf("Quiz %d: %d\n", i+1, scores[i]);
		 }
	 }

}