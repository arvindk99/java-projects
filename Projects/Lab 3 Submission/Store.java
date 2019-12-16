public class Store {
	private float salesbyweek[][];
	//The variables that we set to the calculations
	public static float totalsalesw[];
	public static float avgSalesEachW[];
	public static float totalSales;
	public static float avgWSales;
	public static int maxSalesWeek;
	public static int minSalesWeek;


	
	//determines the array size
	Store() {
		salesbyweek = new float[5][7];
	}

	//getters and setters
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		//Takes the sales values and stores them accordingly in the 2D array
		salesbyweek[week][day] = sale;
	}

	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//Gets number of weeks
	public int getWeeks() {
		return 5;
	}
	
	//gets salesbyweek, the array that stores all the sales
	public float [][] getsalesbyweek(){
		return salesbyweek;
	}
	//gets totalsalesw, the array that stores the calculations for the total sales of each week
	public float [] gettotalsalesforweek() {
		return totalsalesw;
	}
	//gets avgSalesEachW, the array that stores the calculations for the average sales for each week
	public float [] getavgsalesforweek() {
		return avgSalesEachW;
	}
	//gets totalSales, the variable that stores the calculation for the total sales
	public float gettotalsalesforallweeks() {
		return totalSales;
	}
	//gets avgWSales, the variable that stores the calculation for the average weekly sales
	public float getaverageweeklysales() {
		return avgWSales;
	}
	//gets maxSalesWeek, the variable that stores the calculation for the week with the highest sales amount
	public int getweekwithhighestsaleamt() {
		return maxSalesWeek;
	}
	//gets minSalesWeek, the variable that stores the calculation for the week with the lowest sales amount
	public int getweekwithlowestsaleamt() {
		return minSalesWeek;
	}
	
	
	
	//calculations for the total sales of each week
	public void totalsalesforweek(){
		totalsalesw = new float[5];
		float total = 0;
		for (int w =0; w<5; w++){
			for(int d = 0; d<7; d++){
				total+= salesbyweek[w][d];
			}
			totalsalesw[w] = total;
		}
	}
	//calculations for the average sales for each week
	public void avgsalesforweek() {
		avgSalesEachW = new float[5];
		for (int w=0; w<5; w++) {
			avgSalesEachW[w] = totalsalesw[w]/7;
		}

	}
	//the calculation for the total sales
	public void totalsalesforallweeks() {
		totalSales = 0;
		for (int w=0; w<5; w++) {
			totalSales+=totalsalesw[w];
		}
	}
	//the calculation for the average weekly sales
	public void averageweeklysales() {
		avgWSales = 0;
		avgWSales = totalSales/5;	
	}
	//the calculation for the week with the highest sales amount
	public void weekwithhighestsaleamt() {
		float max = totalsalesw[0];
		maxSalesWeek = 1;
		for (int w = 1; w <5; w++) {
			if(max < totalsalesw[w]) {
				max = totalsalesw[w];
				maxSalesWeek = w+1;
			}
		}
	}
	//the calculation for the week with the lowest sales amount
	public void weekwithlowestsaleamt() {
		float min = totalsalesw[0];
		minSalesWeek = 1;
		for (int w = 1; w <5; w++) {
			if(min > totalsalesw[w]) {
				min = totalsalesw[w];
				minSalesWeek = w+1;
			}
		}
	}
	
	//Carries out all the calculations
	public void analyzeresults () {
		totalsalesforweek();
		avgsalesforweek();
		totalsalesforallweeks();
		averageweeklysales();
		weekwithhighestsaleamt();
		weekwithlowestsaleamt();	
	}
	//Sets up the format for printing the two arrays of Option 1 and Option 2
	public void printWeekInfo(float[] array) {
		for (int w=0; w<5; w++) {
			System.out.printf("\nWeek %d: %.2f\n", w+1, array[w]);
		}
	}
	
	//Prints out the variables that stores all the calculations
	public void print(int i) {
		
		switch (i) {
		case 1:
			System.out.printf("Option 1 (Total Sales for each week): ");
			printWeekInfo(gettotalsalesforweek());
			break;
		case 2:
			System.out.printf("Option 2 (Avg Sales for each week): ");
			printWeekInfo(getavgsalesforweek());
			break;
		case 3:
			System.out.printf("Option 3 (Total Sales for all weeks): $%.2f\n\n", gettotalsalesforallweeks());
			break;
		case 4:
			System.out.printf("Option 4 (Average Sales of all weeks): $%.2f\n\n", getaverageweeklysales());
			break;
		case 5:
			System.out.printf("Option 5 (Week with highest sales amt): %d\n\n", getweekwithhighestsaleamt());
			break;
		case 6:
			System.out.printf("Option 6 (Week with lowest sales amt): %d\n\n", getweekwithlowestsaleamt());
			break;
		case 7:
			for (int options =0; options<7; options++) {
				print(options);
			}
			break;
			
			
			
		default:
			System.out.printf("Please select a valid choice.");
			break;

			


		}
	
	}
}
