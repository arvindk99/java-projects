//Arvind Kumar
//Sept 26, 2019
//Lab 1a
//CIS 35a

import java.util.Scanner;


public class Lab1a {

	public static void main(String[] args) {
		//Setting up input
		Scanner input = new Scanner(System.in);
		
		//Collecting input for Loan
		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();
		
		//Collecting input for years
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		
		//Collecting input for annual rate
		System.out.print("Annual Interest Rate: ");
		double annualRate = input.nextDouble();
		
		
		if (loan < 0)
		{
			System.out.println("The loan has to be greater than 0.");
		}
		else if (years < 0)
		{
			System.out.println("There can't be negative years.");
		}
		else if (annualRate < 0)
		{
			System.out.println("The annual rate has to be greater than 0");
		}
		else
		{
			//Calculating monthly rate
			double monthlyRate = annualRate/1200;
			
			double balance = loan;
			double principal, interest;
			
			double monthlyPayment = monthlyPayment(loan, years, monthlyRate);
			//Calculating monthly Payment
					
			//Printing the Monthly payment
			System.out.println("\nMonthly payment: " + monthlyPayment);
					
			//Printing the Total payment
			System.out.println("Total payment: " + (monthlyPayment*12*years) + "\n");
					
			//Printing the labels for each column on the chart
			System.out.println("Payment#\tInterest\t\tPrincipal\t\tBalance");
					
			for (int i = 1; i <= years * 12; i++) {
					interest = monthlyRate * balance;
					principal = monthlyPayment - interest;
					balance = balance - principal;
					System.out.println(i + "\t\t" + interest
					+ "\t" + principal + "\t" + balance);
				}
		}
		
		

	}
	
	public static double monthlyPayment (double loan, int years, double monthlyRate) {
		double monthlyPayment = 
				loan * monthlyRate / (1-1/Math.pow(1+monthlyRate, years*12));
		return monthlyPayment;
	}
	
}



/*(Test Code)
 * 
 * <In this we test this loan value calculator by inputting a loan amount, the number of
 * years to close that loan, and the annual rate, and then letting it go through the equation
 * that we created.>
 * 
 * Loan Amount: 10000
Number of Years: 1
Annual Interest Rate: 7

Monthly payment: 865.2674609813786
Total payment: 10383.209531776543

Payment#	Interest		Principal		Balance
1		58.333333333333336	806.9341276480452	9193.065872351955
2		53.62621758871974	811.6412433926588	8381.424628959297
3		48.89164366892924	816.3758173124494	7565.048811646848
4		44.12945140127328	821.1380095801053	6743.910802066743
5		39.33947967872267	825.9279813026559	5917.982820764087
6		34.52156645445717	830.7458945269213	5087.236926237165
7		29.675548736383462	835.5919122449951	4251.64501399217
8		24.801262581620993	840.4661983997576	3411.1788155924123
9		19.89854309095574	845.3689178904228	2565.8098977019895
10		14.967224403261605	850.3002365781169	1715.5096611238725
11		10.007139689889257	855.2603212914893	860.2493398323833
12		5.018121149022236	860.2493398323563	2.6943780540023E-11
 * 
 */

/*
 * 
 * Loan Amount: -10000
Number of Years: 1
Annual Interest Rate: 7
The loan has to be greater than 0.

 * 
 * 
 */

/*
 * 
 * Loan Amount: 10000
Number of Years: -1
Annual Interest Rate: 7
There can't be negative years.
 * 
 */

/*
 * 
 * Loan Amount: 10000
Number of Years: 1
Annual Interest Rate: -01
The annual rate has to be greater than 0
 * 
 */
