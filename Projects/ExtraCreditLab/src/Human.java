import java.io.*;
import java.util.Scanner;
public class Human {
	public static void main(String[] args)throws IOException {
	Scanner object = new Scanner(System.in);
	String name;
	String age;
	String mood;
	
	System.out.printf("Enter name: ");
	name = object.nextLine();
	System.out.printf("Enter age: ");
	age = object.nextLine();
	System.out.printf("Enter mood (Happy, Sad, Angry): ");
	mood = object.nextLine();
	


		
	System.out.printf("\n\n*****MEET THE HUMAN*****");
	System.out.printf("\nName: %s", name);
	System.out.printf("\nAge: %s", age);
	System.out.printf("\nBehavior: %s", mood);
	System.out.printf("\nAwareness: " + thoughtArea.awareness(mood));
	System.out.printf("\nConcentration: " + thoughtArea.concentration(mood));
	System.out.printf("\nFocus: " + thoughtArea.focus(mood));
	
	}
}

/*
Enter name: Arvind Kumar
Enter age: 18
Enter mood (Happy, Sad, Angry): Sad


*****MEET THE HUMAN*****
Name: Arvind Kumar
Age: 18
Behavior: Sad
Awareness: Low
Concentration: Medium
Focus: High
*/

/*
Enter name: Billy Bob
Enter age: 56
Enter mood (Happy, Sad, Angry): Happy


*****MEET THE HUMAN*****
Name: Billy Bob
Age: 56
Behavior: Happy
Awareness: Medium
Concentration: High
Focus: Low
*/

/*
Enter name: Ana Stocks
Enter age: 29
Enter mood (Happy, Sad, Angry): Angry


*****MEET THE HUMAN*****
Name: Ana Stocks
Age: 29
Behavior: Angry
Awareness: High
Concentration: Low
Focus: Medium
*/