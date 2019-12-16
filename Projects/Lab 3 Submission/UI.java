import java.util.Scanner;

import com.sun.jdi.InvalidTypeException;


public class UI {
	public UI() {}
	
	//The function that collects all the inputs
	public void readInput(Franchise franchise) {
		
		Scanner object = new Scanner(System.in);
		int inputWeek;
		int inputOption;
		Store store;
		boolean quit = false;
		boolean validWeek = false;
		boolean validFunction = false;
		
		//Welcome message
		System.out.printf("Welcome to the Franchise App...\nWe have data for %d stores for the last %d weeks", 
				franchise.numberofstores(), franchise.getStores(0).getWeeks());
		
		
		
		
		//Checking to see if the chosen week is within the valid range
		do {
			System.out.printf("\nSelect a store # you want to see analytics for - enter <1 through 6>: ");
			inputWeek = object.nextInt();
				if(inputWeek>6 || inputWeek<0) {
					System.out.printf("Please enter a valid store");
				}
				else {
					validWeek = true;
				}
		}while(validWeek == false);
				
		
		//Assigning the store class the values that we get from the getStores method from the franchise class
		store = franchise.getStores(inputWeek-1);
		
		//Prints out the options Checks to see if the selected option is valid and if it is it calls the options function
		//for the UI
		do {
			System.out.printf("\nSelect operation, or press '8' to quit: ");
			options();
			
			do {
				inputOption = object.nextInt();
				if (inputOption<1 || inputOption>8) {
					System.out.printf("Invalid option, please enter a valid store.");
				}
				else {
					validFunction = true;
				}
				
			}while (validFunction == false);
			
			if(inputOption == 8) {
				System.out.printf("Goodbye!");
				quit = true;
			}
			
			else {
				store.print(inputOption);
			}
			
		}while(!quit);
		
	}
	
	

	//Function Printing out the UI with all the options
	public void options() {
		System.out.printf("\n\n1. Enter 1 for total sales for each week"
				+ "\n2. Enter 2 for average daily sales for each week"
				+ "\n3. Enter 3 for total sales for all weeks"
				+ "\n4. Enter 4 for average weekly sales"
				+ "\n5. Enter 5 for week with highest amount in sales"
				+ "\n6. Enter 6 for week with lowest amount in sales"
				+ "\n7. Enter 7 for all analytical data. (1 through 6)"
				+ "\n8. Exit App\n\n");
	}
}
	
