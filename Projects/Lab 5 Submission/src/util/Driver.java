package util;
import java.util.Scanner;

public class Driver {
	
	
	public static void main(String[] args) {
		int optionSelection;
		Scanner object = new Scanner(System.in);
		Student lab5[] = new Student[40];
		//Populate the student array
		FileIO a1 = new FileIO();
		lab5 = a1.readFile("/Users/arvindkumar/Desktop/UCI/third year/De anza-Fall Quarter/Java/Lab5/src/StudentData.txt", lab5);

		Statistics statlab2 = new Statistics();
		statlab2.findlow(lab5);
		//add calls to findhigh and find average
		//Print the data and statistics
		statlab2.findhigh(lab5);
		statlab2.findavg(lab5);
		
		System.out.printf("Please select an option \n0.)To print nothing\n1.)For the quiz Lows\n2.)For the quiz highs"
				+ "\n3.)For the quiz averages\n4.)For printing everything");
		optionSelection =  object.nextInt();
		
		if (optionSelection > -1 && optionSelection < 5)
		{
			statlab2.print(optionSelection);
		
		}
		
	}
}