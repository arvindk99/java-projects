
public class Driver {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount(2000);
		SavingsAccount s2 = new SavingsAccount(3000);
		
		System.out.printf("SAVER 1 4% INTEREST");
		s1.modifyInterestRate(.04);
		s1.calculateMonthlyInterest();

		
		System.out.printf("SAVER 2 4% INTEREST");
		s2.modifyInterestRate(.04);
		s2.calculateMonthlyInterest();
		
		
		System.out.printf("SAVER 1 5% INTEREST");
		s1.modifyInterestRate(.04);
		s1.calculateMonthlyInterest();

		
		System.out.printf("SAVER 2 5% INTEREST");
		s2.modifyInterestRate(.05);
		s2.calculateMonthlyInterest();
	}

}
