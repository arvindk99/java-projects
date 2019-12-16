public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO a1 = new FileIO("/Users/arvindkumar/Desktop/UCI/third year/De anza-Fall Quarter/Java/Lab3/src/Salesdat.txt");
		Franchise f = a1.readData();
		//compute Data for entire Franchise
		f.computeData();
		//Creates a UI instance and calls the readInput function that will carryout the UI
		UI ui = new UI();
		ui.readInput(f);
	}

}

/*
***************************************************************************************************
TEST CASE 1: ENTERING INTEGERS OUT OF THE RANGE OF POSSIBILITIES TO BOTH INPUTS
***************************************************************************************************
*
*
Welcome to the Franchise App...
We have data for 6 stores for the last 5 weeks
Select a store # you want to see analytics for - enter <1 through 6>: 8
Please enter a valid store
Select a store # you want to see analytics for - enter <1 through 6>: 6

Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

9
Invalid option, please enter a valid store.
8
Goodbye!
*/

/*
***************************************************************************************************
TEST CASE 2: EVERYTHING WORKS
***************************************************************************************************
*
Welcome to the Franchise App...
We have data for 6 stores for the last 5 weeks
Select a store # you want to see analytics for - enter <1 through 6>: 3

Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

1
Option 1 (Total Sales for each week): 
Week 1: 26912.45

Week 2: 58020.39

Week 3: 93391.34

Week 4: 133025.28

Week 5: 176922.17

Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

2
Option 2 (Avg Sales for each week): 
Week 1: 3844.64

Week 2: 8288.63

Week 3: 13341.62

Week 4: 19003.61

Week 5: 25274.60

Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

3
Option 3 (Total Sales for all weeks): $488271.63


Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

4
Option 4 (Average Sales of all weeks): $97654.33


Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

5
Option 5 (Week with highest sales amt): 5


Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

6
Option 6 (Week with lowest sales amt): 1


Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

7
Please select a valid choice.Option 1 (Total Sales for each week): 
Week 1: 26912.45

Week 2: 58020.39

Week 3: 93391.34

Week 4: 133025.28

Week 5: 176922.17
Option 2 (Avg Sales for each week): 
Week 1: 3844.64

Week 2: 8288.63

Week 3: 13341.62

Week 4: 19003.61

Week 5: 25274.60
Option 3 (Total Sales for all weeks): $488271.63

Option 4 (Average Sales of all weeks): $97654.33

Option 5 (Week with highest sales amt): 5

Option 6 (Week with lowest sales amt): 1


Select operation, or press '8' to quit: 

1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with highest amount in sales
6. Enter 6 for week with lowest amount in sales
7. Enter 7 for all analytical data. (1 through 6)
8. Exit App

8
Goodbye!
*/