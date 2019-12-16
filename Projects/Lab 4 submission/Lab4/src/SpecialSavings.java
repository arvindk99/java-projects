public class SpecialSavings extends SavingsAccount
{
	public SpecialSavings(double x) {
		super(x);
	}

	protected void calcmonthlyInterest()
	{
		if(	getBalance() > 10000)
		{
			modifyInterestRate(.1);
		}
		else{
			modifyInterestRate(.04);
		}
		
			super.calculateMonthlyInterest();
	}
}