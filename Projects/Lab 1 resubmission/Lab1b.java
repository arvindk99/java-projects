//Arvind Kumar
//Sept 26, 2019
//Lab 1b
//CIS 35a
import java.util.Scanner;


public class Lab1b {

	public static void main(String[] args) {
		//Initializing input
		Scanner input = new Scanner(System.in);
		
		//Collecting the String
		System.out.print("Enter a string: ");
		String word = input.nextLine();
		
		//Collecting the character to check
		System.out.print("Enter a character: ");
		char letter = input.next().charAt(0);
		
		//Printing the number of occurrences
		System.out.println("In the word '" + word + "' there are " + count(word,letter) + " occurences of the letter '" + letter + "'.");

	}
	//Counting the number of chosen characters from the string
	public static int count(String str, char a)
	{
		int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a) 
            {
            	count++;
            }
	}
        return count;
	}

}

/* (Test Code)
 * 
 * <We are testing this code by first inputting a string and then a character,
 * to see how many iterations of the chosen characters there are.>
 * 
 * Enter a string: hello
Enter a character: l
In the word 'hello' there are 2 occurences of the letter 'l'.
 * 
 * 
 * Enter a string: welcome
Enter a character: e
In the word 'welcome' there are 2 occurences of the letter 'e'.
 */
